package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.posts.dto.PostMetadata;
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
 * Post
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class Post {

  private String id;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private Long editAt;

  private String userId;

  private String channelId;

  private String rootId;

  private String originalId;

  private String message;

  private String type;

  private Object props;

  private String hashtag;

  @Valid
  private List<String> fileIds;

  private String pendingPostId;

  private PostMetadata metadata;

  public Post id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Post createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a post was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a post was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Post updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a post was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a post was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public Post deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a post was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a post was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public Post editAt(Long editAt) {
    this.editAt = editAt;
    return this;
  }

  /**
   * Get editAt
   * @return editAt
  */
  
  @Schema(name = "edit_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit_at")
  public Long getEditAt() {
    return editAt;
  }

  public void setEditAt(Long editAt) {
    this.editAt = editAt;
  }

  public Post userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Post channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
  */
  
  @Schema(name = "channel_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public Post rootId(String rootId) {
    this.rootId = rootId;
    return this;
  }

  /**
   * Get rootId
   * @return rootId
  */
  
  @Schema(name = "root_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root_id")
  public String getRootId() {
    return rootId;
  }

  public void setRootId(String rootId) {
    this.rootId = rootId;
  }

  public Post originalId(String originalId) {
    this.originalId = originalId;
    return this;
  }

  /**
   * Get originalId
   * @return originalId
  */
  
  @Schema(name = "original_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("original_id")
  public String getOriginalId() {
    return originalId;
  }

  public void setOriginalId(String originalId) {
    this.originalId = originalId;
  }

  public Post message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Post type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Post props(Object props) {
    this.props = props;
    return this;
  }

  /**
   * Get props
   * @return props
  */
  
  @Schema(name = "props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public Object getProps() {
    return props;
  }

  public void setProps(Object props) {
    this.props = props;
  }

  public Post hashtag(String hashtag) {
    this.hashtag = hashtag;
    return this;
  }

  /**
   * Get hashtag
   * @return hashtag
  */
  
  @Schema(name = "hashtag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashtag")
  public String getHashtag() {
    return hashtag;
  }

  public void setHashtag(String hashtag) {
    this.hashtag = hashtag;
  }

  public Post fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public Post addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * Get fileIds
   * @return fileIds
  */
  
  @Schema(name = "file_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public Post pendingPostId(String pendingPostId) {
    this.pendingPostId = pendingPostId;
    return this;
  }

  /**
   * Get pendingPostId
   * @return pendingPostId
  */
  
  @Schema(name = "pending_post_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pending_post_id")
  public String getPendingPostId() {
    return pendingPostId;
  }

  public void setPendingPostId(String pendingPostId) {
    this.pendingPostId = pendingPostId;
  }

  public Post metadata(PostMetadata metadata) {
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
  public PostMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(PostMetadata metadata) {
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
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.createAt, post.createAt) &&
        Objects.equals(this.updateAt, post.updateAt) &&
        Objects.equals(this.deleteAt, post.deleteAt) &&
        Objects.equals(this.editAt, post.editAt) &&
        Objects.equals(this.userId, post.userId) &&
        Objects.equals(this.channelId, post.channelId) &&
        Objects.equals(this.rootId, post.rootId) &&
        Objects.equals(this.originalId, post.originalId) &&
        Objects.equals(this.message, post.message) &&
        Objects.equals(this.type, post.type) &&
        Objects.equals(this.props, post.props) &&
        Objects.equals(this.hashtag, post.hashtag) &&
        Objects.equals(this.fileIds, post.fileIds) &&
        Objects.equals(this.pendingPostId, post.pendingPostId) &&
        Objects.equals(this.metadata, post.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, editAt, userId, channelId, rootId, originalId, message, type, props, hashtag, fileIds, pendingPostId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    editAt: ").append(toIndentedString(editAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    originalId: ").append(toIndentedString(originalId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    hashtag: ").append(toIndentedString(hashtag)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    pendingPostId: ").append(toIndentedString(pendingPostId)).append("\n");
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

