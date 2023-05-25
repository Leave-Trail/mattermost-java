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
 * GroupSyncableChannel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GroupSyncableChannel {

  private String channelId;

  private String groupId;

  private Boolean autoAdd;

  private Long createAt;

  private Long deleteAt;

  private Long updateAt;

  public GroupSyncableChannel channelId(String channelId) {
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

  public GroupSyncableChannel groupId(String groupId) {
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

  public GroupSyncableChannel autoAdd(Boolean autoAdd) {
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

  public GroupSyncableChannel createAt(Long createAt) {
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

  public GroupSyncableChannel deleteAt(Long deleteAt) {
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

  public GroupSyncableChannel updateAt(Long updateAt) {
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
    GroupSyncableChannel groupSyncableChannel = (GroupSyncableChannel) o;
    return Objects.equals(this.channelId, groupSyncableChannel.channelId) &&
        Objects.equals(this.groupId, groupSyncableChannel.groupId) &&
        Objects.equals(this.autoAdd, groupSyncableChannel.autoAdd) &&
        Objects.equals(this.createAt, groupSyncableChannel.createAt) &&
        Objects.equals(this.deleteAt, groupSyncableChannel.deleteAt) &&
        Objects.equals(this.updateAt, groupSyncableChannel.updateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, groupId, autoAdd, createAt, deleteAt, updateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSyncableChannel {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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

