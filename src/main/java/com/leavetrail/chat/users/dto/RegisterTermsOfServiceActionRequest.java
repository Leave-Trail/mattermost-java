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
 * RegisterTermsOfServiceActionRequest
 */

@JsonTypeName("RegisterTermsOfServiceAction_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class RegisterTermsOfServiceActionRequest {

  private String serviceTermsId;

  private String accepted;

  /**
   * Default constructor
   * @deprecated Use {@link RegisterTermsOfServiceActionRequest#RegisterTermsOfServiceActionRequest(String, String)}
   */
  @Deprecated
  public RegisterTermsOfServiceActionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterTermsOfServiceActionRequest(String serviceTermsId, String accepted) {
    this.serviceTermsId = serviceTermsId;
    this.accepted = accepted;
  }

  public RegisterTermsOfServiceActionRequest serviceTermsId(String serviceTermsId) {
    this.serviceTermsId = serviceTermsId;
    return this;
  }

  /**
   * terms of service ID on which the user is acting on
   * @return serviceTermsId
  */
  @NotNull 
  @Schema(name = "serviceTermsId", description = "terms of service ID on which the user is acting on", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceTermsId")
  public String getServiceTermsId() {
    return serviceTermsId;
  }

  public void setServiceTermsId(String serviceTermsId) {
    this.serviceTermsId = serviceTermsId;
  }

  public RegisterTermsOfServiceActionRequest accepted(String accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * true or false, indicates whether the user accepted or rejected the terms of service.
   * @return accepted
  */
  @NotNull 
  @Schema(name = "accepted", description = "true or false, indicates whether the user accepted or rejected the terms of service.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accepted")
  public String getAccepted() {
    return accepted;
  }

  public void setAccepted(String accepted) {
    this.accepted = accepted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterTermsOfServiceActionRequest registerTermsOfServiceActionRequest = (RegisterTermsOfServiceActionRequest) o;
    return Objects.equals(this.serviceTermsId, registerTermsOfServiceActionRequest.serviceTermsId) &&
        Objects.equals(this.accepted, registerTermsOfServiceActionRequest.accepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTermsId, accepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterTermsOfServiceActionRequest {\n");
    sb.append("    serviceTermsId: ").append(toIndentedString(serviceTermsId)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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

