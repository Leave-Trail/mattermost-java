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
 * RevokeSessionRequest
 */

@JsonTypeName("RevokeSession_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class RevokeSessionRequest {

  private String sessionId;

  /**
   * Default constructor
   * @deprecated Use {@link RevokeSessionRequest#RevokeSessionRequest(String)}
   */
  @Deprecated
  public RevokeSessionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RevokeSessionRequest(String sessionId) {
    this.sessionId = sessionId;
  }

  public RevokeSessionRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The session GUID to revoke.
   * @return sessionId
  */
  @NotNull 
  @Schema(name = "session_id", description = "The session GUID to revoke.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("session_id")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeSessionRequest revokeSessionRequest = (RevokeSessionRequest) o;
    return Objects.equals(this.sessionId, revokeSessionRequest.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeSessionRequest {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

