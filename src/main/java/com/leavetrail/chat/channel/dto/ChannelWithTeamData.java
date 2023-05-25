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
 * ChannelWithTeamData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class ChannelWithTeamData {

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

  private String teamDisplayName;

  private String teamName;

  private Integer teamUpdateAt;

  private String policyId;

  public ChannelWithTeamData id(String id) {
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

  public ChannelWithTeamData createAt(Long createAt) {
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

  public ChannelWithTeamData updateAt(Long updateAt) {
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

  public ChannelWithTeamData deleteAt(Long deleteAt) {
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

  public ChannelWithTeamData teamId(String teamId) {
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

  public ChannelWithTeamData type(String type) {
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

  public ChannelWithTeamData displayName(String displayName) {
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

  public ChannelWithTeamData name(String name) {
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

  public ChannelWithTeamData header(String header) {
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

  public ChannelWithTeamData purpose(String purpose) {
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

  public ChannelWithTeamData lastPostAt(Integer lastPostAt) {
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

  public ChannelWithTeamData totalMsgCount(Integer totalMsgCount) {
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

  public ChannelWithTeamData extraUpdateAt(Long extraUpdateAt) {
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

  public ChannelWithTeamData creatorId(String creatorId) {
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

  public ChannelWithTeamData teamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
    return this;
  }

  /**
   * The display name of the team to which this channel belongs.
   * @return teamDisplayName
  */
  
  @Schema(name = "team_display_name", description = "The display name of the team to which this channel belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_display_name")
  public String getTeamDisplayName() {
    return teamDisplayName;
  }

  public void setTeamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
  }

  public ChannelWithTeamData teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * The name of the team to which this channel belongs.
   * @return teamName
  */
  
  @Schema(name = "team_name", description = "The name of the team to which this channel belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_name")
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public ChannelWithTeamData teamUpdateAt(Integer teamUpdateAt) {
    this.teamUpdateAt = teamUpdateAt;
    return this;
  }

  /**
   * The time at which the team to which this channel belongs was last updated.
   * @return teamUpdateAt
  */
  
  @Schema(name = "team_update_at", description = "The time at which the team to which this channel belongs was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_update_at")
  public Integer getTeamUpdateAt() {
    return teamUpdateAt;
  }

  public void setTeamUpdateAt(Integer teamUpdateAt) {
    this.teamUpdateAt = teamUpdateAt;
  }

  public ChannelWithTeamData policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the `sysconsole_read_compliance_data_retention` permission, this field will be null.
   * @return policyId
  */
  
  @Schema(name = "policy_id", description = "The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the `sysconsole_read_compliance_data_retention` permission, this field will be null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy_id")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelWithTeamData channelWithTeamData = (ChannelWithTeamData) o;
    return Objects.equals(this.id, channelWithTeamData.id) &&
        Objects.equals(this.createAt, channelWithTeamData.createAt) &&
        Objects.equals(this.updateAt, channelWithTeamData.updateAt) &&
        Objects.equals(this.deleteAt, channelWithTeamData.deleteAt) &&
        Objects.equals(this.teamId, channelWithTeamData.teamId) &&
        Objects.equals(this.type, channelWithTeamData.type) &&
        Objects.equals(this.displayName, channelWithTeamData.displayName) &&
        Objects.equals(this.name, channelWithTeamData.name) &&
        Objects.equals(this.header, channelWithTeamData.header) &&
        Objects.equals(this.purpose, channelWithTeamData.purpose) &&
        Objects.equals(this.lastPostAt, channelWithTeamData.lastPostAt) &&
        Objects.equals(this.totalMsgCount, channelWithTeamData.totalMsgCount) &&
        Objects.equals(this.extraUpdateAt, channelWithTeamData.extraUpdateAt) &&
        Objects.equals(this.creatorId, channelWithTeamData.creatorId) &&
        Objects.equals(this.teamDisplayName, channelWithTeamData.teamDisplayName) &&
        Objects.equals(this.teamName, channelWithTeamData.teamName) &&
        Objects.equals(this.teamUpdateAt, channelWithTeamData.teamUpdateAt) &&
        Objects.equals(this.policyId, channelWithTeamData.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, teamId, type, displayName, name, header, purpose, lastPostAt, totalMsgCount, extraUpdateAt, creatorId, teamDisplayName, teamName, teamUpdateAt, policyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelWithTeamData {\n");
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
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamUpdateAt: ").append(toIndentedString(teamUpdateAt)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

