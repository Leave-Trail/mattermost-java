package com.leavetrail.chat.groups.dto;

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
 * PatchGroupSyncableForTeamRequest
 */

@JsonTypeName("PatchGroupSyncableForTeam_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class PatchGroupSyncableForTeamRequest {

  private Boolean autoAdd;

  public PatchGroupSyncableForTeamRequest autoAdd(Boolean autoAdd) {
    this.autoAdd = autoAdd;
    return this;
  }

  /**
   * Get autoAdd
   * @return autoAdd
  */
  
  @Schema(name = "auto_add", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_add")
  public Boolean getAutoAdd() {
    return autoAdd;
  }

  public void setAutoAdd(Boolean autoAdd) {
    this.autoAdd = autoAdd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchGroupSyncableForTeamRequest patchGroupSyncableForTeamRequest = (PatchGroupSyncableForTeamRequest) o;
    return Objects.equals(this.autoAdd, patchGroupSyncableForTeamRequest.autoAdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAdd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchGroupSyncableForTeamRequest {\n");
    sb.append("    autoAdd: ").append(toIndentedString(autoAdd)).append("\n");
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

