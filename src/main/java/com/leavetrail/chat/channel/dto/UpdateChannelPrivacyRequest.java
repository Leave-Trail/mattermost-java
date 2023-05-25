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
 * UpdateChannelPrivacyRequest
 */

@JsonTypeName("UpdateChannelPrivacy_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class UpdateChannelPrivacyRequest {

  private String privacy;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateChannelPrivacyRequest#UpdateChannelPrivacyRequest(String)}
   */
  @Deprecated
  public UpdateChannelPrivacyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateChannelPrivacyRequest(String privacy) {
    this.privacy = privacy;
  }

  public UpdateChannelPrivacyRequest privacy(String privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * Channel privacy setting: 'O' for a public channel, 'P' for a private channel
   * @return privacy
  */
  @NotNull 
  @Schema(name = "privacy", description = "Channel privacy setting: 'O' for a public channel, 'P' for a private channel", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("privacy")
  public String getPrivacy() {
    return privacy;
  }

  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelPrivacyRequest updateChannelPrivacyRequest = (UpdateChannelPrivacyRequest) o;
    return Objects.equals(this.privacy, updateChannelPrivacyRequest.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelPrivacyRequest {\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

