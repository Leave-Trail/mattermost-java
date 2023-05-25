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
 * Team
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class Team {

  private String id;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private String displayName;

  private String name;

  private String description;

  private String email;

  private String type;

  private String allowedDomains;

  private String inviteId;

  private Boolean allowOpenInvite;

  private String policyId;

  public Team id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Team createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a team was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a team was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Team updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a team was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a team was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public Team deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a team was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a team was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public Team displayName(String displayName) {
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

  public Team name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team description(String description) {
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

  public Team email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Team type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Team allowedDomains(String allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  /**
   * Get allowedDomains
   * @return allowedDomains
  */
  
  @Schema(name = "allowed_domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed_domains")
  public String getAllowedDomains() {
    return allowedDomains;
  }

  public void setAllowedDomains(String allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  public Team inviteId(String inviteId) {
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

  public Team allowOpenInvite(Boolean allowOpenInvite) {
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

  public Team policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the `sysconsole_read_compliance_data_retention` permission, this field will be null.
   * @return policyId
  */
  
  @Schema(name = "policy_id", description = "The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the `sysconsole_read_compliance_data_retention` permission, this field will be null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy_id")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.id, team.id) &&
        Objects.equals(this.createAt, team.createAt) &&
        Objects.equals(this.updateAt, team.updateAt) &&
        Objects.equals(this.deleteAt, team.deleteAt) &&
        Objects.equals(this.displayName, team.displayName) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.description, team.description) &&
        Objects.equals(this.email, team.email) &&
        Objects.equals(this.type, team.type) &&
        Objects.equals(this.allowedDomains, team.allowedDomains) &&
        Objects.equals(this.inviteId, team.inviteId) &&
        Objects.equals(this.allowOpenInvite, team.allowOpenInvite) &&
        Objects.equals(this.policyId, team.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, displayName, name, description, email, type, allowedDomains, inviteId, allowOpenInvite, policyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    allowOpenInvite: ").append(toIndentedString(allowOpenInvite)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

