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
 * CheckUserMfa200Response
 */

@JsonTypeName("CheckUserMfa_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class CheckUserMfa200Response {

  private Boolean mfaRequired;

  public CheckUserMfa200Response mfaRequired(Boolean mfaRequired) {
    this.mfaRequired = mfaRequired;
    return this;
  }

  /**
   * Value will `true` if MFA is active, `false` otherwise
   * @return mfaRequired
  */
  
  @Schema(name = "mfa_required", description = "Value will `true` if MFA is active, `false` otherwise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mfa_required")
  public Boolean getMfaRequired() {
    return mfaRequired;
  }

  public void setMfaRequired(Boolean mfaRequired) {
    this.mfaRequired = mfaRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserMfa200Response checkUserMfa200Response = (CheckUserMfa200Response) o;
    return Objects.equals(this.mfaRequired, checkUserMfa200Response.mfaRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfaRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserMfa200Response {\n");
    sb.append("    mfaRequired: ").append(toIndentedString(mfaRequired)).append("\n");
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

