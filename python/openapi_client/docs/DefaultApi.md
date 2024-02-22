# openapi_client.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_completion_chat_completion_post**](DefaultApi.md#chat_completion_chat_completion_post) | **POST** /chat/completion | Chat Completion


# **chat_completion_chat_completion_post**
> object chat_completion_chat_completion_post(chat_completion_req)

Chat Completion

### Example


```python
import openapi_client
from openapi_client.models.chat_completion_req import ChatCompletionReq
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    chat_completion_req = {"text_list":{"messages":[{"role":"user","content":"Not working"},{"role":"system","content":"Try again?"}]}} # ChatCompletionReq | 

    try:
        # Chat Completion
        api_response = api_instance.chat_completion_chat_completion_post(chat_completion_req)
        print("The response of DefaultApi->chat_completion_chat_completion_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->chat_completion_chat_completion_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_completion_req** | [**ChatCompletionReq**](ChatCompletionReq.md)|  | 

### Return type

**object**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

