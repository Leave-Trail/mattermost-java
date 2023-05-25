package com.leavetrail.chat.users.dto;

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
 * CreateUserRequest
 */

@JsonTypeName("CreateUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class CreateUserRequest {

  private String email;

  private String username;

  private String firstName;

  private String lastName;

  private String nickname;

  private String authData;

  private String authService;

  private String password;

  private String locale;

  private Object props;

  private UserNotifyProps notifyProps;

  /**
   * Default constructor
   * @deprecated Use {@link CreateUserRequest#CreateUserRequest(String, String)}
   */
  @Deprecated
  public CreateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserRequest(String email, String username) {
    this.email = email;
    this.username = username;
  }

  public CreateUserRequest email(String email) {
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

  public CreateUserRequest username(String username) {
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

  public CreateUserRequest firstName(String firstName) {
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

  public CreateUserRequest lastName(String lastName) {
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

  public CreateUserRequest nickname(String nickname) {
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

  public CreateUserRequest authData(String authData) {
    this.authData = authData;
    return this;
  }

  /**
   * Service-specific authentication data, such as email address.
   * @return authData
  */
  
  @Schema(name = "auth_data", description = "Service-specific authentication data, such as email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth_data")
  public String getAuthData() {
    return authData;
  }

  public void setAuthData(String authData) {
    this.authData = authData;
  }

  public CreateUserRequest authService(String authService) {
    this.authService = authService;
    return this;
  }

  /**
   * The authentication service, one of \"email\", \"gitlab\", \"ldap\", \"saml\", \"office365\", \"google\", and \"\".
   * @return authService
  */
  
  @Schema(name = "auth_service", description = "The authentication service, one of \"email\", \"gitlab\", \"ldap\", \"saml\", \"office365\", \"google\", and \"\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth_service")
  public String getAuthService() {
    return authService;
  }

  public void setAuthService(String authService) {
    this.authService = authService;
  }

  public CreateUserRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password used for email authentication.
   * @return password
  */
  
  @Schema(name = "password", description = "The password used for email authentication.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserRequest locale(String locale) {
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

  public CreateUserRequest props(Object props) {
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

  public CreateUserRequest notifyProps(UserNotifyProps notifyProps) {
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
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.username, createUserRequest.username) &&
        Objects.equals(this.firstName, createUserRequest.firstName) &&
        Objects.equals(this.lastName, createUserRequest.lastName) &&
        Objects.equals(this.nickname, createUserRequest.nickname) &&
        Objects.equals(this.authData, createUserRequest.authData) &&
        Objects.equals(this.authService, createUserRequest.authService) &&
        Objects.equals(this.password, createUserRequest.password) &&
        Objects.equals(this.locale, createUserRequest.locale) &&
        Objects.equals(this.props, createUserRequest.props) &&
        Objects.equals(this.notifyProps, createUserRequest.notifyProps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, firstName, lastName, nickname, authData, authService, password, locale, props, notifyProps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    authService: ").append(toIndentedString(authService)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

