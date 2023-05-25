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
 * GenerateMfaSecret200Response
 */

@JsonTypeName("GenerateMfaSecret_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class GenerateMfaSecret200Response {

  private String secret;

  private String qrCode;

  public GenerateMfaSecret200Response secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * The MFA secret as a string
   * @return secret
  */
  
  @Schema(name = "secret", description = "The MFA secret as a string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public GenerateMfaSecret200Response qrCode(String qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  /**
   * A base64 encoded QR code image
   * @return qrCode
  */
  
  @Schema(name = "qr_code", description = "A base64 encoded QR code image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qr_code")
  public String getQrCode() {
    return qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateMfaSecret200Response generateMfaSecret200Response = (GenerateMfaSecret200Response) o;
    return Objects.equals(this.secret, generateMfaSecret200Response.secret) &&
        Objects.equals(this.qrCode, generateMfaSecret200Response.qrCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, qrCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateMfaSecret200Response {\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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

