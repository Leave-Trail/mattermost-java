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
 * UserAccessToken
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserAccessToken {

  private String id;

  private String token;

  private String userId;

  private String description;

  public UserAccessToken id(String id) {
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

  public UserAccessToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token used for authentication
   * @return token
  */
  
  @Schema(name = "token", description = "The token used for authentication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserAccessToken userId(String userId) {
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

  public UserAccessToken description(String description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessToken userAccessToken = (UserAccessToken) o;
    return Objects.equals(this.id, userAccessToken.id) &&
        Objects.equals(this.token, userAccessToken.token) &&
        Objects.equals(this.userId, userAccessToken.userId) &&
        Objects.equals(this.description, userAccessToken.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, userId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

