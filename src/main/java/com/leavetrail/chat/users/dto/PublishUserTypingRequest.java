package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PublishUserTypingRequest
 */

@JsonTypeName("PublishUserTyping_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class PublishUserTypingRequest {

  private String channelId;

  private String parentId;

  /**
   * Default constructor
   * @deprecated Use {@link PublishUserTypingRequest#PublishUserTypingRequest(String)}
   */
  @Deprecated
  public PublishUserTypingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PublishUserTypingRequest(String channelId) {
    this.channelId = channelId;
  }

  public PublishUserTypingRequest channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The id of the channel to which to direct the typing event.
   * @return channelId
  */
  @NotNull 
  @Schema(name = "channel_id", description = "The id of the channel to which to direct the typing event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public PublishUserTypingRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The optional id of the root post of the thread to which the user is replying. If unset, the typing event is directed at the entire channel.
   * @return parentId
  */
  
  @Schema(name = "parent_id", description = "The optional id of the root post of the thread to which the user is replying. If unset, the typing event is directed at the entire channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishUserTypingRequest publishUserTypingRequest = (PublishUserTypingRequest) o;
    return Objects.equals(this.channelId, publishUserTypingRequest.channelId) &&
        Objects.equals(this.parentId, publishUserTypingRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishUserTypingRequest {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
}

