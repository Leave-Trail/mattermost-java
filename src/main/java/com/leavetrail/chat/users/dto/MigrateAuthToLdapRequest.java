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
 * MigrateAuthToLdapRequest
 */

@JsonTypeName("MigrateAuthToLdap_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class MigrateAuthToLdapRequest {

  private String from;

  private String matchField;

  private Boolean force;

  /**
   * Default constructor
   * @deprecated Use {@link MigrateAuthToLdapRequest#MigrateAuthToLdapRequest(String, String, Boolean)}
   */
  @Deprecated
  public MigrateAuthToLdapRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MigrateAuthToLdapRequest(String from, String matchField, Boolean force) {
    this.from = from;
    this.matchField = matchField;
    this.force = force;
  }

  public MigrateAuthToLdapRequest from(String from) {
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

  public MigrateAuthToLdapRequest matchField(String matchField) {
    this.matchField = matchField;
    return this;
  }

  /**
   * Foreign user field name to match.
   * @return matchField
  */
  @NotNull 
  @Schema(name = "match_field", description = "Foreign user field name to match.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match_field")
  public String getMatchField() {
    return matchField;
  }

  public void setMatchField(String matchField) {
    this.matchField = matchField;
  }

  public MigrateAuthToLdapRequest force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Get force
   * @return force
  */
  @NotNull 
  @Schema(name = "force", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateAuthToLdapRequest migrateAuthToLdapRequest = (MigrateAuthToLdapRequest) o;
    return Objects.equals(this.from, migrateAuthToLdapRequest.from) &&
        Objects.equals(this.matchField, migrateAuthToLdapRequest.matchField) &&
        Objects.equals(this.force, migrateAuthToLdapRequest.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, matchField, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateAuthToLdapRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    matchField: ").append(toIndentedString(matchField)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

