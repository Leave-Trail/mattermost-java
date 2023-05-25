package com.leavetrail.chat.posts.dto;

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
 * Post object to create
 */

@Schema(name = "CreatePostEphemeral_request_post", description = "Post object to create")
@JsonTypeName("CreatePostEphemeral_request_post")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class CreatePostEphemeralRequestPost {

  private String channelId;

  private String message;

  /**
   * Default constructor
   * @deprecated Use {@link CreatePostEphemeralRequestPost#CreatePostEphemeralRequestPost(String, String)}
   */
  @Deprecated
  public CreatePostEphemeralRequestPost() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreatePostEphemeralRequestPost(String channelId, String message) {
    this.channelId = channelId;
    this.message = message;
  }

  public CreatePostEphemeralRequestPost channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The channel ID to post in
   * @return channelId
  */
  @NotNull 
  @Schema(name = "channel_id", description = "The channel ID to post in", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CreatePostEphemeralRequestPost message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message contents, can be formatted with Markdown
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "The message contents, can be formatted with Markdown", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostEphemeralRequestPost createPostEphemeralRequestPost = (CreatePostEphemeralRequestPost) o;
    return Objects.equals(this.channelId, createPostEphemeralRequestPost.channelId) &&
        Objects.equals(this.message, createPostEphemeralRequestPost.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostEphemeralRequestPost {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

