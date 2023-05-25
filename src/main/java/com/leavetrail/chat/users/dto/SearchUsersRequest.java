package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchUsersRequest
 */

@JsonTypeName("SearchUsers_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class SearchUsersRequest {

  private String term;

  private String teamId;

  private String notInTeamId;

  private String inChannelId;

  private String notInChannelId;

  private String inGroupId;

  private Boolean groupConstrained;

  private Boolean allowInactive;

  private Boolean withoutTeam;

  private Integer limit = 100;

  /**
   * Default constructor
   * @deprecated Use {@link SearchUsersRequest#SearchUsersRequest(String)}
   */
  @Deprecated
  public SearchUsersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchUsersRequest(String term) {
    this.term = term;
  }

  public SearchUsersRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The term to match against username, full name, nickname and email
   * @return term
  */
  @NotNull 
  @Schema(name = "term", description = "The term to match against username, full name, nickname and email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public SearchUsersRequest teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * If provided, only search users on this team
   * @return teamId
  */
  
  @Schema(name = "team_id", description = "If provided, only search users on this team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public SearchUsersRequest notInTeamId(String notInTeamId) {
    this.notInTeamId = notInTeamId;
    return this;
  }

  /**
   * If provided, only search users not on this team
   * @return notInTeamId
  */
  
  @Schema(name = "not_in_team_id", description = "If provided, only search users not on this team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("not_in_team_id")
  public String getNotInTeamId() {
    return notInTeamId;
  }

  public void setNotInTeamId(String notInTeamId) {
    this.notInTeamId = notInTeamId;
  }

  public SearchUsersRequest inChannelId(String inChannelId) {
    this.inChannelId = inChannelId;
    return this;
  }

  /**
   * If provided, only search users in this channel
   * @return inChannelId
  */
  
  @Schema(name = "in_channel_id", description = "If provided, only search users in this channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_channel_id")
  public String getInChannelId() {
    return inChannelId;
  }

  public void setInChannelId(String inChannelId) {
    this.inChannelId = inChannelId;
  }

  public SearchUsersRequest notInChannelId(String notInChannelId) {
    this.notInChannelId = notInChannelId;
    return this;
  }

  /**
   * If provided, only search users not in this channel. Must specifiy `team_id` when using this option
   * @return notInChannelId
  */
  
  @Schema(name = "not_in_channel_id", description = "If provided, only search users not in this channel. Must specifiy `team_id` when using this option", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("not_in_channel_id")
  public String getNotInChannelId() {
    return notInChannelId;
  }

  public void setNotInChannelId(String notInChannelId) {
    this.notInChannelId = notInChannelId;
  }

  public SearchUsersRequest inGroupId(String inGroupId) {
    this.inGroupId = inGroupId;
    return this;
  }

  /**
   * If provided, only search users in this group. Must have `manage_system` permission.
   * @return inGroupId
  */
  
  @Schema(name = "in_group_id", description = "If provided, only search users in this group. Must have `manage_system` permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_group_id")
  public String getInGroupId() {
    return inGroupId;
  }

  public void setInGroupId(String inGroupId) {
    this.inGroupId = inGroupId;
  }

  public SearchUsersRequest groupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
    return this;
  }

  /**
   * When used with `not_in_channel_id` or `not_in_team_id`, returns only the users that are allowed to join the channel or team based on its group constrains.
   * @return groupConstrained
  */
  
  @Schema(name = "group_constrained", description = "When used with `not_in_channel_id` or `not_in_team_id`, returns only the users that are allowed to join the channel or team based on its group constrains.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group_constrained")
  public Boolean getGroupConstrained() {
    return groupConstrained;
  }

  public void setGroupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
  }

  public SearchUsersRequest allowInactive(Boolean allowInactive) {
    this.allowInactive = allowInactive;
    return this;
  }

  /**
   * When `true`, include deactivated users in the results
   * @return allowInactive
  */
  
  @Schema(name = "allow_inactive", description = "When `true`, include deactivated users in the results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_inactive")
  public Boolean getAllowInactive() {
    return allowInactive;
  }

  public void setAllowInactive(Boolean allowInactive) {
    this.allowInactive = allowInactive;
  }

  public SearchUsersRequest withoutTeam(Boolean withoutTeam) {
    this.withoutTeam = withoutTeam;
    return this;
  }

  /**
   * Set this to `true` if you would like to search for users that are not on a team. This option takes precendence over `team_id`, `in_channel_id`, and `not_in_channel_id`.
   * @return withoutTeam
  */
  
  @Schema(name = "without_team", description = "Set this to `true` if you would like to search for users that are not on a team. This option takes precendence over `team_id`, `in_channel_id`, and `not_in_channel_id`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("without_team")
  public Boolean getWithoutTeam() {
    return withoutTeam;
  }

  public void setWithoutTeam(Boolean withoutTeam) {
    this.withoutTeam = withoutTeam;
  }

  public SearchUsersRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of users to return in the results  __Available as of server version 5.6. Defaults to `100` if not provided or on an earlier server version.__ 
   * @return limit
  */
  
  @Schema(name = "limit", description = "The maximum number of users to return in the results  __Available as of server version 5.6. Defaults to `100` if not provided or on an earlier server version.__ ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUsersRequest searchUsersRequest = (SearchUsersRequest) o;
    return Objects.equals(this.term, searchUsersRequest.term) &&
        Objects.equals(this.teamId, searchUsersRequest.teamId) &&
        Objects.equals(this.notInTeamId, searchUsersRequest.notInTeamId) &&
        Objects.equals(this.inChannelId, searchUsersRequest.inChannelId) &&
        Objects.equals(this.notInChannelId, searchUsersRequest.notInChannelId) &&
        Objects.equals(this.inGroupId, searchUsersRequest.inGroupId) &&
        Objects.equals(this.groupConstrained, searchUsersRequest.groupConstrained) &&
        Objects.equals(this.allowInactive, searchUsersRequest.allowInactive) &&
        Objects.equals(this.withoutTeam, searchUsersRequest.withoutTeam) &&
        Objects.equals(this.limit, searchUsersRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, teamId, notInTeamId, inChannelId, notInChannelId, inGroupId, groupConstrained, allowInactive, withoutTeam, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUsersRequest {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    notInTeamId: ").append(toIndentedString(notInTeamId)).append("\n");
    sb.append("    inChannelId: ").append(toIndentedString(inChannelId)).append("\n");
    sb.append("    notInChannelId: ").append(toIndentedString(notInChannelId)).append("\n");
    sb.append("    inGroupId: ").append(toIndentedString(inGroupId)).append("\n");
    sb.append("    groupConstrained: ").append(toIndentedString(groupConstrained)).append("\n");
    sb.append("    allowInactive: ").append(toIndentedString(allowInactive)).append("\n");
    sb.append("    withoutTeam: ").append(toIndentedString(withoutTeam)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

