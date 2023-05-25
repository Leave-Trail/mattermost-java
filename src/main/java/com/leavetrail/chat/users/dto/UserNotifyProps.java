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
 * UserNotifyProps
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:11:49.391170+02:00[Europe/Warsaw]")
public class UserNotifyProps {

  private String email;

  private String push;

  private String desktop;

  private String desktopSound;

  private String mentionKeys;

  private String channel;

  private String firstName;

  public UserNotifyProps email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Set to \"true\" to enable email notifications, \"false\" to disable. Defaults to \"true\".
   * @return email
  */
  
  @Schema(name = "email", description = "Set to \"true\" to enable email notifications, \"false\" to disable. Defaults to \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserNotifyProps push(String push) {
    this.push = push;
    return this;
  }

  /**
   * Set to \"all\" to receive push notifications for all activity, \"mention\" for mentions and direct messages only, and \"none\" to disable. Defaults to \"mention\".
   * @return push
  */
  
  @Schema(name = "push", description = "Set to \"all\" to receive push notifications for all activity, \"mention\" for mentions and direct messages only, and \"none\" to disable. Defaults to \"mention\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("push")
  public String getPush() {
    return push;
  }

  public void setPush(String push) {
    this.push = push;
  }

  public UserNotifyProps desktop(String desktop) {
    this.desktop = desktop;
    return this;
  }

  /**
   * Set to \"all\" to receive desktop notifications for all activity, \"mention\" for mentions and direct messages only, and \"none\" to disable. Defaults to \"all\".
   * @return desktop
  */
  
  @Schema(name = "desktop", description = "Set to \"all\" to receive desktop notifications for all activity, \"mention\" for mentions and direct messages only, and \"none\" to disable. Defaults to \"all\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("desktop")
  public String getDesktop() {
    return desktop;
  }

  public void setDesktop(String desktop) {
    this.desktop = desktop;
  }

  public UserNotifyProps desktopSound(String desktopSound) {
    this.desktopSound = desktopSound;
    return this;
  }

  /**
   * Set to \"true\" to enable sound on desktop notifications, \"false\" to disable. Defaults to \"true\".
   * @return desktopSound
  */
  
  @Schema(name = "desktop_sound", description = "Set to \"true\" to enable sound on desktop notifications, \"false\" to disable. Defaults to \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("desktop_sound")
  public String getDesktopSound() {
    return desktopSound;
  }

  public void setDesktopSound(String desktopSound) {
    this.desktopSound = desktopSound;
  }

  public UserNotifyProps mentionKeys(String mentionKeys) {
    this.mentionKeys = mentionKeys;
    return this;
  }

  /**
   * A comma-separated list of words to count as mentions. Defaults to username and @username.
   * @return mentionKeys
  */
  
  @Schema(name = "mention_keys", description = "A comma-separated list of words to count as mentions. Defaults to username and @username.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mention_keys")
  public String getMentionKeys() {
    return mentionKeys;
  }

  public void setMentionKeys(String mentionKeys) {
    this.mentionKeys = mentionKeys;
  }

  public UserNotifyProps channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Set to \"true\" to enable channel-wide notifications (@channel, @all, etc.), \"false\" to disable. Defaults to \"true\".
   * @return channel
  */
  
  @Schema(name = "channel", description = "Set to \"true\" to enable channel-wide notifications (@channel, @all, etc.), \"false\" to disable. Defaults to \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public UserNotifyProps firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Set to \"true\" to enable mentions for first name. Defaults to \"true\" if a first name is set, \"false\" otherwise.
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "Set to \"true\" to enable mentions for first name. Defaults to \"true\" if a first name is set, \"false\" otherwise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotifyProps userNotifyProps = (UserNotifyProps) o;
    return Objects.equals(this.email, userNotifyProps.email) &&
        Objects.equals(this.push, userNotifyProps.push) &&
        Objects.equals(this.desktop, userNotifyProps.desktop) &&
        Objects.equals(this.desktopSound, userNotifyProps.desktopSound) &&
        Objects.equals(this.mentionKeys, userNotifyProps.mentionKeys) &&
        Objects.equals(this.channel, userNotifyProps.channel) &&
        Objects.equals(this.firstName, userNotifyProps.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, push, desktop, desktopSound, mentionKeys, channel, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotifyProps {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    desktopSound: ").append(toIndentedString(desktopSound)).append("\n");
    sb.append("    mentionKeys: ").append(toIndentedString(mentionKeys)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

