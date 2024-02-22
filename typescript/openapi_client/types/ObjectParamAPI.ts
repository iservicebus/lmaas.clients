import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { ChatCompletionReq } from '../models/ChatCompletionReq';
import { ChatText } from '../models/ChatText';
import { ChatTextList } from '../models/ChatTextList';
import { HTTPValidationError } from '../models/HTTPValidationError';
import { MaxTokens } from '../models/MaxTokens';
import { Model } from '../models/Model';
import { Stop } from '../models/Stop';
import { ValidationError } from '../models/ValidationError';
import { ValidationErrorLocInner } from '../models/ValidationErrorLocInner';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiChatCompletionChatCompletionPostRequest {
    /**
     * 
     * @type ChatCompletionReq
     * @memberof DefaultApichatCompletionChatCompletionPost
     */
    chatCompletionReq: ChatCompletionReq
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Chat Completion
     * @param param the request object
     */
    public chatCompletionChatCompletionPostWithHttpInfo(param: DefaultApiChatCompletionChatCompletionPostRequest, options?: Configuration): Promise<HttpInfo<any>> {
        return this.api.chatCompletionChatCompletionPostWithHttpInfo(param.chatCompletionReq,  options).toPromise();
    }

    /**
     * Chat Completion
     * @param param the request object
     */
    public chatCompletionChatCompletionPost(param: DefaultApiChatCompletionChatCompletionPostRequest, options?: Configuration): Promise<any> {
        return this.api.chatCompletionChatCompletionPost(param.chatCompletionReq,  options).toPromise();
    }

}
