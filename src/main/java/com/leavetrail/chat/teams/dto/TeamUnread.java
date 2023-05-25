package com.leavetrail.chat.teams.dto;

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
 * TeamUnread
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class TeamUnread {

  private String teamId;

  private Integer msgCount;

  private Integer mentionCount;

  public TeamUnread teamId(String teamId) {
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

  public TeamUnread msgCount(Integer msgCount) {
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

  public TeamUnread mentionCount(Integer mentionCount) {
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
    TeamUnread teamUnread = (TeamUnread) o;
    return Objects.equals(this.teamId, teamUnread.teamId) &&
        Objects.equals(this.msgCount, teamUnread.msgCount) &&
        Objects.equals(this.mentionCount, teamUnread.mentionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, msgCount, mentionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamUnread {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

