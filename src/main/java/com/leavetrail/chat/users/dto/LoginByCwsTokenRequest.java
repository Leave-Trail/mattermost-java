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
 * LoginByCwsTokenRequest
 */

@JsonTypeName("LoginByCwsToken_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class LoginByCwsTokenRequest {

  private String loginId;

  private String cwsToken;

  public LoginByCwsTokenRequest loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  /**
   * Get loginId
   * @return loginId
  */
  
  @Schema(name = "login_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login_id")
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public LoginByCwsTokenRequest cwsToken(String cwsToken) {
    this.cwsToken = cwsToken;
    return this;
  }

  /**
   * Get cwsToken
   * @return cwsToken
  */
  
  @Schema(name = "cws_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cws_token")
  public String getCwsToken() {
    return cwsToken;
  }

  public void setCwsToken(String cwsToken) {
    this.cwsToken = cwsToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginByCwsTokenRequest loginByCwsTokenRequest = (LoginByCwsTokenRequest) o;
    return Objects.equals(this.loginId, loginByCwsTokenRequest.loginId) &&
        Objects.equals(this.cwsToken, loginByCwsTokenRequest.cwsToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, cwsToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginByCwsTokenRequest {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    cwsToken: ").append(toIndentedString(cwsToken)).append("\n");
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

