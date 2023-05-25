package com.leavetrail.chat.posts.dto;

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
 * Emoji
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class Emoji {

  private String id;

  private String creatorId;

  private String name;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  public Emoji id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the emoji
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the emoji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Emoji creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * The ID of the user that made the emoji
   * @return creatorId
  */
  
  @Schema(name = "creator_id", description = "The ID of the user that made the emoji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator_id")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public Emoji name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the emoji
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the emoji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Emoji createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds the emoji was made
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds the emoji was made", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Emoji updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds the emoji was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds the emoji was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public Emoji deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds the emoji was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds the emoji was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emoji emoji = (Emoji) o;
    return Objects.equals(this.id, emoji.id) &&
        Objects.equals(this.creatorId, emoji.creatorId) &&
        Objects.equals(this.name, emoji.name) &&
        Objects.equals(this.createAt, emoji.createAt) &&
        Objects.equals(this.updateAt, emoji.updateAt) &&
        Objects.equals(this.deleteAt, emoji.deleteAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorId, name, createAt, updateAt, deleteAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emoji {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
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

