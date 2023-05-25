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
 * GroupSyncableTeam
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GroupSyncableTeam {

  private String teamId;

  private String groupId;

  private Boolean autoAdd;

  private Long createAt;

  private Long deleteAt;

  private Long updateAt;

  public GroupSyncableTeam teamId(String teamId) {
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

  public GroupSyncableTeam groupId(String groupId) {
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

  public GroupSyncableTeam autoAdd(Boolean autoAdd) {
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

  public GroupSyncableTeam createAt(Long createAt) {
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

  public GroupSyncableTeam deleteAt(Long deleteAt) {
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

  public GroupSyncableTeam updateAt(Long updateAt) {
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
    GroupSyncableTeam groupSyncableTeam = (GroupSyncableTeam) o;
    return Objects.equals(this.teamId, groupSyncableTeam.teamId) &&
        Objects.equals(this.groupId, groupSyncableTeam.groupId) &&
        Objects.equals(this.autoAdd, groupSyncableTeam.autoAdd) &&
        Objects.equals(this.createAt, groupSyncableTeam.createAt) &&
        Objects.equals(this.deleteAt, groupSyncableTeam.deleteAt) &&
        Objects.equals(this.updateAt, groupSyncableTeam.updateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, groupId, autoAdd, createAt, deleteAt, updateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSyncableTeam {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

