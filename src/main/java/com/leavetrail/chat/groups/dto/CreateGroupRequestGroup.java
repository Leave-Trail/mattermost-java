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
 * Group object to create.
 */

@Schema(name = "CreateGroup_request_group", description = "Group object to create.")
@JsonTypeName("CreateGroup_request_group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class CreateGroupRequestGroup {

  private String name;

  private String displayName;

  private String source;

  private Boolean allowReference;

  /**
   * Default constructor
   * @deprecated Use {@link CreateGroupRequestGroup#CreateGroupRequestGroup(String, String, String, Boolean)}
   */
  @Deprecated
  public CreateGroupRequestGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateGroupRequestGroup(String name, String displayName, String source, Boolean allowReference) {
    this.name = name;
    this.displayName = displayName;
    this.source = source;
    this.allowReference = allowReference;
  }

  public CreateGroupRequestGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique group name used for at-mentioning.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The unique group name used for at-mentioning.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateGroupRequestGroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the group which can include spaces.
   * @return displayName
  */
  @NotNull 
  @Schema(name = "display_name", description = "The display name of the group which can include spaces.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateGroupRequestGroup source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Must be `custom`
   * @return source
  */
  @NotNull 
  @Schema(name = "source", description = "Must be `custom`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CreateGroupRequestGroup allowReference(Boolean allowReference) {
    this.allowReference = allowReference;
    return this;
  }

  /**
   * Must be true
   * @return allowReference
  */
  @NotNull 
  @Schema(name = "allow_reference", description = "Must be true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allow_reference")
  public Boolean getAllowReference() {
    return allowReference;
  }

  public void setAllowReference(Boolean allowReference) {
    this.allowReference = allowReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequestGroup createGroupRequestGroup = (CreateGroupRequestGroup) o;
    return Objects.equals(this.name, createGroupRequestGroup.name) &&
        Objects.equals(this.displayName, createGroupRequestGroup.displayName) &&
        Objects.equals(this.source, createGroupRequestGroup.source) &&
        Objects.equals(this.allowReference, createGroupRequestGroup.allowReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, source, allowReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequestGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    allowReference: ").append(toIndentedString(allowReference)).append("\n");
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

