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
 * TeamStats
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class TeamStats {

  private String teamId;

  private Integer totalMemberCount;

  private Integer activeMemberCount;

  public TeamStats teamId(String teamId) {
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

  public TeamStats totalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
    return this;
  }

  /**
   * Get totalMemberCount
   * @return totalMemberCount
  */
  
  @Schema(name = "total_member_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_member_count")
  public Integer getTotalMemberCount() {
    return totalMemberCount;
  }

  public void setTotalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
  }

  public TeamStats activeMemberCount(Integer activeMemberCount) {
    this.activeMemberCount = activeMemberCount;
    return this;
  }

  /**
   * Get activeMemberCount
   * @return activeMemberCount
  */
  
  @Schema(name = "active_member_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active_member_count")
  public Integer getActiveMemberCount() {
    return activeMemberCount;
  }

  public void setActiveMemberCount(Integer activeMemberCount) {
    this.activeMemberCount = activeMemberCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamStats teamStats = (TeamStats) o;
    return Objects.equals(this.teamId, teamStats.teamId) &&
        Objects.equals(this.totalMemberCount, teamStats.totalMemberCount) &&
        Objects.equals(this.activeMemberCount, teamStats.activeMemberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, totalMemberCount, activeMemberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamStats {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    totalMemberCount: ").append(toIndentedString(totalMemberCount)).append("\n");
    sb.append("    activeMemberCount: ").append(toIndentedString(activeMemberCount)).append("\n");
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

