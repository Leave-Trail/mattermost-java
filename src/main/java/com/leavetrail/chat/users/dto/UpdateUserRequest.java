package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.users.dto.Timezone;
import com.leavetrail.chat.users.dto.UserNotifyProps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateUserRequest
 */

@JsonTypeName("UpdateUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UpdateUserRequest {

  private String id;

  private String email;

  private String username;

  private String firstName;

  private String lastName;

  private String nickname;

  private String locale;

  private String position;

  private Timezone timezone;

  private Object props;

  private UserNotifyProps notifyProps;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateUserRequest#UpdateUserRequest(String, String, String)}
   */
  @Deprecated
  public UpdateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserRequest(String id, String email, String username) {
    this.id = id;
    this.email = email;
    this.username = username;
  }

  public UpdateUserRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateUserRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UpdateUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateUserRequest nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Get nickname
   * @return nickname
  */
  
  @Schema(name = "nickname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public UpdateUserRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UpdateUserRequest position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public UpdateUserRequest timezone(Timezone timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  */
  @Valid 
  @Schema(name = "timezone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timezone")
  public Timezone getTimezone() {
    return timezone;
  }

  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  public UpdateUserRequest props(Object props) {
    this.props = props;
    return this;
  }

  /**
   * Get props
   * @return props
  */
  
  @Schema(name = "props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public Object getProps() {
    return props;
  }

  public void setProps(Object props) {
    this.props = props;
  }

  public UpdateUserRequest notifyProps(UserNotifyProps notifyProps) {
    this.notifyProps = notifyProps;
    return this;
  }

  /**
   * Get notifyProps
   * @return notifyProps
  */
  @Valid 
  @Schema(name = "notify_props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify_props")
  public UserNotifyProps getNotifyProps() {
    return notifyProps;
  }

  public void setNotifyProps(UserNotifyProps notifyProps) {
    this.notifyProps = notifyProps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.id, updateUserRequest.id) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.username, updateUserRequest.username) &&
        Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.nickname, updateUserRequest.nickname) &&
        Objects.equals(this.locale, updateUserRequest.locale) &&
        Objects.equals(this.position, updateUserRequest.position) &&
        Objects.equals(this.timezone, updateUserRequest.timezone) &&
        Objects.equals(this.props, updateUserRequest.props) &&
        Objects.equals(this.notifyProps, updateUserRequest.notifyProps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, username, firstName, lastName, nickname, locale, position, timezone, props, notifyProps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
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

