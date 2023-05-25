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
 * LoginRequest
 */

@JsonTypeName("Login_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class LoginRequest {

  private String id;

  private String loginId;

  private String token;

  private String deviceId;

  private Boolean ldapOnly;

  private String password;

  public LoginRequest id(String id) {
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

  public LoginRequest loginId(String loginId) {
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

  public LoginRequest token(String token) {
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

  public LoginRequest deviceId(String deviceId) {
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

  public LoginRequest ldapOnly(Boolean ldapOnly) {
    this.ldapOnly = ldapOnly;
    return this;
  }

  /**
   * Get ldapOnly
   * @return ldapOnly
  */
  
  @Schema(name = "ldap_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ldap_only")
  public Boolean getLdapOnly() {
    return ldapOnly;
  }

  public void setLdapOnly(Boolean ldapOnly) {
    this.ldapOnly = ldapOnly;
  }

  public LoginRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password used for email authentication.
   * @return password
  */
  
  @Schema(name = "password", description = "The password used for email authentication.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.id, loginRequest.id) &&
        Objects.equals(this.loginId, loginRequest.loginId) &&
        Objects.equals(this.token, loginRequest.token) &&
        Objects.equals(this.deviceId, loginRequest.deviceId) &&
        Objects.equals(this.ldapOnly, loginRequest.ldapOnly) &&
        Objects.equals(this.password, loginRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, loginId, token, deviceId, ldapOnly, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    ldapOnly: ").append(toIndentedString(ldapOnly)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

