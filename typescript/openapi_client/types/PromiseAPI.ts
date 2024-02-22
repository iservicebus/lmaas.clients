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
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Chat Completion
     * @param chatCompletionReq 
     */
    public chatCompletionChatCompletionPostWithHttpInfo(chatCompletionReq: ChatCompletionReq, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.chatCompletionChatCompletionPostWithHttpInfo(chatCompletionReq, _options);
        return result.toPromise();
    }

    /**
     * Chat Completion
     * @param chatCompletionReq 
     */
    public chatCompletionChatCompletionPost(chatCompletionReq: ChatCompletionReq, _options?: Configuration): Promise<any> {
        const result = this.api.chatCompletionChatCompletionPost(chatCompletionReq, _options);
        return result.toPromise();
    }


}



