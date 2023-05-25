package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * PatchPostRequest
 */

@JsonTypeName("PatchPost_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class PatchPostRequest {

  private Boolean isPinned;

  private String message;

  @Valid
  private List<String> fileIds;

  private Boolean hasReactions;

  private String props;

  public PatchPostRequest isPinned(Boolean isPinned) {
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

  public PatchPostRequest message(String message) {
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

  public PatchPostRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public PatchPostRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * The list of files attached to this post
   * @return fileIds
  */
  
  @Schema(name = "file_ids", description = "The list of files attached to this post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public PatchPostRequest hasReactions(Boolean hasReactions) {
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

  public PatchPostRequest props(String props) {
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
    PatchPostRequest patchPostRequest = (PatchPostRequest) o;
    return Objects.equals(this.isPinned, patchPostRequest.isPinned) &&
        Objects.equals(this.message, patchPostRequest.message) &&
        Objects.equals(this.fileIds, patchPostRequest.fileIds) &&
        Objects.equals(this.hasReactions, patchPostRequest.hasReactions) &&
        Objects.equals(this.props, patchPostRequest.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPinned, message, fileIds, hasReactions, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchPostRequest {\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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

