package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * an object containing information used to keep track of a file upload.
 */

@Schema(name = "UploadSession", description = "an object containing information used to keep track of a file upload.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UploadSession {

  private String id;

  /**
   * The type of the upload.
   */
  public enum TypeEnum {
    ATTACHMENT("attachment"),
    
    IMPORT("import");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private Long createAt;

  private String userId;

  private String channelId;

  private String filename;

  private Long fileSize;

  private Long fileOffset;

  public UploadSession id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the upload.
   * @return id
  */
  
  @Schema(name = "id", description = "The unique identifier for the upload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UploadSession type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the upload.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the upload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UploadSession createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time the upload was created in milliseconds.
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time the upload was created in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public UploadSession userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user performing the upload.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of the user performing the upload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UploadSession channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID of the channel to upload to.
   * @return channelId
  */
  
  @Schema(name = "channel_id", description = "The ID of the channel to upload to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public UploadSession filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file to upload.
   * @return filename
  */
  
  @Schema(name = "filename", description = "The name of the file to upload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UploadSession fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The size of the file to upload in bytes.
   * @return fileSize
  */
  
  @Schema(name = "file_size", description = "The size of the file to upload in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_size")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public UploadSession fileOffset(Long fileOffset) {
    this.fileOffset = fileOffset;
    return this;
  }

  /**
   * The amount of data uploaded in bytes.
   * @return fileOffset
  */
  
  @Schema(name = "file_offset", description = "The amount of data uploaded in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_offset")
  public Long getFileOffset() {
    return fileOffset;
  }

  public void setFileOffset(Long fileOffset) {
    this.fileOffset = fileOffset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSession uploadSession = (UploadSession) o;
    return Objects.equals(this.id, uploadSession.id) &&
        Objects.equals(this.type, uploadSession.type) &&
        Objects.equals(this.createAt, uploadSession.createAt) &&
        Objects.equals(this.userId, uploadSession.userId) &&
        Objects.equals(this.channelId, uploadSession.channelId) &&
        Objects.equals(this.filename, uploadSession.filename) &&
        Objects.equals(this.fileSize, uploadSession.fileSize) &&
        Objects.equals(this.fileOffset, uploadSession.fileOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createAt, userId, channelId, filename, fileSize, fileOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileOffset: ").append(toIndentedString(fileOffset)).append("\n");
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

