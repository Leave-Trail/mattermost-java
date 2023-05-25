package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.posts.dto.CreatePostRequestMetadata;
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
 * CreatePostRequest
 */

@JsonTypeName("CreatePost_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class CreatePostRequest {

  private String channelId;

  private String message;

  private String rootId;

  @Valid
  private List<String> fileIds;

  private Object props;

  private CreatePostRequestMetadata metadata;

  /**
   * Default constructor
   * @deprecated Use {@link CreatePostRequest#CreatePostRequest(String, String)}
   */
  @Deprecated
  public CreatePostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreatePostRequest(String channelId, String message) {
    this.channelId = channelId;
    this.message = message;
  }

  public CreatePostRequest channelId(String channelId) {
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

  public CreatePostRequest message(String message) {
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

  public CreatePostRequest rootId(String rootId) {
    this.rootId = rootId;
    return this;
  }

  /**
   * The post ID to comment on
   * @return rootId
  */
  
  @Schema(name = "root_id", description = "The post ID to comment on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root_id")
  public String getRootId() {
    return rootId;
  }

  public void setRootId(String rootId) {
    this.rootId = rootId;
  }

  public CreatePostRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreatePostRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of file IDs to associate with the post. Note that posts are limited to 5 files maximum. Please use additional posts for more files.
   * @return fileIds
  */
  
  @Schema(name = "file_ids", description = "A list of file IDs to associate with the post. Note that posts are limited to 5 files maximum. Please use additional posts for more files.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreatePostRequest props(Object props) {
    this.props = props;
    return this;
  }

  /**
   * A general JSON property bag to attach to the post
   * @return props
  */
  
  @Schema(name = "props", description = "A general JSON property bag to attach to the post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public Object getProps() {
    return props;
  }

  public void setProps(Object props) {
    this.props = props;
  }

  public CreatePostRequest metadata(CreatePostRequestMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public CreatePostRequestMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CreatePostRequestMetadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostRequest createPostRequest = (CreatePostRequest) o;
    return Objects.equals(this.channelId, createPostRequest.channelId) &&
        Objects.equals(this.message, createPostRequest.message) &&
        Objects.equals(this.rootId, createPostRequest.rootId) &&
        Objects.equals(this.fileIds, createPostRequest.fileIds) &&
        Objects.equals(this.props, createPostRequest.props) &&
        Objects.equals(this.metadata, createPostRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, message, rootId, fileIds, props, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequest {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

