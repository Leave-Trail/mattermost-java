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
 * VerifyUserEmailRequest
 */

@JsonTypeName("VerifyUserEmail_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class VerifyUserEmailRequest {

  private String token;

  /**
   * Default constructor
   * @deprecated Use {@link VerifyUserEmailRequest#VerifyUserEmailRequest(String)}
   */
  @Deprecated
  public VerifyUserEmailRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VerifyUserEmailRequest(String token) {
    this.token = token;
  }

  public VerifyUserEmailRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token given to validate the email
   * @return token
  */
  @NotNull 
  @Schema(name = "token", description = "The token given to validate the email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyUserEmailRequest verifyUserEmailRequest = (VerifyUserEmailRequest) o;
    return Objects.equals(this.token, verifyUserEmailRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyUserEmailRequest {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

