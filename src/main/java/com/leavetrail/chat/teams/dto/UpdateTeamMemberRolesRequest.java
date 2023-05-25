package com.leavetrail.chat.teams.dto;

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
 * UpdateTeamMemberRolesRequest
 */

@JsonTypeName("UpdateTeamMemberRoles_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class UpdateTeamMemberRolesRequest {

  private String roles;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateTeamMemberRolesRequest#UpdateTeamMemberRolesRequest(String)}
   */
  @Deprecated
  public UpdateTeamMemberRolesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateTeamMemberRolesRequest(String roles) {
    this.roles = roles;
  }

  public UpdateTeamMemberRolesRequest roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @NotNull 
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTeamMemberRolesRequest updateTeamMemberRolesRequest = (UpdateTeamMemberRolesRequest) o;
    return Objects.equals(this.roles, updateTeamMemberRolesRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamMemberRolesRequest {\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

