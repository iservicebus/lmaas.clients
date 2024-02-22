/*
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ChatTextList;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;
import java.time.format.DateTimeFormatter;

/**
 * ChatCompletionReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-18T22:37:19.055682-05:00[America/New_York]")
public class ChatCompletionReq {
  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  private Integer maxTokens;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("0.2");

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP = new BigDecimal("0.95");

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private String stop;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = "5ffa5d5b-5faa-4f6b-bf43-5dcecf932269";

  public static final String SERIALIZED_NAME_REQ_TIME = "req_time";
  @SerializedName(SERIALIZED_NAME_REQ_TIME)
  private OffsetDateTime reqTime = OffsetDateTime.now();
  
  //OffsetDateTime.parse("2024-02-18T21", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH"));


  public static final String SERIALIZED_NAME_TEXT_LIST = "text_list";
  @SerializedName(SERIALIZED_NAME_TEXT_LIST)
  private ChatTextList textList;

  public ChatCompletionReq() {
  }

  public ChatCompletionReq maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * Get maxTokens
   * @return maxTokens
  **/
  @javax.annotation.Nullable
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  public ChatCompletionReq temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * Get temperature
   * @return temperature
  **/
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public ChatCompletionReq topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * Get topP
   * @return topP
  **/
  @javax.annotation.Nullable
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  public ChatCompletionReq stop(String stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @javax.annotation.Nullable
  public String getStop() {
    return stop;
  }

  public void setStop(String stop) {
    this.stop = stop;
  }


  public ChatCompletionReq model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public ChatCompletionReq id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ChatCompletionReq reqTime(OffsetDateTime reqTime) {
    this.reqTime = reqTime;
    return this;
  }

   /**
   * Get reqTime
   * @return reqTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getReqTime() {
    return reqTime;
  }

  public void setReqTime(OffsetDateTime reqTime) {
    this.reqTime = reqTime;
  }


  public ChatCompletionReq textList(ChatTextList textList) {
    this.textList = textList;
    return this;
  }

   /**
   * Get textList
   * @return textList
  **/
  @javax.annotation.Nonnull
  public ChatTextList getTextList() {
    return textList;
  }

  public void setTextList(ChatTextList textList) {
    this.textList = textList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionReq chatCompletionReq = (ChatCompletionReq) o;
    return Objects.equals(this.maxTokens, chatCompletionReq.maxTokens) &&
        Objects.equals(this.temperature, chatCompletionReq.temperature) &&
        Objects.equals(this.topP, chatCompletionReq.topP) &&
        Objects.equals(this.stop, chatCompletionReq.stop) &&
        Objects.equals(this.model, chatCompletionReq.model) &&
        Objects.equals(this.id, chatCompletionReq.id) &&
        Objects.equals(this.reqTime, chatCompletionReq.reqTime) &&
        Objects.equals(this.textList, chatCompletionReq.textList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxTokens, temperature, topP, stop, model, id, reqTime, textList);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionReq {\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reqTime: ").append(toIndentedString(reqTime)).append("\n");
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("max_tokens");
    openapiFields.add("temperature");
    openapiFields.add("top_p");
    openapiFields.add("stop");
    openapiFields.add("model");
    openapiFields.add("id");
    openapiFields.add("req_time");
    openapiFields.add("text_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text_list");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionReq
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionReq is not found in the empty JSON string", ChatCompletionReq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChatCompletionReq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatCompletionReq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatCompletionReq.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stop") != null && !jsonObj.get("stop").isJsonNull()) && !jsonObj.get("stop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `text_list`
      ChatTextList.validateJsonElement(jsonObj.get("text_list"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionReq.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionReq>() {
           @Override
           public void write(JsonWriter out, ChatCompletionReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatCompletionReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatCompletionReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionReq
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionReq
  */
  public static ChatCompletionReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionReq.class);
  }

 /**
  * Convert an instance of ChatCompletionReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

