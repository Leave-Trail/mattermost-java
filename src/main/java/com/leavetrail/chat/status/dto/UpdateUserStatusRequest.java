package com.leavetrail.chat.status.dto;

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
 * UpdateUserStatusRequest
 */

@JsonTypeName("UpdateUserStatus_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:29.136457+02:00[Europe/Warsaw]")
public class UpdateUserStatusRequest {

  private String userId;

  private String status;

  private Integer dndEndTime;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateUserStatusRequest#UpdateUserStatusRequest(String, String)}
   */
  @Deprecated
  public UpdateUserStatusRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserStatusRequest(String userId, String status) {
    this.userId = userId;
    this.status = status;
  }

  public UpdateUserStatusRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User ID
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", description = "User ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UpdateUserStatusRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * User status, can be `online`, `away`, `offline` and `dnd`
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "User status, can be `online`, `away`, `offline` and `dnd`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UpdateUserStatusRequest dndEndTime(Integer dndEndTime) {
    this.dndEndTime = dndEndTime;
    return this;
  }

  /**
   * Time in epoch seconds at which a dnd status would be unset.
   * @return dndEndTime
  */
  
  @Schema(name = "dnd_end_time", description = "Time in epoch seconds at which a dnd status would be unset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dnd_end_time")
  public Integer getDndEndTime() {
    return dndEndTime;
  }

  public void setDndEndTime(Integer dndEndTime) {
    this.dndEndTime = dndEndTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserStatusRequest updateUserStatusRequest = (UpdateUserStatusRequest) o;
    return Objects.equals(this.userId, updateUserStatusRequest.userId) &&
        Objects.equals(this.status, updateUserStatusRequest.status) &&
        Objects.equals(this.dndEndTime, updateUserStatusRequest.dndEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, status, dndEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserStatusRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dndEndTime: ").append(toIndentedString(dndEndTime)).append("\n");
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

