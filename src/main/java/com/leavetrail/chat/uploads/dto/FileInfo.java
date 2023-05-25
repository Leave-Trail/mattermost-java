package com.leavetrail.chat.uploads.dto;

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
 * FileInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:44:08.300294+02:00[Europe/Warsaw]")
public class FileInfo {

  private String id;

  private String userId;

  private String postId;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private String name;

  private String extension;

  private Integer size;

  private String mimeType;

  private Integer width;

  private Integer height;

  private Boolean hasPreviewImage;

  public FileInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this file
   * @return id
  */
  
  @Schema(name = "id", description = "The unique identifier for this file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user that uploaded this file
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of the user that uploaded this file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public FileInfo postId(String postId) {
    this.postId = postId;
    return this;
  }

  /**
   * If this file is attached to a post, the ID of that post
   * @return postId
  */
  
  @Schema(name = "post_id", description = "If this file is attached to a post, the ID of that post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post_id")
  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public FileInfo createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a file was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a file was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public FileInfo updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a file was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a file was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public FileInfo deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a file was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a file was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public FileInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the file
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileInfo extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extension at the end of the file name
   * @return extension
  */
  
  @Schema(name = "extension", description = "The extension at the end of the file name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public FileInfo size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the file in bytes
   * @return size
  */
  
  @Schema(name = "size", description = "The size of the file in bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public FileInfo mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the file
   * @return mimeType
  */
  
  @Schema(name = "mime_type", description = "The MIME type of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mime_type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public FileInfo width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * If this file is an image, the width of the file
   * @return width
  */
  
  @Schema(name = "width", description = "If this file is an image, the width of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public FileInfo height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * If this file is an image, the height of the file
   * @return height
  */
  
  @Schema(name = "height", description = "If this file is an image, the height of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public FileInfo hasPreviewImage(Boolean hasPreviewImage) {
    this.hasPreviewImage = hasPreviewImage;
    return this;
  }

  /**
   * If this file is an image, whether or not it has a preview-sized version
   * @return hasPreviewImage
  */
  
  @Schema(name = "has_preview_image", description = "If this file is an image, whether or not it has a preview-sized version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_preview_image")
  public Boolean getHasPreviewImage() {
    return hasPreviewImage;
  }

  public void setHasPreviewImage(Boolean hasPreviewImage) {
    this.hasPreviewImage = hasPreviewImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInfo fileInfo = (FileInfo) o;
    return Objects.equals(this.id, fileInfo.id) &&
        Objects.equals(this.userId, fileInfo.userId) &&
        Objects.equals(this.postId, fileInfo.postId) &&
        Objects.equals(this.createAt, fileInfo.createAt) &&
        Objects.equals(this.updateAt, fileInfo.updateAt) &&
        Objects.equals(this.deleteAt, fileInfo.deleteAt) &&
        Objects.equals(this.name, fileInfo.name) &&
        Objects.equals(this.extension, fileInfo.extension) &&
        Objects.equals(this.size, fileInfo.size) &&
        Objects.equals(this.mimeType, fileInfo.mimeType) &&
        Objects.equals(this.width, fileInfo.width) &&
        Objects.equals(this.height, fileInfo.height) &&
        Objects.equals(this.hasPreviewImage, fileInfo.hasPreviewImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, postId, createAt, updateAt, deleteAt, name, extension, size, mimeType, width, height, hasPreviewImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hasPreviewImage: ").append(toIndentedString(hasPreviewImage)).append("\n");
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

