package com.leavetrail.chat.bots.dto;

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
 * A bot account
 */

@Schema(name = "Bot", description = "A bot account")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T13:58:19.652456+02:00[Europe/Warsaw]")
public class Bot {

  private String userId;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private String username;

  private String displayName;

  private String description;

  private String ownerId;

  public Bot userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user id of the associated user entry.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The user id of the associated user entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Bot createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a bot was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a bot was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Bot updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a bot was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a bot was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public Bot deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a bot was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a bot was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public Bot username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Bot displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Bot description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bot ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The user id of the user that currently owns this bot.
   * @return ownerId
  */
  
  @Schema(name = "owner_id", description = "The user id of the user that currently owns this bot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_id")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bot bot = (Bot) o;
    return Objects.equals(this.userId, bot.userId) &&
        Objects.equals(this.createAt, bot.createAt) &&
        Objects.equals(this.updateAt, bot.updateAt) &&
        Objects.equals(this.deleteAt, bot.deleteAt) &&
        Objects.equals(this.username, bot.username) &&
        Objects.equals(this.displayName, bot.displayName) &&
        Objects.equals(this.description, bot.description) &&
        Objects.equals(this.ownerId, bot.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, createAt, updateAt, deleteAt, username, displayName, description, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bot {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

