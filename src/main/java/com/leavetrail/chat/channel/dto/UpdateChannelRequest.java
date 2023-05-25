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
 * UpdateChannelRequest
 */

@JsonTypeName("UpdateChannel_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class UpdateChannelRequest {

  private String id;

  private String name;

  private String displayName;

  private String purpose;

  private String header;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateChannelRequest#UpdateChannelRequest(String)}
   */
  @Deprecated
  public UpdateChannelRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateChannelRequest(String id) {
    this.id = id;
  }

  public UpdateChannelRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The channel's id, not updatable
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The channel's id, not updatable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateChannelRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique handle for the channel, will be present in the channel URL
   * @return name
  */
  
  @Schema(name = "name", description = "The unique handle for the channel, will be present in the channel URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateChannelRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The non-unique UI name for the channel
   * @return displayName
  */
  
  @Schema(name = "display_name", description = "The non-unique UI name for the channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UpdateChannelRequest purpose(String purpose) {
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

  public UpdateChannelRequest header(String header) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelRequest updateChannelRequest = (UpdateChannelRequest) o;
    return Objects.equals(this.id, updateChannelRequest.id) &&
        Objects.equals(this.name, updateChannelRequest.name) &&
        Objects.equals(this.displayName, updateChannelRequest.displayName) &&
        Objects.equals(this.purpose, updateChannelRequest.purpose) &&
        Objects.equals(this.header, updateChannelRequest.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, purpose, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

