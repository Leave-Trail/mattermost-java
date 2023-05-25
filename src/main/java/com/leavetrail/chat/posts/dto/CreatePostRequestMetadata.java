package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.posts.dto.CreatePostRequestMetadataPriority;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A JSON object to add post metadata, e.g the post&#39;s priority
 */

@Schema(name = "CreatePost_request_metadata", description = "A JSON object to add post metadata, e.g the post's priority")
@JsonTypeName("CreatePost_request_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class CreatePostRequestMetadata {

  private CreatePostRequestMetadataPriority priority;

  public CreatePostRequestMetadata priority(CreatePostRequestMetadataPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public CreatePostRequestMetadataPriority getPriority() {
    return priority;
  }

  public void setPriority(CreatePostRequestMetadataPriority priority) {
    this.priority = priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostRequestMetadata createPostRequestMetadata = (CreatePostRequestMetadata) o;
    return Objects.equals(this.priority, createPostRequestMetadata.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequestMetadata {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

