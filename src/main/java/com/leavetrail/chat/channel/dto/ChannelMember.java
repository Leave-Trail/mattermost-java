package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.channel.dto.ChannelNotifyProps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChannelMember
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class ChannelMember {

  private String channelId;

  private String userId;

  private String roles;

  private Long lastViewedAt;

  private Integer msgCount;

  private Integer mentionCount;

  private ChannelNotifyProps notifyProps;

  private Long lastUpdateAt;

  public ChannelMember channelId(String channelId) {
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

  public ChannelMember userId(String userId) {
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

  public ChannelMember roles(String roles) {
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

  public ChannelMember lastViewedAt(Long lastViewedAt) {
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

  public ChannelMember msgCount(Integer msgCount) {
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

  public ChannelMember mentionCount(Integer mentionCount) {
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

  public ChannelMember notifyProps(ChannelNotifyProps notifyProps) {
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

  public ChannelMember lastUpdateAt(Long lastUpdateAt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMember channelMember = (ChannelMember) o;
    return Objects.equals(this.channelId, channelMember.channelId) &&
        Objects.equals(this.userId, channelMember.userId) &&
        Objects.equals(this.roles, channelMember.roles) &&
        Objects.equals(this.lastViewedAt, channelMember.lastViewedAt) &&
        Objects.equals(this.msgCount, channelMember.msgCount) &&
        Objects.equals(this.mentionCount, channelMember.mentionCount) &&
        Objects.equals(this.notifyProps, channelMember.notifyProps) &&
        Objects.equals(this.lastUpdateAt, channelMember.lastUpdateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, userId, roles, lastViewedAt, msgCount, mentionCount, notifyProps, lastUpdateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelMember {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
    sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
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

