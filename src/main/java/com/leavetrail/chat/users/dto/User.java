package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class User {

  private String id;

  private Long createAt;

  private Long updateAt;

  private Long deleteAt;

  private String username;

  private String firstName;

  private String lastName;

  private String nickname;

  private String email;

  private Boolean emailVerified;

  private String authService;

  private String roles;

  private String locale;

  private UserNotifyProps notifyProps;

  private Object props;

  private Integer lastPasswordUpdate;

  private Integer lastPictureUpdate;

  private Integer failedAttempts;

  private Boolean mfaActive;

  private Timezone timezone;

  private String termsOfServiceId;

  private Long termsOfServiceCreateAt;

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * The time in milliseconds a user was created
   * @return createAt
  */
  
  @Schema(name = "create_at", description = "The time in milliseconds a user was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_at")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public User updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

  /**
   * The time in milliseconds a user was last updated
   * @return updateAt
  */
  
  @Schema(name = "update_at", description = "The time in milliseconds a user was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_at")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public User deleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * The time in milliseconds a user was deleted
   * @return deleteAt
  */
  
  @Schema(name = "delete_at", description = "The time in milliseconds a user was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public Long getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Long deleteAt) {
    this.deleteAt = deleteAt;
  }

  public User username(String username) {
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

  public User firstName(String firstName) {
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

  public User lastName(String lastName) {
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

  public User nickname(String nickname) {
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

  public User email(String email) {
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

  public User emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * Get emailVerified
   * @return emailVerified
  */
  
  @Schema(name = "email_verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email_verified")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public User authService(String authService) {
    this.authService = authService;
    return this;
  }

  /**
   * Get authService
   * @return authService
  */
  
  @Schema(name = "auth_service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth_service")
  public String getAuthService() {
    return authService;
  }

  public void setAuthService(String authService) {
    this.authService = authService;
  }

  public User roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public User locale(String locale) {
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

  public User notifyProps(UserNotifyProps notifyProps) {
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

  public User props(Object props) {
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

  public User lastPasswordUpdate(Integer lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
    return this;
  }

  /**
   * Get lastPasswordUpdate
   * @return lastPasswordUpdate
  */
  
  @Schema(name = "last_password_update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_password_update")
  public Integer getLastPasswordUpdate() {
    return lastPasswordUpdate;
  }

  public void setLastPasswordUpdate(Integer lastPasswordUpdate) {
    this.lastPasswordUpdate = lastPasswordUpdate;
  }

  public User lastPictureUpdate(Integer lastPictureUpdate) {
    this.lastPictureUpdate = lastPictureUpdate;
    return this;
  }

  /**
   * Get lastPictureUpdate
   * @return lastPictureUpdate
  */
  
  @Schema(name = "last_picture_update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_picture_update")
  public Integer getLastPictureUpdate() {
    return lastPictureUpdate;
  }

  public void setLastPictureUpdate(Integer lastPictureUpdate) {
    this.lastPictureUpdate = lastPictureUpdate;
  }

  public User failedAttempts(Integer failedAttempts) {
    this.failedAttempts = failedAttempts;
    return this;
  }

  /**
   * Get failedAttempts
   * @return failedAttempts
  */
  
  @Schema(name = "failed_attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failed_attempts")
  public Integer getFailedAttempts() {
    return failedAttempts;
  }

  public void setFailedAttempts(Integer failedAttempts) {
    this.failedAttempts = failedAttempts;
  }

  public User mfaActive(Boolean mfaActive) {
    this.mfaActive = mfaActive;
    return this;
  }

  /**
   * Get mfaActive
   * @return mfaActive
  */
  
  @Schema(name = "mfa_active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mfa_active")
  public Boolean getMfaActive() {
    return mfaActive;
  }

  public void setMfaActive(Boolean mfaActive) {
    this.mfaActive = mfaActive;
  }

  public User timezone(Timezone timezone) {
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

  public User termsOfServiceId(String termsOfServiceId) {
    this.termsOfServiceId = termsOfServiceId;
    return this;
  }

  /**
   * ID of accepted terms of service, if any. This field is not present if empty.
   * @return termsOfServiceId
  */
  
  @Schema(name = "terms_of_service_id", description = "ID of accepted terms of service, if any. This field is not present if empty.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terms_of_service_id")
  public String getTermsOfServiceId() {
    return termsOfServiceId;
  }

  public void setTermsOfServiceId(String termsOfServiceId) {
    this.termsOfServiceId = termsOfServiceId;
  }

  public User termsOfServiceCreateAt(Long termsOfServiceCreateAt) {
    this.termsOfServiceCreateAt = termsOfServiceCreateAt;
    return this;
  }

  /**
   * The time in milliseconds the user accepted the terms of service
   * @return termsOfServiceCreateAt
  */
  
  @Schema(name = "terms_of_service_create_at", description = "The time in milliseconds the user accepted the terms of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terms_of_service_create_at")
  public Long getTermsOfServiceCreateAt() {
    return termsOfServiceCreateAt;
  }

  public void setTermsOfServiceCreateAt(Long termsOfServiceCreateAt) {
    this.termsOfServiceCreateAt = termsOfServiceCreateAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.createAt, user.createAt) &&
        Objects.equals(this.updateAt, user.updateAt) &&
        Objects.equals(this.deleteAt, user.deleteAt) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.emailVerified, user.emailVerified) &&
        Objects.equals(this.authService, user.authService) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.notifyProps, user.notifyProps) &&
        Objects.equals(this.props, user.props) &&
        Objects.equals(this.lastPasswordUpdate, user.lastPasswordUpdate) &&
        Objects.equals(this.lastPictureUpdate, user.lastPictureUpdate) &&
        Objects.equals(this.failedAttempts, user.failedAttempts) &&
        Objects.equals(this.mfaActive, user.mfaActive) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.termsOfServiceId, user.termsOfServiceId) &&
        Objects.equals(this.termsOfServiceCreateAt, user.termsOfServiceCreateAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, username, firstName, lastName, nickname, email, emailVerified, authService, roles, locale, notifyProps, props, lastPasswordUpdate, lastPictureUpdate, failedAttempts, mfaActive, timezone, termsOfServiceId, termsOfServiceCreateAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    authService: ").append(toIndentedString(authService)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    notifyProps: ").append(toIndentedString(notifyProps)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    lastPasswordUpdate: ").append(toIndentedString(lastPasswordUpdate)).append("\n");
    sb.append("    lastPictureUpdate: ").append(toIndentedString(lastPictureUpdate)).append("\n");
    sb.append("    failedAttempts: ").append(toIndentedString(failedAttempts)).append("\n");
    sb.append("    mfaActive: ").append(toIndentedString(mfaActive)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    termsOfServiceId: ").append(toIndentedString(termsOfServiceId)).append("\n");
    sb.append("    termsOfServiceCreateAt: ").append(toIndentedString(termsOfServiceCreateAt)).append("\n");
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

