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
 * SwitchAccountType200Response
 */

@JsonTypeName("SwitchAccountType_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class SwitchAccountType200Response {

  private String followLink;

  public SwitchAccountType200Response followLink(String followLink) {
    this.followLink = followLink;
    return this;
  }

  /**
   * The link for the user to follow to login or to complete the account switching when the current service is OAuth2/SAML
   * @return followLink
  */
  
  @Schema(name = "follow_link", description = "The link for the user to follow to login or to complete the account switching when the current service is OAuth2/SAML", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follow_link")
  public String getFollowLink() {
    return followLink;
  }

  public void setFollowLink(String followLink) {
    this.followLink = followLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchAccountType200Response switchAccountType200Response = (SwitchAccountType200Response) o;
    return Objects.equals(this.followLink, switchAccountType200Response.followLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchAccountType200Response {\n");
    sb.append("    followLink: ").append(toIndentedString(followLink)).append("\n");
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

