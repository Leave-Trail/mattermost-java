package com.leavetrail.chat.channel.dto;

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
 * CreateChannelRequest
 */

@JsonTypeName("CreateChannel_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class CreateChannelRequest {

  private String teamId;

  private String name;

  private String displayName;

  private String purpose;

  private String header;

  private String type;

  /**
   * Default constructor
   * @deprecated Use {@link CreateChannelRequest#CreateChannelRequest(String, String, String, String)}
   */
  @Deprecated
  public CreateChannelRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChannelRequest(String teamId, String name, String displayName, String type) {
    this.teamId = teamId;
    this.name = name;
    this.displayName = displayName;
    this.type = type;
  }

  public CreateChannelRequest teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The team ID of the team to create the channel on
   * @return teamId
  */
  @NotNull 
  @Schema(name = "team_id", description = "The team ID of the team to create the channel on", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public CreateChannelRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique handle for the channel, will be present in the channel URL
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The unique handle for the channel, will be present in the channel URL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateChannelRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The non-unique UI name for the channel
   * @return displayName
  */
  @NotNull 
  @Schema(name = "display_name", description = "The non-unique UI name for the channel", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateChannelRequest purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * A short description of the purpose of the channel
   * @return purpose
  */
  
  @Schema(name = "purpose", description = "A short description of the purpose of the channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public CreateChannelRequest header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Markdown-formatted text to display in the header of the channel
   * @return header
  */
  
  @Schema(name = "header", description = "Markdown-formatted text to display in the header of the channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public CreateChannelRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 'O' for a public channel, 'P' for a private channel
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "'O' for a public channel, 'P' for a private channel", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChannelRequest createChannelRequest = (CreateChannelRequest) o;
    return Objects.equals(this.teamId, createChannelRequest.teamId) &&
        Objects.equals(this.name, createChannelRequest.name) &&
        Objects.equals(this.displayName, createChannelRequest.displayName) &&
        Objects.equals(this.purpose, createChannelRequest.purpose) &&
        Objects.equals(this.header, createChannelRequest.header) &&
        Objects.equals(this.type, createChannelRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, name, displayName, purpose, header, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelRequest {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

