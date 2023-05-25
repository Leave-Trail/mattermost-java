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
 * Post priority set for this post. This field will be null if no priority metadata has been set. 
 */

@Schema(name = "PostMetadata_priority", description = "Post priority set for this post. This field will be null if no priority metadata has been set. ")
@JsonTypeName("PostMetadata_priority")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class PostMetadataPriority {

  private String priority;

  private Boolean requestedAck;

  public PostMetadataPriority priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority label of a post, could be either empty, important, or urgent.
   * @return priority
  */
  
  @Schema(name = "priority", description = "The priority label of a post, could be either empty, important, or urgent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public PostMetadataPriority requestedAck(Boolean requestedAck) {
    this.requestedAck = requestedAck;
    return this;
  }

  /**
   * Whether the post author has requested for acknowledgements or not.
   * @return requestedAck
  */
  
  @Schema(name = "requested_ack", description = "Whether the post author has requested for acknowledgements or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_ack")
  public Boolean getRequestedAck() {
    return requestedAck;
  }

  public void setRequestedAck(Boolean requestedAck) {
    this.requestedAck = requestedAck;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMetadataPriority postMetadataPriority = (PostMetadataPriority) o;
    return Objects.equals(this.priority, postMetadataPriority.priority) &&
        Objects.equals(this.requestedAck, postMetadataPriority.requestedAck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, requestedAck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMetadataPriority {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedAck: ").append(toIndentedString(requestedAck)).append("\n");
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

