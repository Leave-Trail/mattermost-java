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
 * UpdateUserActiveRequest
 */

@JsonTypeName("UpdateUserActive_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UpdateUserActiveRequest {

  private Boolean active;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateUserActiveRequest#UpdateUserActiveRequest(Boolean)}
   */
  @Deprecated
  public UpdateUserActiveRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserActiveRequest(Boolean active) {
    this.active = active;
  }

  public UpdateUserActiveRequest active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @NotNull 
  @Schema(name = "active", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserActiveRequest updateUserActiveRequest = (UpdateUserActiveRequest) o;
    return Objects.equals(this.active, updateUserActiveRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserActiveRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

