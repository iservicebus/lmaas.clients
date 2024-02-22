import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { ChatCompletionReq } from '../models/ChatCompletionReq';
import { ChatText } from '../models/ChatText';
import { ChatTextList } from '../models/ChatTextList';
import { HTTPValidationError } from '../models/HTTPValidationError';
import { MaxTokens } from '../models/MaxTokens';
import { Model } from '../models/Model';
import { Stop } from '../models/Stop';
import { ValidationError } from '../models/ValidationError';
import { ValidationErrorLocInner } from '../models/ValidationErrorLocInner';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Chat Completion
     * @param chatCompletionReq 
     */
    public chatCompletionChatCompletionPostWithHttpInfo(chatCompletionReq: ChatCompletionReq, _options?: Configuration): Observable<HttpInfo<any>> {
        const requestContextPromise = this.requestFactory.chatCompletionChatCompletionPost(chatCompletionReq, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.chatCompletionChatCompletionPostWithHttpInfo(rsp)));
            }));
    }

    /**
     * Chat Completion
     * @param chatCompletionReq 
     */
    public chatCompletionChatCompletionPost(chatCompletionReq: ChatCompletionReq, _options?: Configuration): Observable<any> {
        return this.chatCompletionChatCompletionPostWithHttpInfo(chatCompletionReq, _options).pipe(map((apiResponse: HttpInfo<any>) => apiResponse.data));
    }

}
