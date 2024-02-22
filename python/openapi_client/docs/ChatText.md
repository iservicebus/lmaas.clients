# ChatText

Represents a single message in a conversation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** |  | [optional] [default to 'system']
**content** | **object** |  | 
**generated** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.chat_text import ChatText

# TODO update the JSON string below
json = "{}"
# create an instance of ChatText from a JSON string
chat_text_instance = ChatText.from_json(json)
# print the JSON string representation of the object
print ChatText.to_json()

# convert the object into a dict
chat_text_dict = chat_text_instance.to_dict()
# create an instance of ChatText from a dict
chat_text_form_dict = chat_text.from_dict(chat_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


