package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.posts.dto.CreatePostEphemeralRequestPost;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreatePostEphemeralRequest
 */

@JsonTypeName("CreatePostEphemeral_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class CreatePostEphemeralRequest {

  private String userId;

  private CreatePostEphemeralRequestPost post;

  /**
   * Default constructor
   * @deprecated Use {@link CreatePostEphemeralRequest#CreatePostEphemeralRequest(String, CreatePostEphemeralRequestPost)}
   */
  @Deprecated
  public CreatePostEphemeralRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreatePostEphemeralRequest(String userId, CreatePostEphemeralRequestPost post) {
    this.userId = userId;
    this.post = post;
  }

  public CreatePostEphemeralRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The target user id for the ephemeral post
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", description = "The target user id for the ephemeral post", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CreatePostEphemeralRequest post(CreatePostEphemeralRequestPost post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @NotNull @Valid 
  @Schema(name = "post", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("post")
  public CreatePostEphemeralRequestPost getPost() {
    return post;
  }

  public void setPost(CreatePostEphemeralRequestPost post) {
    this.post = post;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostEphemeralRequest createPostEphemeralRequest = (CreatePostEphemeralRequest) o;
    return Objects.equals(this.userId, createPostEphemeralRequest.userId) &&
        Objects.equals(this.post, createPostEphemeralRequest.post);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, post);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostEphemeralRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
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

