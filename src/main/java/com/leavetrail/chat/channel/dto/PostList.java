package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.posts.dto.Post;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class PostList {

  @Valid
  private List<String> order;

  @Valid
  private Map<String, Post> posts = new HashMap<>();

  private String nextPostId;

  private String prevPostId;

  private Boolean hasNext;

  public PostList order(List<String> order) {
    this.order = order;
    return this;
  }

  public PostList addOrderItem(String orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
  */
  
  @Schema(name = "order", example = "[\"post_id1\",\"post_id12\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public List<String> getOrder() {
    return order;
  }

  public void setOrder(List<String> order) {
    this.order = order;
  }

  public PostList posts(Map<String, Post> posts) {
    this.posts = posts;
    return this;
  }

  public PostList putPostsItem(String key, Post postsItem) {
    if (this.posts == null) {
      this.posts = new HashMap<>();
    }
    this.posts.put(key, postsItem);
    return this;
  }

  /**
   * Get posts
   * @return posts
  */
  @Valid 
  @Schema(name = "posts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posts")
  public Map<String, Post> getPosts() {
    return posts;
  }

  public void setPosts(Map<String, Post> posts) {
    this.posts = posts;
  }

  public PostList nextPostId(String nextPostId) {
    this.nextPostId = nextPostId;
    return this;
  }

  /**
   * The ID of next post. Not omitted when empty or not relevant.
   * @return nextPostId
  */
  
  @Schema(name = "next_post_id", description = "The ID of next post. Not omitted when empty or not relevant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_post_id")
  public String getNextPostId() {
    return nextPostId;
  }

  public void setNextPostId(String nextPostId) {
    this.nextPostId = nextPostId;
  }

  public PostList prevPostId(String prevPostId) {
    this.prevPostId = prevPostId;
    return this;
  }

  /**
   * The ID of previous post. Not omitted when empty or not relevant.
   * @return prevPostId
  */
  
  @Schema(name = "prev_post_id", description = "The ID of previous post. Not omitted when empty or not relevant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev_post_id")
  public String getPrevPostId() {
    return prevPostId;
  }

  public void setPrevPostId(String prevPostId) {
    this.prevPostId = prevPostId;
  }

  public PostList hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

  /**
   * Whether there are more items after this page.
   * @return hasNext
  */
  
  @Schema(name = "has_next", description = "Whether there are more items after this page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_next")
  public Boolean getHasNext() {
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostList postList = (PostList) o;
    return Objects.equals(this.order, postList.order) &&
        Objects.equals(this.posts, postList.posts) &&
        Objects.equals(this.nextPostId, postList.nextPostId) &&
        Objects.equals(this.prevPostId, postList.prevPostId) &&
        Objects.equals(this.hasNext, postList.hasNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, posts, nextPostId, prevPostId, hasNext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostList {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    nextPostId: ").append(toIndentedString(nextPostId)).append("\n");
    sb.append("    prevPostId: ").append(toIndentedString(prevPostId)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
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

