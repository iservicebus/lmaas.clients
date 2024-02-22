# .DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatCompletionChatCompletionPost**](DefaultApi.md#chatCompletionChatCompletionPost) | **POST** /chat/completion | Chat Completion


# **chatCompletionChatCompletionPost**
> any chatCompletionChatCompletionPost(chatCompletionReq)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DefaultApi(configuration);

let body:.DefaultApiChatCompletionChatCompletionPostRequest = {
  // ChatCompletionReq
  chatCompletionReq: null,
};

apiInstance.chatCompletionChatCompletionPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatCompletionReq** | **ChatCompletionReq**|  |


### Return type

**any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


