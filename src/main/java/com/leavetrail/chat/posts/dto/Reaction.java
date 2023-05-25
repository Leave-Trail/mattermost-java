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
 * Reaction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class Reaction {

  private String userId;

  private String postId;

  private String emojiName;

  private Long createAt;

  public Reaction userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user that made this reaction
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of the user that made this reaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Reaction postId(String postId) {
    this.postId = postId;
    return this;
  }

  /**
   * The ID of the post to which this reaction was made
   * @return postId
  */
  
  @Schema(name = "post_id", description = "The ID of the post to which this reaction was made", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post_id")
  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public Reaction emojiName(String emojiName) {
    this.emojiName = emojiName;
    return this;
  }

  /**
   * The name of the emoji that was used for this reaction
   * @return emojiName
  */
  
  @Schema(name = "emoji_name", description = "The name of the emoji that was used for this reaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emoji_name")
  public String getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

  public Reaction createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds this reaction was made
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds this reaction was made", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reaction reaction = (Reaction) o;
    return Objects.equals(this.userId, reaction.userId) &&
        Objects.equals(this.postId, reaction.postId) &&
        Objects.equals(this.emojiName, reaction.emojiName) &&
        Objects.equals(this.createAt, reaction.createAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, postId, emojiName, createAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reaction {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    emojiName: ").append(toIndentedString(emojiName)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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

