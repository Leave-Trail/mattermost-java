package com.leavetrail.chat.status.dto;

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
 * Status
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:29.136457+02:00[Europe/Warsaw]")
public class Status {

  private String userId;

  private String status;

  private Boolean manual;

  private Long lastActivityAt;

  public Status userId(String userId) {
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

  public Status status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Status manual(Boolean manual) {
    this.manual = manual;
    return this;
  }

  /**
   * Get manual
   * @return manual
  */
  
  @Schema(name = "manual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manual")
  public Boolean getManual() {
    return manual;
  }

  public void setManual(Boolean manual) {
    this.manual = manual;
  }

  public Status lastActivityAt(Long lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
    return this;
  }

  /**
   * Get lastActivityAt
   * @return lastActivityAt
  */
  
  @Schema(name = "last_activity_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_activity_at")
  public Long getLastActivityAt() {
    return lastActivityAt;
  }

  public void setLastActivityAt(Long lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.userId, status.userId) &&
        Objects.equals(this.status, status.status) &&
        Objects.equals(this.manual, status.manual) &&
        Objects.equals(this.lastActivityAt, status.lastActivityAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, status, manual, lastActivityAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
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

