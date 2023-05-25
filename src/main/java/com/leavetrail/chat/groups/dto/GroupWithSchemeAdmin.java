package com.leavetrail.chat.groups.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.leavetrail.chat.groups.dto.Group;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * group augmented with scheme admin information
 */

@Schema(name = "GroupWithSchemeAdmin", description = "group augmented with scheme admin information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GroupWithSchemeAdmin {

  private Group group;

  private Boolean schemeAdmin;

  public GroupWithSchemeAdmin group(Group group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public GroupWithSchemeAdmin schemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
    return this;
  }

  /**
   * Get schemeAdmin
   * @return schemeAdmin
  */
  
  @Schema(name = "scheme_admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheme_admin")
  public Boolean getSchemeAdmin() {
    return schemeAdmin;
  }

  public void setSchemeAdmin(Boolean schemeAdmin) {
    this.schemeAdmin = schemeAdmin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupWithSchemeAdmin groupWithSchemeAdmin = (GroupWithSchemeAdmin) o;
    return Objects.equals(this.group, groupWithSchemeAdmin.group) &&
        Objects.equals(this.schemeAdmin, groupWithSchemeAdmin.schemeAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, schemeAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupWithSchemeAdmin {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    schemeAdmin: ").append(toIndentedString(schemeAdmin)).append("\n");
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

