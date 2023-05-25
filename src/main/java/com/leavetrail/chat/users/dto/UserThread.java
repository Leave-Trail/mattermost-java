package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.posts.dto.Post;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * a thread that user is following
 */

@Schema(name = "UserThread", description = "a thread that user is following")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:27:21.756932+02:00[Europe/Warsaw]")
public class UserThread {

  private String id;

  private Integer replyCount;

  private Long lastReplyAt;

  private Long lastViewedAt;

  @Valid
  private List<@Valid Post> participants;

  private Post post;

  public UserThread id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the post that is this thread's root
   * @return id
  */
  
  @Schema(name = "id", description = "ID of the post that is this thread's root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserThread replyCount(Integer replyCount) {
    this.replyCount = replyCount;
    return this;
  }

  /**
   * number of replies in this thread
   * @return replyCount
  */
  
  @Schema(name = "reply_count", description = "number of replies in this thread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reply_count")
  public Integer getReplyCount() {
    return replyCount;
  }

  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }

  public UserThread lastReplyAt(Long lastReplyAt) {
    this.lastReplyAt = lastReplyAt;
    return this;
  }

  /**
   * timestamp of the last post to this thread
   * @return lastReplyAt
  */
  
  @Schema(name = "last_reply_at", description = "timestamp of the last post to this thread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_reply_at")
  public Long getLastReplyAt() {
    return lastReplyAt;
  }

  public void setLastReplyAt(Long lastReplyAt) {
    this.lastReplyAt = lastReplyAt;
  }

  public UserThread lastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * timestamp of the last time the user viewed this thread
   * @return lastViewedAt
  */
  
  @Schema(name = "last_viewed_at", description = "timestamp of the last time the user viewed this thread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_viewed_at")
  public Long getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  public UserThread participants(List<@Valid Post> participants) {
    this.participants = participants;
    return this;
  }

  public UserThread addParticipantsItem(Post participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * list of users participating in this thread. only includes IDs unless 'extended' was set to 'true'
   * @return participants
  */
  @Valid 
  @Schema(name = "participants", description = "list of users participating in this thread. only includes IDs unless 'extended' was set to 'true'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("participants")
  public List<@Valid Post> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid Post> participants) {
    this.participants = participants;
  }

  public UserThread post(Post post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @Valid 
  @Schema(name = "post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post")
  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
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
    UserThread userThread = (UserThread) o;
    return Objects.equals(this.id, userThread.id) &&
        Objects.equals(this.replyCount, userThread.replyCount) &&
        Objects.equals(this.lastReplyAt, userThread.lastReplyAt) &&
        Objects.equals(this.lastViewedAt, userThread.lastViewedAt) &&
        Objects.equals(this.participants, userThread.participants) &&
        Objects.equals(this.post, userThread.post);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replyCount, lastReplyAt, lastViewedAt, participants, post);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserThread {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
    sb.append("    lastReplyAt: ").append(toIndentedString(lastReplyAt)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

