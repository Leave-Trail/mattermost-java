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
 * MigrateAuthToSamlRequest
 */

@JsonTypeName("MigrateAuthToSaml_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class MigrateAuthToSamlRequest {

  private String from;

  private Object matches;

  private Boolean auto;

  /**
   * Default constructor
   * @deprecated Use {@link MigrateAuthToSamlRequest#MigrateAuthToSamlRequest(String, Object, Boolean)}
   */
  @Deprecated
  public MigrateAuthToSamlRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MigrateAuthToSamlRequest(String from, Object matches, Boolean auto) {
    this.from = from;
    this.matches = matches;
    this.auto = auto;
  }

  public MigrateAuthToSamlRequest from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The current authentication type for the matched users.
   * @return from
  */
  @NotNull 
  @Schema(name = "from", description = "The current authentication type for the matched users.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MigrateAuthToSamlRequest matches(Object matches) {
    this.matches = matches;
    return this;
  }

  /**
   * Users map.
   * @return matches
  */
  @NotNull 
  @Schema(name = "matches", description = "Users map.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matches")
  public Object getMatches() {
    return matches;
  }

  public void setMatches(Object matches) {
    this.matches = matches;
  }

  public MigrateAuthToSamlRequest auto(Boolean auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Get auto
   * @return auto
  */
  @NotNull 
  @Schema(name = "auto", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("auto")
  public Boolean getAuto() {
    return auto;
  }

  public void setAuto(Boolean auto) {
    this.auto = auto;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateAuthToSamlRequest migrateAuthToSamlRequest = (MigrateAuthToSamlRequest) o;
    return Objects.equals(this.from, migrateAuthToSamlRequest.from) &&
        Objects.equals(this.matches, migrateAuthToSamlRequest.matches) &&
        Objects.equals(this.auto, migrateAuthToSamlRequest.auto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, matches, auto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateAuthToSamlRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
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

