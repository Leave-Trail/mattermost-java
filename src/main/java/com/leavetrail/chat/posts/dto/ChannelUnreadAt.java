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
 * ChannelUnreadAt
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class ChannelUnreadAt {

  private String teamId;

  private String channelId;

  private Integer msgCount;

  private Integer mentionCount;

  private Integer lastViewedAt;

  public ChannelUnreadAt teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID of the team the channel belongs to.
   * @return teamId
  */
  
  @Schema(name = "team_id", description = "The ID of the team the channel belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public ChannelUnreadAt channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID of the channel the user has access to..
   * @return channelId
  */
  
  @Schema(name = "channel_id", description = "The ID of the channel the user has access to..", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ChannelUnreadAt msgCount(Integer msgCount) {
    this.msgCount = msgCount;
    return this;
  }

  /**
   * No. of messages the user has already read.
   * @return msgCount
  */
  
  @Schema(name = "msg_count", description = "No. of messages the user has already read.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg_count")
  public Integer getMsgCount() {
    return msgCount;
  }

  public void setMsgCount(Integer msgCount) {
    this.msgCount = msgCount;
  }

  public ChannelUnreadAt mentionCount(Integer mentionCount) {
    this.mentionCount = mentionCount;
    return this;
  }

  /**
   * No. of mentions the user has within the unread posts of the channel.
   * @return mentionCount
  */
  
  @Schema(name = "mention_count", description = "No. of mentions the user has within the unread posts of the channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mention_count")
  public Integer getMentionCount() {
    return mentionCount;
  }

  public void setMentionCount(Integer mentionCount) {
    this.mentionCount = mentionCount;
  }

  public ChannelUnreadAt lastViewedAt(Integer lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * time in milliseconds when the user last viewed the channel.
   * @return lastViewedAt
  */
  
  @Schema(name = "last_viewed_at", description = "time in milliseconds when the user last viewed the channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_viewed_at")
  public Integer getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(Integer lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelUnreadAt channelUnreadAt = (ChannelUnreadAt) o;
    return Objects.equals(this.teamId, channelUnreadAt.teamId) &&
        Objects.equals(this.channelId, channelUnreadAt.channelId) &&
        Objects.equals(this.msgCount, channelUnreadAt.msgCount) &&
        Objects.equals(this.mentionCount, channelUnreadAt.mentionCount) &&
        Objects.equals(this.lastViewedAt, channelUnreadAt.lastViewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, channelId, msgCount, mentionCount, lastViewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelUnreadAt {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
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

