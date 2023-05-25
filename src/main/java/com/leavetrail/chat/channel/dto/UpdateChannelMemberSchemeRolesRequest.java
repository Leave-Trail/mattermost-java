package com.leavetrail.chat.channel.dto;

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
 * UpdateChannelMemberSchemeRolesRequest
 */

@JsonTypeName("UpdateChannelMemberSchemeRoles_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class UpdateChannelMemberSchemeRolesRequest {

  private Boolean schemeAdmin;

  private Boolean schemeUser;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateChannelMemberSchemeRolesRequest#UpdateChannelMemberSchemeRolesRequest(Boolean, Boolean)}
   */
  @Deprecated
  public UpdateChannelMemberSchemeRolesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateChannelMemberSchemeRolesRequest(Boolean schemeAdmin, Boolean schemeUser) {
    this.schemeAdmin = schemeAdmin;
    this.schemeUser = schemeUser;
  }

  public UpdateChannelMemberSchemeRolesRequest schemeAdmin(Boolean schemeAdmin) {
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

  public UpdateChannelMemberSchemeRolesRequest schemeUser(Boolean schemeUser) {
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
    UpdateChannelMemberSchemeRolesRequest updateChannelMemberSchemeRolesRequest = (UpdateChannelMemberSchemeRolesRequest) o;
    return Objects.equals(this.schemeAdmin, updateChannelMemberSchemeRolesRequest.schemeAdmin) &&
        Objects.equals(this.schemeUser, updateChannelMemberSchemeRolesRequest.schemeUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeAdmin, schemeUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelMemberSchemeRolesRequest {\n");
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

