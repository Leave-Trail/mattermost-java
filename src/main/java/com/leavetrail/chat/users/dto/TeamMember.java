package com.leavetrail.chat.users.dto;

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
 * TeamMember
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:27:21.756932+02:00[Europe/Warsaw]")
public class TeamMember {

  private String teamId;

  private String userId;

  private String roles;

  private Integer deleteAt;

  private Boolean schemeUser;

  private Boolean schemeAdmin;

  private String explicitRoles;

  public TeamMember teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID of the team this member belongs to.
   * @return teamId
  */
  
  @Schema(name = "team_id", description = "The ID of the team this member belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public TeamMember userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user this member relates to.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of the user this member relates to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public TeamMember roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * The complete list of roles assigned to this team member, as a space-separated list of role names, including any roles granted implicitly through permissions schemes.
   * @return roles
  */
  
  @Schema(name = "roles", description = "The complete list of roles assigned to this team member, as a space-separated list of role names, including any roles granted implicitly through permissions schemes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public TeamMember deleteAt(Integer deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds that this team member was deleted.
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds that this team member was deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Integer getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Integer deleteAt) {
    this.deleteAt = deleteAt;
  }

  public TeamMember schemeUser(Boolean schemeUser) {
    this.schemeUser = schemeUser;
    return this;
  }

  /**
   * Whether this team member holds the default user role defined by the team's permissions scheme.
   * @return schemeUser
  */
  
  @Schema(name = "scheme_user", description = "Whether this team member holds the default user role defined by the team's permissions scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheme_user")
  public Boolean getSchemeUser() {
    return schemeUser;
  }

  public void setSchemeUser(Boolean schemeUser) {
    this.schemeUser = schemeUser;
  }

  public TeamMember schemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
    return this;
  }

  /**
   * Whether this team member holds the default admin role defined by the team's permissions scheme.
   * @return schemeAdmin
  */
  
  @Schema(name = "scheme_admin", description = "Whether this team member holds the default admin role defined by the team's permissions scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheme_admin")
  public Boolean getSchemeAdmin() {
    return schemeAdmin;
  }

  public void setSchemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
  }

  public TeamMember explicitRoles(String explicitRoles) {
    this.explicitRoles = explicitRoles;
    return this;
  }

  /**
   * The list of roles explicitly assigned to this team member, as a space separated list of role names. This list does *not* include any roles granted implicitly through permissions schemes.
   * @return explicitRoles
  */
  
  @Schema(name = "explicit_roles", description = "The list of roles explicitly assigned to this team member, as a space separated list of role names. This list does *not* include any roles granted implicitly through permissions schemes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explicit_roles")
  public String getExplicitRoles() {
    return explicitRoles;
  }

  public void setExplicitRoles(String explicitRoles) {
    this.explicitRoles = explicitRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMember teamMember = (TeamMember) o;
    return Objects.equals(this.teamId, teamMember.teamId) &&
        Objects.equals(this.userId, teamMember.userId) &&
        Objects.equals(this.roles, teamMember.roles) &&
        Objects.equals(this.deleteAt, teamMember.deleteAt) &&
        Objects.equals(this.schemeUser, teamMember.schemeUser) &&
        Objects.equals(this.schemeAdmin, teamMember.schemeAdmin) &&
        Objects.equals(this.explicitRoles, teamMember.explicitRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, userId, roles, deleteAt, schemeUser, schemeAdmin, explicitRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMember {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    schemeUser: ").append(toIndentedString(schemeUser)).append("\n");
    sb.append("    schemeAdmin: ").append(toIndentedString(schemeAdmin)).append("\n");
    sb.append("    explicitRoles: ").append(toIndentedString(explicitRoles)).append("\n");
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

