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
 * UserAccessTokenSanitized
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserAccessTokenSanitized {

  private String id;

  private String userId;

  private String description;

  private Boolean isActive;

  public UserAccessTokenSanitized id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the token
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier for the token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserAccessTokenSanitized userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user the token authenticates for
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The user the token authenticates for", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserAccessTokenSanitized description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the token usage
   * @return description
  */
  
  @Schema(name = "description", description = "A description of the token usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserAccessTokenSanitized isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the token is active
   * @return isActive
  */
  
  @Schema(name = "is_active", description = "Indicates whether the token is active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessTokenSanitized userAccessTokenSanitized = (UserAccessTokenSanitized) o;
    return Objects.equals(this.id, userAccessTokenSanitized.id) &&
        Objects.equals(this.userId, userAccessTokenSanitized.userId) &&
        Objects.equals(this.description, userAccessTokenSanitized.description) &&
        Objects.equals(this.isActive, userAccessTokenSanitized.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, description, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessTokenSanitized {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

