/**
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ChatTextList } from '../models/ChatTextList';
import { MaxTokens } from '../models/MaxTokens';
import { Model } from '../models/Model';
import { Stop } from '../models/Stop';
import { HttpFile } from '../http/http';

export class ChatCompletionReq {
    'maxTokens'?: MaxTokens;
    'temperature'?: number;
    'topP'?: number;
    'stop'?: Stop;
    'model'?: Model;
    'id'?: string;
    'reqTime'?: Date;
    'textList': ChatTextList;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "maxTokens",
            "baseName": "max_tokens",
            "type": "MaxTokens",
            "format": ""
        },
        {
            "name": "temperature",
            "baseName": "temperature",
            "type": "number",
            "format": ""
        },
        {
            "name": "topP",
            "baseName": "top_p",
            "type": "number",
            "format": ""
        },
        {
            "name": "stop",
            "baseName": "stop",
            "type": "Stop",
            "format": ""
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "Model",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "reqTime",
            "baseName": "req_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "textList",
            "baseName": "text_list",
            "type": "ChatTextList",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionReq.attributeTypeMap;
    }

    public constructor() {
    }
}

