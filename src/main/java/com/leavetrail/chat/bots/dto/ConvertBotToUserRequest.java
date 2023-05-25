package com.leavetrail.chat.bots.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.users.dto.UserNotifyProps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConvertBotToUserRequest
 */

@JsonTypeName("ConvertBotToUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T13:58:19.652456+02:00[Europe/Warsaw]")
public class ConvertBotToUserRequest {

  private String email;

  private String username;

  private String password;

  private String firstName;

  private String lastName;

  private String nickname;

  private String locale;

  private String position;

  private Object props;

  private UserNotifyProps notifyProps;

  public ConvertBotToUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ConvertBotToUserRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ConvertBotToUserRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConvertBotToUserRequest firstName(String firstName) {
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

  public ConvertBotToUserRequest lastName(String lastName) {
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

  public ConvertBotToUserRequest nickname(String nickname) {
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

  public ConvertBotToUserRequest locale(String locale) {
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

  public ConvertBotToUserRequest position(String position) {
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

  public ConvertBotToUserRequest props(Object props) {
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

  public ConvertBotToUserRequest notifyProps(UserNotifyProps notifyProps) {
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
    ConvertBotToUserRequest convertBotToUserRequest = (ConvertBotToUserRequest) o;
    return Objects.equals(this.email, convertBotToUserRequest.email) &&
        Objects.equals(this.username, convertBotToUserRequest.username) &&
        Objects.equals(this.password, convertBotToUserRequest.password) &&
        Objects.equals(this.firstName, convertBotToUserRequest.firstName) &&
        Objects.equals(this.lastName, convertBotToUserRequest.lastName) &&
        Objects.equals(this.nickname, convertBotToUserRequest.nickname) &&
        Objects.equals(this.locale, convertBotToUserRequest.locale) &&
        Objects.equals(this.position, convertBotToUserRequest.position) &&
        Objects.equals(this.props, convertBotToUserRequest.props) &&
        Objects.equals(this.notifyProps, convertBotToUserRequest.notifyProps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, password, firstName, lastName, nickname, locale, position, props, notifyProps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertBotToUserRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

