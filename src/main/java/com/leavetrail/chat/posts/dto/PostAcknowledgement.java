package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostAcknowledgement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class PostAcknowledgement {

  private String userId;

  private String postId;

  private Long acknowledgedAt;

  public PostAcknowledgement userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user that made this acknowledgement.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of the user that made this acknowledgement.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public PostAcknowledgement postId(String postId) {
    this.postId = postId;
    return this;
  }

  /**
   * The ID of the post to which this acknowledgement was made.
   * @return postId
  */
  
  @Schema(name = "post_id", description = "The ID of the post to which this acknowledgement was made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post_id")
  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public PostAcknowledgement acknowledgedAt(Long acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

  /**
   * The time in milliseconds in which this acknowledgement was made.
   * @return acknowledgedAt
  */
  
  @Schema(name = "acknowledged_at", description = "The time in milliseconds in which this acknowledgement was made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledged_at")
  public Long getAcknowledgedAt() {
    return acknowledgedAt;
  }

  public void setAcknowledgedAt(Long acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAcknowledgement postAcknowledgement = (PostAcknowledgement) o;
    return Objects.equals(this.userId, postAcknowledgement.userId) &&
        Objects.equals(this.postId, postAcknowledgement.postId) &&
        Objects.equals(this.acknowledgedAt, postAcknowledgement.acknowledgedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, postId, acknowledgedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAcknowledgement {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
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

