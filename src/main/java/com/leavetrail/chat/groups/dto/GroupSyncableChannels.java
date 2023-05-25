package com.leavetrail.chat.groups.dto;

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
 * GroupSyncableChannels
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GroupSyncableChannels {

  private String channelId;

  private String channelDisplayName;

  private String channelType;

  private String teamId;

  private String teamDisplayName;

  private String teamType;

  private String groupId;

  private Boolean autoAdd;

  private Long createAt;

  private Long deleteAt;

  private Long updateAt;

  public GroupSyncableChannels channelId(String channelId) {
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

  public GroupSyncableChannels channelDisplayName(String channelDisplayName) {
    this.channelDisplayName = channelDisplayName;
    return this;
  }

  /**
   * Get channelDisplayName
   * @return channelDisplayName
  */
  
  @Schema(name = "channel_display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_display_name")
  public String getChannelDisplayName() {
    return channelDisplayName;
  }

  public void setChannelDisplayName(String channelDisplayName) {
    this.channelDisplayName = channelDisplayName;
  }

  public GroupSyncableChannels channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

  /**
   * Get channelType
   * @return channelType
  */
  
  @Schema(name = "channel_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_type")
  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public GroupSyncableChannels teamId(String teamId) {
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

  public GroupSyncableChannels teamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
    return this;
  }

  /**
   * Get teamDisplayName
   * @return teamDisplayName
  */
  
  @Schema(name = "team_display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_display_name")
  public String getTeamDisplayName() {
    return teamDisplayName;
  }

  public void setTeamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
  }

  public GroupSyncableChannels teamType(String teamType) {
    this.teamType = teamType;
    return this;
  }

  /**
   * Get teamType
   * @return teamType
  */
  
  @Schema(name = "team_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_type")
  public String getTeamType() {
    return teamType;
  }

  public void setTeamType(String teamType) {
    this.teamType = teamType;
  }

  public GroupSyncableChannels groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  
  @Schema(name = "group_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group_id")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GroupSyncableChannels autoAdd(Boolean autoAdd) {
    this.autoAdd = autoAdd;
    return this;
  }

  /**
   * Get autoAdd
   * @return autoAdd
  */
  
  @Schema(name = "auto_add", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_add")
  public Boolean getAutoAdd() {
    return autoAdd;
  }

  public void setAutoAdd(Boolean autoAdd) {
    this.autoAdd = autoAdd;
  }

  public GroupSyncableChannels createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * Get createAt
   * @return createAt
  */
  
  @Schema(name = "create_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public GroupSyncableChannels deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * Get deleteAt
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public GroupSyncableChannels updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * Get updateAt
   * @return updateAt
  */
  
  @Schema(name = "update_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupSyncableChannels groupSyncableChannels = (GroupSyncableChannels) o;
    return Objects.equals(this.channelId, groupSyncableChannels.channelId) &&
        Objects.equals(this.channelDisplayName, groupSyncableChannels.channelDisplayName) &&
        Objects.equals(this.channelType, groupSyncableChannels.channelType) &&
        Objects.equals(this.teamId, groupSyncableChannels.teamId) &&
        Objects.equals(this.teamDisplayName, groupSyncableChannels.teamDisplayName) &&
        Objects.equals(this.teamType, groupSyncableChannels.teamType) &&
        Objects.equals(this.groupId, groupSyncableChannels.groupId) &&
        Objects.equals(this.autoAdd, groupSyncableChannels.autoAdd) &&
        Objects.equals(this.createAt, groupSyncableChannels.createAt) &&
        Objects.equals(this.deleteAt, groupSyncableChannels.deleteAt) &&
        Objects.equals(this.updateAt, groupSyncableChannels.updateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelDisplayName, channelType, teamId, teamDisplayName, teamType, groupId, autoAdd, createAt, deleteAt, updateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSyncableChannels {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelDisplayName: ").append(toIndentedString(channelDisplayName)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
    sb.append("    teamType: ").append(toIndentedString(teamType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    autoAdd: ").append(toIndentedString(autoAdd)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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

