package com.leavetrail.chat.users.dto;

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
 * UserTermsOfService
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserTermsOfService {

  private String userId;

  private String termsOfServiceId;

  private Long createAt;

  public UserTermsOfService userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The unique identifier of the user who performed this terms of service action.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The unique identifier of the user who performed this terms of service action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserTermsOfService termsOfServiceId(String termsOfServiceId) {
    this.termsOfServiceId = termsOfServiceId;
    return this;
  }

  /**
   * The unique identifier of the terms of service the action was performed on.
   * @return termsOfServiceId
  */
  
  @Schema(name = "terms_of_service_id", description = "The unique identifier of the terms of service the action was performed on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terms_of_service_id")
  public String getTermsOfServiceId() {
    return termsOfServiceId;
  }

  public void setTermsOfServiceId(String termsOfServiceId) {
    this.termsOfServiceId = termsOfServiceId;
  }

  public UserTermsOfService createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds that this action was performed.
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds that this action was performed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTermsOfService userTermsOfService = (UserTermsOfService) o;
    return Objects.equals(this.userId, userTermsOfService.userId) &&
        Objects.equals(this.termsOfServiceId, userTermsOfService.termsOfServiceId) &&
        Objects.equals(this.createAt, userTermsOfService.createAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, termsOfServiceId, createAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTermsOfService {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    termsOfServiceId: ").append(toIndentedString(termsOfServiceId)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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

