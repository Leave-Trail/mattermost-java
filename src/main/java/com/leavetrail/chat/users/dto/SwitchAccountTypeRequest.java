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
 * SwitchAccountTypeRequest
 */

@JsonTypeName("SwitchAccountType_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class SwitchAccountTypeRequest {

  private String currentService;

  private String newService;

  private String email;

  private String password;

  private String mfaCode;

  private String ldapId;

  /**
   * Default constructor
   * @deprecated Use {@link SwitchAccountTypeRequest#SwitchAccountTypeRequest(String, String)}
   */
  @Deprecated
  public SwitchAccountTypeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SwitchAccountTypeRequest(String currentService, String newService) {
    this.currentService = currentService;
    this.newService = newService;
  }

  public SwitchAccountTypeRequest currentService(String currentService) {
    this.currentService = currentService;
    return this;
  }

  /**
   * The service the user currently uses to login
   * @return currentService
  */
  @NotNull 
  @Schema(name = "current_service", description = "The service the user currently uses to login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("current_service")
  public String getCurrentService() {
    return currentService;
  }

  public void setCurrentService(String currentService) {
    this.currentService = currentService;
  }

  public SwitchAccountTypeRequest newService(String newService) {
    this.newService = newService;
    return this;
  }

  /**
   * The service the user will use to login
   * @return newService
  */
  @NotNull 
  @Schema(name = "new_service", description = "The service the user will use to login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_service")
  public String getNewService() {
    return newService;
  }

  public void setNewService(String newService) {
    this.newService = newService;
  }

  public SwitchAccountTypeRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user
   * @return email
  */
  
  @Schema(name = "email", description = "The email of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SwitchAccountTypeRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password used with the current service
   * @return password
  */
  
  @Schema(name = "password", description = "The password used with the current service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SwitchAccountTypeRequest mfaCode(String mfaCode) {
    this.mfaCode = mfaCode;
    return this;
  }

  /**
   * The MFA code of the current service
   * @return mfaCode
  */
  
  @Schema(name = "mfa_code", description = "The MFA code of the current service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mfa_code")
  public String getMfaCode() {
    return mfaCode;
  }

  public void setMfaCode(String mfaCode) {
    this.mfaCode = mfaCode;
  }

  public SwitchAccountTypeRequest ldapId(String ldapId) {
    this.ldapId = ldapId;
    return this;
  }

  /**
   * The LDAP/AD id of the user
   * @return ldapId
  */
  
  @Schema(name = "ldap_id", description = "The LDAP/AD id of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ldap_id")
  public String getLdapId() {
    return ldapId;
  }

  public void setLdapId(String ldapId) {
    this.ldapId = ldapId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchAccountTypeRequest switchAccountTypeRequest = (SwitchAccountTypeRequest) o;
    return Objects.equals(this.currentService, switchAccountTypeRequest.currentService) &&
        Objects.equals(this.newService, switchAccountTypeRequest.newService) &&
        Objects.equals(this.email, switchAccountTypeRequest.email) &&
        Objects.equals(this.password, switchAccountTypeRequest.password) &&
        Objects.equals(this.mfaCode, switchAccountTypeRequest.mfaCode) &&
        Objects.equals(this.ldapId, switchAccountTypeRequest.ldapId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentService, newService, email, password, mfaCode, ldapId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchAccountTypeRequest {\n");
    sb.append("    currentService: ").append(toIndentedString(currentService)).append("\n");
    sb.append("    newService: ").append(toIndentedString(newService)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mfaCode: ").append(toIndentedString(mfaCode)).append("\n");
    sb.append("    ldapId: ").append(toIndentedString(ldapId)).append("\n");
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

