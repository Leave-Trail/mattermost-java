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
 * UserAuthData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserAuthData {

  private String authData;

  private String authService;

  /**
   * Default constructor
   * @deprecated Use {@link UserAuthData#UserAuthData(String, String)}
   */
  @Deprecated
  public UserAuthData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAuthData(String authData, String authService) {
    this.authData = authData;
    this.authService = authService;
  }

  public UserAuthData authData(String authData) {
    this.authData = authData;
    return this;
  }

  /**
   * Service-specific authentication data
   * @return authData
  */
  @NotNull 
  @Schema(name = "auth_data", description = "Service-specific authentication data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("auth_data")
  public String getAuthData() {
    return authData;
  }

  public void setAuthData(String authData) {
    this.authData = authData;
  }

  public UserAuthData authService(String authService) {
    this.authService = authService;
    return this;
  }

  /**
   * The authentication service such as \"email\", \"gitlab\", or \"ldap\"
   * @return authService
  */
  @NotNull 
  @Schema(name = "auth_service", description = "The authentication service such as \"email\", \"gitlab\", or \"ldap\"", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("auth_service")
  public String getAuthService() {
    return authService;
  }

  public void setAuthService(String authService) {
    this.authService = authService;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthData userAuthData = (UserAuthData) o;
    return Objects.equals(this.authData, userAuthData.authData) &&
        Objects.equals(this.authService, userAuthData.authService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authData, authService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthData {\n");
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    authService: ").append(toIndentedString(authService)).append("\n");
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

