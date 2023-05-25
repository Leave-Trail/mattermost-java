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
 * SendPasswordResetEmailRequest
 */

@JsonTypeName("SendPasswordResetEmail_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class SendPasswordResetEmailRequest {

  private String email;

  /**
   * Default constructor
   * @deprecated Use {@link SendPasswordResetEmailRequest#SendPasswordResetEmailRequest(String)}
   */
  @Deprecated
  public SendPasswordResetEmailRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SendPasswordResetEmailRequest(String email) {
    this.email = email;
  }

  public SendPasswordResetEmailRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "The email of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendPasswordResetEmailRequest sendPasswordResetEmailRequest = (SendPasswordResetEmailRequest) o;
    return Objects.equals(this.email, sendPasswordResetEmailRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendPasswordResetEmailRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

