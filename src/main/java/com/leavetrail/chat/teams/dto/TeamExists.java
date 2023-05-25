package com.leavetrail.chat.teams.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamExists
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class TeamExists {

  private Boolean exists;

  public TeamExists exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * Get exists
   * @return exists
  */
  
  @Schema(name = "exists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamExists teamExists = (TeamExists) o;
    return Objects.equals(this.exists, teamExists.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamExists {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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

