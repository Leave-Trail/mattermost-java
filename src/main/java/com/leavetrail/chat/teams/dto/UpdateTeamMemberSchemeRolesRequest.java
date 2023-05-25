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
 * UpdateTeamMemberSchemeRolesRequest
 */

@JsonTypeName("UpdateTeamMemberSchemeRoles_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class UpdateTeamMemberSchemeRolesRequest {

  private Boolean schemeAdmin;

  private Boolean schemeUser;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateTeamMemberSchemeRolesRequest#UpdateTeamMemberSchemeRolesRequest(Boolean, Boolean)}
   */
  @Deprecated
  public UpdateTeamMemberSchemeRolesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateTeamMemberSchemeRolesRequest(Boolean schemeAdmin, Boolean schemeUser) {
    this.schemeAdmin = schemeAdmin;
    this.schemeUser = schemeUser;
  }

  public UpdateTeamMemberSchemeRolesRequest schemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
    return this;
  }

  /**
   * Get schemeAdmin
   * @return schemeAdmin
  */
  @NotNull 
  @Schema(name = "scheme_admin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheme_admin")
  public Boolean getSchemeAdmin() {
    return schemeAdmin;
  }

  public void setSchemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
  }

  public UpdateTeamMemberSchemeRolesRequest schemeUser(Boolean schemeUser) {
    this.schemeUser = schemeUser;
    return this;
  }

  /**
   * Get schemeUser
   * @return schemeUser
  */
  @NotNull 
  @Schema(name = "scheme_user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheme_user")
  public Boolean getSchemeUser() {
    return schemeUser;
  }

  public void setSchemeUser(Boolean schemeUser) {
    this.schemeUser = schemeUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTeamMemberSchemeRolesRequest updateTeamMemberSchemeRolesRequest = (UpdateTeamMemberSchemeRolesRequest) o;
    return Objects.equals(this.schemeAdmin, updateTeamMemberSchemeRolesRequest.schemeAdmin) &&
        Objects.equals(this.schemeUser, updateTeamMemberSchemeRolesRequest.schemeUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeAdmin, schemeUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamMemberSchemeRolesRequest {\n");
    sb.append("    schemeAdmin: ").append(toIndentedString(schemeAdmin)).append("\n");
    sb.append("    schemeUser: ").append(toIndentedString(schemeUser)).append("\n");
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

