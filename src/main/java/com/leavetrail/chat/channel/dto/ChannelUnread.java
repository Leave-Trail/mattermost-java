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
 * ChannelUnread
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class ChannelUnread {

  private String teamId;

  private String channelId;

  private Integer msgCount;

  private Integer mentionCount;

  public ChannelUnread teamId(String teamId) {
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

  public ChannelUnread channelId(String channelId) {
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

  public ChannelUnread msgCount(Integer msgCount) {
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

  public ChannelUnread mentionCount(Integer mentionCount) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelUnread channelUnread = (ChannelUnread) o;
    return Objects.equals(this.teamId, channelUnread.teamId) &&
        Objects.equals(this.channelId, channelUnread.channelId) &&
        Objects.equals(this.msgCount, channelUnread.msgCount) &&
        Objects.equals(this.mentionCount, channelUnread.mentionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, channelId, msgCount, mentionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelUnread {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    msgCount: ").append(toIndentedString(msgCount)).append("\n");
    sb.append("    mentionCount: ").append(toIndentedString(mentionCount)).append("\n");
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

