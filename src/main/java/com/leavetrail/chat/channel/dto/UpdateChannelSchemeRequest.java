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
 * UpdateChannelSchemeRequest
 */

@JsonTypeName("UpdateChannelScheme_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class UpdateChannelSchemeRequest {

  private String schemeId;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateChannelSchemeRequest#UpdateChannelSchemeRequest(String)}
   */
  @Deprecated
  public UpdateChannelSchemeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateChannelSchemeRequest(String schemeId) {
    this.schemeId = schemeId;
  }

  public UpdateChannelSchemeRequest schemeId(String schemeId) {
    this.schemeId = schemeId;
    return this;
  }

  /**
   * The ID of the scheme.
   * @return schemeId
  */
  @NotNull 
  @Schema(name = "scheme_id", description = "The ID of the scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheme_id")
  public String getSchemeId() {
    return schemeId;
  }

  public void setSchemeId(String schemeId) {
    this.schemeId = schemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelSchemeRequest updateChannelSchemeRequest = (UpdateChannelSchemeRequest) o;
    return Objects.equals(this.schemeId, updateChannelSchemeRequest.schemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelSchemeRequest {\n");
    sb.append("    schemeId: ").append(toIndentedString(schemeId)).append("\n");
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

