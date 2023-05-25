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
 * UpdateTeamRequest
 */

@JsonTypeName("UpdateTeam_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class UpdateTeamRequest {

  private String id;

  private String displayName;

  private String description;

  private String companyName;

  private String allowedDomains;

  private String inviteId;

  private String allowOpenInvite;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateTeamRequest#UpdateTeamRequest(String, String, String, String, String, String, String)}
   */
  @Deprecated
  public UpdateTeamRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateTeamRequest(String id, String displayName, String description, String companyName, String allowedDomains, String inviteId, String allowOpenInvite) {
    this.id = id;
    this.displayName = displayName;
    this.description = description;
    this.companyName = companyName;
    this.allowedDomains = allowedDomains;
    this.inviteId = inviteId;
    this.allowOpenInvite = allowOpenInvite;
  }

  public UpdateTeamRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateTeamRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  @NotNull 
  @Schema(name = "display_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UpdateTeamRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateTeamRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  @NotNull 
  @Schema(name = "company_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UpdateTeamRequest allowedDomains(String allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  /**
   * Get allowedDomains
   * @return allowedDomains
  */
  @NotNull 
  @Schema(name = "allowed_domains", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allowed_domains")
  public String getAllowedDomains() {
    return allowedDomains;
  }

  public void setAllowedDomains(String allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  public UpdateTeamRequest inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Get inviteId
   * @return inviteId
  */
  @NotNull 
  @Schema(name = "invite_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public UpdateTeamRequest allowOpenInvite(String allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
    return this;
  }

  /**
   * Get allowOpenInvite
   * @return allowOpenInvite
  */
  @NotNull 
  @Schema(name = "allow_open_invite", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allow_open_invite")
  public String getAllowOpenInvite() {
    return allowOpenInvite;
  }

  public void setAllowOpenInvite(String allowOpenInvite) {
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
    UpdateTeamRequest updateTeamRequest = (UpdateTeamRequest) o;
    return Objects.equals(this.id, updateTeamRequest.id) &&
        Objects.equals(this.displayName, updateTeamRequest.displayName) &&
        Objects.equals(this.description, updateTeamRequest.description) &&
        Objects.equals(this.companyName, updateTeamRequest.companyName) &&
        Objects.equals(this.allowedDomains, updateTeamRequest.allowedDomains) &&
        Objects.equals(this.inviteId, updateTeamRequest.inviteId) &&
        Objects.equals(this.allowOpenInvite, updateTeamRequest.allowOpenInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, description, companyName, allowedDomains, inviteId, allowOpenInvite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
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

