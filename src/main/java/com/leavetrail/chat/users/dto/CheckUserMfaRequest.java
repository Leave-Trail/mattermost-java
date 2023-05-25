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
 * CheckUserMfaRequest
 */

@JsonTypeName("CheckUserMfa_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class CheckUserMfaRequest {

  private String loginId;

  /**
   * Default constructor
   * @deprecated Use {@link CheckUserMfaRequest#CheckUserMfaRequest(String)}
   */
  @Deprecated
  public CheckUserMfaRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckUserMfaRequest(String loginId) {
    this.loginId = loginId;
  }

  public CheckUserMfaRequest loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  /**
   * The email or username used to login
   * @return loginId
  */
  @NotNull 
  @Schema(name = "login_id", description = "The email or username used to login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("login_id")
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserMfaRequest checkUserMfaRequest = (CheckUserMfaRequest) o;
    return Objects.equals(this.loginId, checkUserMfaRequest.loginId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserMfaRequest {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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

