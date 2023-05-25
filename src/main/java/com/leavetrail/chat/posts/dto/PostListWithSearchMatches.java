package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.leavetrail.chat.posts.dto.Post;
import com.fasterxml.jackson.annotation.JsonCreator;

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
 * PostListWithSearchMatches
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class PostListWithSearchMatches {

  @Valid
  private List<String> order;

  @Valid
  private Map<String, Post> posts = new HashMap<>();

  @Valid
  private Map<String, List<String>> matches = new HashMap<>();

  public PostListWithSearchMatches order(List<String> order) {
    this.order = order;
    return this;
  }

  public PostListWithSearchMatches addOrderItem(String orderItem) {
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

  public PostListWithSearchMatches posts(Map<String, Post> posts) {
    this.posts = posts;
    return this;
  }

  public PostListWithSearchMatches putPostsItem(String key, Post postsItem) {
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

  public PostListWithSearchMatches matches(Map<String, List<String>> matches) {
    this.matches = matches;
    return this;
  }

  public PostListWithSearchMatches putMatchesItem(String key, List<String> matchesItem) {
    if (this.matches == null) {
      this.matches = new HashMap<>();
    }
    this.matches.put(key, matchesItem);
    return this;
  }

  /**
   * A mapping of post IDs to a list of matched terms within the post. This field will only be populated on servers running version 5.1 or greater with Elasticsearch enabled.
   * @return matches
  */
  @Valid 
  @Schema(name = "matches", example = "{\"post_id1\":[\"search match 1\",\"search match 2\"]}", description = "A mapping of post IDs to a list of matched terms within the post. This field will only be populated on servers running version 5.1 or greater with Elasticsearch enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matches")
  public Map<String, List<String>> getMatches() {
    return matches;
  }

  public void setMatches(Map<String, List<String>> matches) {
    this.matches = matches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostListWithSearchMatches postListWithSearchMatches = (PostListWithSearchMatches) o;
    return Objects.equals(this.order, postListWithSearchMatches.order) &&
        Objects.equals(this.posts, postListWithSearchMatches.posts) &&
        Objects.equals(this.matches, postListWithSearchMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, posts, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostListWithSearchMatches {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

