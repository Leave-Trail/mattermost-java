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
 * CreateUserAccessTokenRequest
 */

@JsonTypeName("CreateUserAccessToken_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class CreateUserAccessTokenRequest {

  private String description;

  /**
   * Default constructor
   * @deprecated Use {@link CreateUserAccessTokenRequest#CreateUserAccessTokenRequest(String)}
   */
  @Deprecated
  public CreateUserAccessTokenRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserAccessTokenRequest(String description) {
    this.description = description;
  }

  public CreateUserAccessTokenRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the token usage
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "A description of the token usage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserAccessTokenRequest createUserAccessTokenRequest = (CreateUserAccessTokenRequest) o;
    return Objects.equals(this.description, createUserAccessTokenRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserAccessTokenRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

