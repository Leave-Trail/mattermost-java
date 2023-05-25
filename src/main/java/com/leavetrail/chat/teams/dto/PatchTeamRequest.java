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
 * PatchTeamRequest
 */

@JsonTypeName("PatchTeam_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class PatchTeamRequest {

  private String displayName;

  private String description;

  private String companyName;

  private String inviteId;

  private Boolean allowOpenInvite;

  public PatchTeamRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PatchTeamRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PatchTeamRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "company_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public PatchTeamRequest inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Get inviteId
   * @return inviteId
  */
  
  @Schema(name = "invite_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public PatchTeamRequest allowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
    return this;
  }

  /**
   * Get allowOpenInvite
   * @return allowOpenInvite
  */
  
  @Schema(name = "allow_open_invite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_open_invite")
  public Boolean getAllowOpenInvite() {
    return allowOpenInvite;
  }

  public void setAllowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchTeamRequest patchTeamRequest = (PatchTeamRequest) o;
    return Objects.equals(this.displayName, patchTeamRequest.displayName) &&
        Objects.equals(this.description, patchTeamRequest.description) &&
        Objects.equals(this.companyName, patchTeamRequest.companyName) &&
        Objects.equals(this.inviteId, patchTeamRequest.inviteId) &&
        Objects.equals(this.allowOpenInvite, patchTeamRequest.allowOpenInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, companyName, inviteId, allowOpenInvite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchTeamRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    allowOpenInvite: ").append(toIndentedString(allowOpenInvite)).append("\n");
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

