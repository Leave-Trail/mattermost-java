package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.users.dto.ChannelNotifyProps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChannelMemberWithTeamData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class ChannelMemberWithTeamData {

  private String channelId;

  private String userId;

  private String roles;

  private Long lastViewedAt;

  private Integer msgCount;

  private Integer mentionCount;

  private ChannelNotifyProps notifyProps;

  private Long lastUpdateAt;

  private String teamDisplayName;

  private String teamName;

  private Integer teamUpdateAt;

  public ChannelMemberWithTeamData channelId(String channelId) {
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

  public ChannelMemberWithTeamData userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ChannelMemberWithTeamData roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public ChannelMemberWithTeamData lastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * The time in milliseconds the channel was last viewed by the user
   * @return lastViewedAt
  */
  
  @Schema(name = "last_viewed_at", description = "The time in milliseconds the channel was last viewed by the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_viewed_at")
  public Long getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  public ChannelMemberWithTeamData msgCount(Integer msgCount) {
    this.msgCount = msgCount;
    return this;
  }

  /**
   * Get msgCount
   * @return msgCount
  */
  
  @Schema(name = "msg_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_count")
  public Integer getMsgCount() {
    return msgCount;
  }

  public void setMsgCount(Integer msgCount) {
    this.msgCount = msgCount;
  }

  public ChannelMemberWithTeamData mentionCount(Integer mentionCount) {
    this.mentionCount = mentionCount;
    return this;
  }

  /**
   * Get mentionCount
   * @return mentionCount
  */
  
  @Schema(name = "mention_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mention_count")
  public Integer getMentionCount() {
    return mentionCount;
  }

  public void setMentionCount(Integer mentionCount) {
    this.mentionCount = mentionCount;
  }

  public ChannelMemberWithTeamData notifyProps(ChannelNotifyProps notifyProps) {
    this.notifyProps = notifyProps;
    return this;
  }

  /**
   * Get notifyProps
   * @return notifyProps
  */
  @Valid 
  @Schema(name = "notify_props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify_props")
  public ChannelNotifyProps getNotifyProps() {
    return notifyProps;
  }

  public void setNotifyProps(ChannelNotifyProps notifyProps) {
    this.notifyProps = notifyProps;
  }

  public ChannelMemberWithTeamData lastUpdateAt(Long lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
    return this;
  }

  /**
   * The time in milliseconds the channel member was last updated
   * @return lastUpdateAt
  */
  
  @Schema(name = "last_update_at", description = "The time in milliseconds the channel member was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_update_at")
  public Long getLastUpdateAt() {
    return lastUpdateAt;
  }

  public void setLastUpdateAt(Long lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
  }

  public ChannelMemberWithTeamData teamDisplayName(String teamDisplayName) {
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

  public ChannelMemberWithTeamData teamName(String teamName) {
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

  public ChannelMemberWithTeamData teamUpdateAt(Integer teamUpdateAt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMemberWithTeamData channelMemberWithTeamData = (ChannelMemberWithTeamData) o;
    return Objects.equals(this.channelId, channelMemberWithTeamData.channelId) &&
        Objects.equals(this.userId, channelMemberWithTeamData.userId) &&
        Objects.equals(this.roles, channelMemberWithTeamData.roles) &&
        Objects.equals(this.lastViewedAt, channelMemberWithTeamData.lastViewedAt) &&
        Objects.equals(this.msgCount, channelMemberWithTeamData.msgCount) &&
        Objects.equals(this.mentionCount, channelMemberWithTeamData.mentionCount) &&
        Objects.equals(this.notifyProps, channelMemberWithTeamData.notifyProps) &&
        Objects.equals(this.lastUpdateAt, channelMemberWithTeamData.lastUpdateAt) &&
        Objects.equals(this.teamDisplayName, channelMemberWithTeamData.teamDisplayName) &&
        Objects.equals(this.teamName, channelMemberWithTeamData.teamName) &&
        Objects.equals(this.teamUpdateAt, channelMemberWithTeamData.teamUpdateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, userId, roles, lastViewedAt, msgCount, mentionCount, notifyProps, lastUpdateAt, teamDisplayName, teamName, teamUpdateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelMemberWithTeamData {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
    sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamUpdateAt: ").append(toIndentedString(teamUpdateAt)).append("\n");
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

