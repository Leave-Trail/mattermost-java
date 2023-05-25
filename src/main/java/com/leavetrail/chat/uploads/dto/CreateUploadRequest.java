package com.leavetrail.chat.uploads.dto;

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
 * CreateUploadRequest
 */

@JsonTypeName("CreateUpload_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:44:08.300294+02:00[Europe/Warsaw]")
public class CreateUploadRequest {

  private String channelId;

  private String filename;

  private Long fileSize;

  /**
   * Default constructor
   * @deprecated Use {@link CreateUploadRequest#CreateUploadRequest(String, String, Long)}
   */
  @Deprecated
  public CreateUploadRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUploadRequest(String channelId, String filename, Long fileSize) {
    this.channelId = channelId;
    this.filename = filename;
    this.fileSize = fileSize;
  }

  public CreateUploadRequest channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID of the channel to upload to.
   * @return channelId
  */
  @NotNull 
  @Schema(name = "channel_id", description = "The ID of the channel to upload to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file to upload.
   * @return filename
  */
  @NotNull 
  @Schema(name = "filename", description = "The name of the file to upload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public CreateUploadRequest fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The size of the file to upload in bytes.
   * @return fileSize
  */
  @NotNull 
  @Schema(name = "file_size", description = "The size of the file to upload in bytes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_size")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadRequest createUploadRequest = (CreateUploadRequest) o;
    return Objects.equals(this.channelId, createUploadRequest.channelId) &&
        Objects.equals(this.filename, createUploadRequest.filename) &&
        Objects.equals(this.fileSize, createUploadRequest.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, filename, fileSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadRequest {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

