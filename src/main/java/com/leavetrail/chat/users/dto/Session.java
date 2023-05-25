package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.users.dto.TeamMember;
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
 * Session
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class Session {

  private Long createAt;

  private String deviceId;

  private Long expiresAt;

  private String id;

  private Boolean isOauth;

  private Long lastActivityAt;

  private Object props;

  private String roles;

  @Valid
  private List<com.leavetrail.chat.users.dto.TeamMember> teamMembers;

  private String token;

  private String userId;

  public Session createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a session was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a session was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Session deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
  */
  
  @Schema(name = "device_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public Session expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The time in milliseconds a session will expire
   * @return expiresAt
  */
  
  @Schema(name = "expires_at", description = "The time in milliseconds a session will expire", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Session id(String id) {
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

  public Session isOauth(Boolean isOauth) {
    this.isOauth = isOauth;
    return this;
  }

  /**
   * Get isOauth
   * @return isOauth
  */
  
  @Schema(name = "is_oauth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_oauth")
  public Boolean getIsOauth() {
    return isOauth;
  }

  public void setIsOauth(Boolean isOauth) {
    this.isOauth = isOauth;
  }

  public Session lastActivityAt(Long lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
    return this;
  }

  /**
   * The time in milliseconds of the last activity of a session
   * @return lastActivityAt
  */
  
  @Schema(name = "last_activity_at", description = "The time in milliseconds of the last activity of a session", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_activity_at")
  public Long getLastActivityAt() {
    return lastActivityAt;
  }

  public void setLastActivityAt(Long lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
  }

  public Session props(Object props) {
    this.props = props;
    return this;
  }

  /**
   * Get props
   * @return props
  */
  
  @Schema(name = "props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public Object getProps() {
    return props;
  }

  public void setProps(Object props) {
    this.props = props;
  }

  public Session roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public Session teamMembers(List<com.leavetrail.chat.users.dto.TeamMember> teamMembers) {
    this.teamMembers = teamMembers;
    return this;
  }

  public Session addTeamMembersItem(TeamMember teamMembersItem) {
    if (this.teamMembers == null) {
      this.teamMembers = new ArrayList<>();
    }
    this.teamMembers.add(teamMembersItem);
    return this;
  }

  /**
   * Get teamMembers
   * @return teamMembers
  */
  @Valid 
  @Schema(name = "team_members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_members")
  public List<com.leavetrail.chat.users.dto.TeamMember> getTeamMembers() {
    return teamMembers;
  }

  public void setTeamMembers(List<com.leavetrail.chat.users.dto.TeamMember> teamMembers) {
    this.teamMembers = teamMembers;
  }

  public Session token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Session userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.createAt, session.createAt) &&
        Objects.equals(this.deviceId, session.deviceId) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.id, session.id) &&
        Objects.equals(this.isOauth, session.isOauth) &&
        Objects.equals(this.lastActivityAt, session.lastActivityAt) &&
        Objects.equals(this.props, session.props) &&
        Objects.equals(this.roles, session.roles) &&
        Objects.equals(this.teamMembers, session.teamMembers) &&
        Objects.equals(this.token, session.token) &&
        Objects.equals(this.userId, session.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAt, deviceId, expiresAt, id, isOauth, lastActivityAt, props, roles, teamMembers, token, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOauth: ").append(toIndentedString(isOauth)).append("\n");
    sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    teamMembers: ").append(toIndentedString(teamMembers)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

