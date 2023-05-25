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
 * UpdateUserMfaRequest
 */

@JsonTypeName("UpdateUserMfa_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UpdateUserMfaRequest {

  private Boolean activate;

  private String code;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateUserMfaRequest#UpdateUserMfaRequest(Boolean)}
   */
  @Deprecated
  public UpdateUserMfaRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserMfaRequest(Boolean activate) {
    this.activate = activate;
  }

  public UpdateUserMfaRequest activate(Boolean activate) {
    this.activate = activate;
    return this;
  }

  /**
   * Use `true` to activate, `false` to deactivate
   * @return activate
  */
  @NotNull 
  @Schema(name = "activate", description = "Use `true` to activate, `false` to deactivate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activate")
  public Boolean getActivate() {
    return activate;
  }

  public void setActivate(Boolean activate) {
    this.activate = activate;
  }

  public UpdateUserMfaRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code produced by your MFA client. Required if `activate` is true
   * @return code
  */
  
  @Schema(name = "code", description = "The code produced by your MFA client. Required if `activate` is true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserMfaRequest updateUserMfaRequest = (UpdateUserMfaRequest) o;
    return Objects.equals(this.activate, updateUserMfaRequest.activate) &&
        Objects.equals(this.code, updateUserMfaRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activate, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserMfaRequest {\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

