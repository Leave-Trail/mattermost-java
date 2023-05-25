package com.leavetrail.chat.teams.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.teams.dto.Team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchTeams200Response
 */

@JsonTypeName("SearchTeams_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class SearchTeams200Response {

  @Valid
  private List<@Valid Team> teams;

  private BigDecimal totalCount;

  public SearchTeams200Response teams(List<@Valid Team> teams) {
    this.teams = teams;
    return this;
  }

  public SearchTeams200Response addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * The teams that matched the query.
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", description = "The teams that matched the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public List<@Valid Team> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid Team> teams) {
    this.teams = teams;
  }

  public SearchTeams200Response totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of results, regardless of page and per_page requested.
   * @return totalCount
  */
  @Valid 
  @Schema(name = "total_count", description = "The total number of results, regardless of page and per_page requested.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_count")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTeams200Response searchTeams200Response = (SearchTeams200Response) o;
    return Objects.equals(this.teams, searchTeams200Response.teams) &&
        Objects.equals(this.totalCount, searchTeams200Response.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teams, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTeams200Response {\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

