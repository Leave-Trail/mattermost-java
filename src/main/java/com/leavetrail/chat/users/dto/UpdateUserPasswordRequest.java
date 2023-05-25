package com.leavetrail.chat.users.dto;

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
 * UpdateUserPasswordRequest
 */

@JsonTypeName("UpdateUserPassword_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UpdateUserPasswordRequest {

  private String currentPassword;

  private String newPassword;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateUserPasswordRequest#UpdateUserPasswordRequest(String)}
   */
  @Deprecated
  public UpdateUserPasswordRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserPasswordRequest(String newPassword) {
    this.newPassword = newPassword;
  }

  public UpdateUserPasswordRequest currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * The current password for the user
   * @return currentPassword
  */
  
  @Schema(name = "current_password", description = "The current password for the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_password")
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public UpdateUserPasswordRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The new password for the user
   * @return newPassword
  */
  @NotNull 
  @Schema(name = "new_password", description = "The new password for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_password")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserPasswordRequest updateUserPasswordRequest = (UpdateUserPasswordRequest) o;
    return Objects.equals(this.currentPassword, updateUserPasswordRequest.currentPassword) &&
        Objects.equals(this.newPassword, updateUserPasswordRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserPasswordRequest {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

