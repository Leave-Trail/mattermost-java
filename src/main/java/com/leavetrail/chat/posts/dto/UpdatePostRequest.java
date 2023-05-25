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
 * UpdatePostRequest
 */

@JsonTypeName("UpdatePost_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class UpdatePostRequest {

  private String id;

  private Boolean isPinned;

  private String message;

  private Boolean hasReactions;

  private String props;

  /**
   * Default constructor
   * @deprecated Use {@link UpdatePostRequest#UpdatePostRequest(String)}
   */
  @Deprecated
  public UpdatePostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdatePostRequest(String id) {
    this.id = id;
  }

  public UpdatePostRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the post to update
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "ID of the post to update", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatePostRequest isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * Set to `true` to pin the post to the channel it is in
   * @return isPinned
  */
  
  @Schema(name = "is_pinned", description = "Set to `true` to pin the post to the channel it is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pinned")
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public UpdatePostRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message text of the post
   * @return message
  */
  
  @Schema(name = "message", description = "The message text of the post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UpdatePostRequest hasReactions(Boolean hasReactions) {
    this.hasReactions = hasReactions;
    return this;
  }

  /**
   * Set to `true` if the post has reactions to it
   * @return hasReactions
  */
  
  @Schema(name = "has_reactions", description = "Set to `true` if the post has reactions to it", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_reactions")
  public Boolean getHasReactions() {
    return hasReactions;
  }

  public void setHasReactions(Boolean hasReactions) {
    this.hasReactions = hasReactions;
  }

  public UpdatePostRequest props(String props) {
    this.props = props;
    return this;
  }

  /**
   * A general JSON property bag to attach to the post
   * @return props
  */
  
  @Schema(name = "props", description = "A general JSON property bag to attach to the post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public String getProps() {
    return props;
  }

  public void setProps(String props) {
    this.props = props;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePostRequest updatePostRequest = (UpdatePostRequest) o;
    return Objects.equals(this.id, updatePostRequest.id) &&
        Objects.equals(this.isPinned, updatePostRequest.isPinned) &&
        Objects.equals(this.message, updatePostRequest.message) &&
        Objects.equals(this.hasReactions, updatePostRequest.hasReactions) &&
        Objects.equals(this.props, updatePostRequest.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isPinned, message, hasReactions, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePostRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    hasReactions: ").append(toIndentedString(hasReactions)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

