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
 * ResetPasswordRequest
 */

@JsonTypeName("ResetPassword_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class ResetPasswordRequest {

  private String code;

  private String newPassword;

  /**
   * Default constructor
   * @deprecated Use {@link ResetPasswordRequest#ResetPasswordRequest(String, String)}
   */
  @Deprecated
  public ResetPasswordRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResetPasswordRequest(String code, String newPassword) {
    this.code = code;
    this.newPassword = newPassword;
  }

  public ResetPasswordRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The recovery code
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "The recovery code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResetPasswordRequest newPassword(String newPassword) {
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
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return Objects.equals(this.code, resetPasswordRequest.code) &&
        Objects.equals(this.newPassword, resetPasswordRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

