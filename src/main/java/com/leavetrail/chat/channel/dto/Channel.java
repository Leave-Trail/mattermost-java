package com.leavetrail.chat.channel.dto;

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
 * Channel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class Channel {

  private String id;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private String teamId;

  private String type;

  private String displayName;

  private String name;

  private String header;

  private String purpose;

  private Integer lastPostAt;

  private Integer totalMsgCount;

  private Long extraUpdateAt;

  private String creatorId;

  public Channel id(String id) {
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

  public Channel createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a channel was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a channel was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Channel updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a channel was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a channel was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public Channel deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a channel was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a channel was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public Channel teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  */
  
  @Schema(name = "team_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public Channel type(String type) {
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

  public Channel displayName(String displayName) {
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

  public Channel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Channel header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  */
  
  @Schema(name = "header", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Channel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  */
  
  @Schema(name = "purpose", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Channel lastPostAt(Integer lastPostAt) {
    this.lastPostAt = lastPostAt;
    return this;
  }

  /**
   * The time in milliseconds of the last post of a channel
   * @return lastPostAt
  */
  
  @Schema(name = "last_post_at", description = "The time in milliseconds of the last post of a channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_post_at")
  public Integer getLastPostAt() {
    return lastPostAt;
  }

  public void setLastPostAt(Integer lastPostAt) {
    this.lastPostAt = lastPostAt;
  }

  public Channel totalMsgCount(Integer totalMsgCount) {
    this.totalMsgCount = totalMsgCount;
    return this;
  }

  /**
   * Get totalMsgCount
   * @return totalMsgCount
  */
  
  @Schema(name = "total_msg_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_msg_count")
  public Integer getTotalMsgCount() {
    return totalMsgCount;
  }

  public void setTotalMsgCount(Integer totalMsgCount) {
    this.totalMsgCount = totalMsgCount;
  }

  public Channel extraUpdateAt(Long extraUpdateAt) {
    this.extraUpdateAt = extraUpdateAt;
    return this;
  }

  /**
   * Deprecated in Mattermost 5.0 release
   * @return extraUpdateAt
  */
  
  @Schema(name = "extra_update_at", description = "Deprecated in Mattermost 5.0 release", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_update_at")
  public Long getExtraUpdateAt() {
    return extraUpdateAt;
  }

  public void setExtraUpdateAt(Long extraUpdateAt) {
    this.extraUpdateAt = extraUpdateAt;
  }

  public Channel creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
  */
  
  @Schema(name = "creator_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator_id")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.createAt, channel.createAt) &&
        Objects.equals(this.updateAt, channel.updateAt) &&
        Objects.equals(this.deleteAt, channel.deleteAt) &&
        Objects.equals(this.teamId, channel.teamId) &&
        Objects.equals(this.type, channel.type) &&
        Objects.equals(this.displayName, channel.displayName) &&
        Objects.equals(this.name, channel.name) &&
        Objects.equals(this.header, channel.header) &&
        Objects.equals(this.purpose, channel.purpose) &&
        Objects.equals(this.lastPostAt, channel.lastPostAt) &&
        Objects.equals(this.totalMsgCount, channel.totalMsgCount) &&
        Objects.equals(this.extraUpdateAt, channel.extraUpdateAt) &&
        Objects.equals(this.creatorId, channel.creatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, teamId, type, displayName, name, header, purpose, lastPostAt, totalMsgCount, extraUpdateAt, creatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    lastPostAt: ").append(toIndentedString(lastPostAt)).append("\n");
    sb.append("    totalMsgCount: ").append(toIndentedString(totalMsgCount)).append("\n");
    sb.append("    extraUpdateAt: ").append(toIndentedString(extraUpdateAt)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
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

