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
 * EnableUserAccessTokenRequest
 */

@JsonTypeName("EnableUserAccessToken_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class EnableUserAccessTokenRequest {

  private String tokenId;

  /**
   * Default constructor
   * @deprecated Use {@link EnableUserAccessTokenRequest#EnableUserAccessTokenRequest(String)}
   */
  @Deprecated
  public EnableUserAccessTokenRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnableUserAccessTokenRequest(String tokenId) {
    this.tokenId = tokenId;
  }

  public EnableUserAccessTokenRequest tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * The personal access token GUID to enable
   * @return tokenId
  */
  @NotNull 
  @Schema(name = "token_id", description = "The personal access token GUID to enable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token_id")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableUserAccessTokenRequest enableUserAccessTokenRequest = (EnableUserAccessTokenRequest) o;
    return Objects.equals(this.tokenId, enableUserAccessTokenRequest.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableUserAccessTokenRequest {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

