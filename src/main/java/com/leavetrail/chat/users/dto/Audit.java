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
 * Audit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class Audit {

  private String id;

  private Long createAt;

  private String userId;

  private String action;

  private String extraInfo;

  private String ipAddress;

  private String sessionId;

  public Audit id(String id) {
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

  public Audit createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a audit was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a audit was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public Audit userId(String userId) {
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

  public Audit action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Audit extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  /**
   * Get extraInfo
   * @return extraInfo
  */
  
  @Schema(name = "extra_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_info")
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }

  public Audit ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
  */
  
  @Schema(name = "ip_address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Audit sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  
  @Schema(name = "session_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("session_id")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audit audit = (Audit) o;
    return Objects.equals(this.id, audit.id) &&
        Objects.equals(this.createAt, audit.createAt) &&
        Objects.equals(this.userId, audit.userId) &&
        Objects.equals(this.action, audit.action) &&
        Objects.equals(this.extraInfo, audit.extraInfo) &&
        Objects.equals(this.ipAddress, audit.ipAddress) &&
        Objects.equals(this.sessionId, audit.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, userId, action, extraInfo, ipAddress, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

