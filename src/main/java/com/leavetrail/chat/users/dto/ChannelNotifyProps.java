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
 * ChannelNotifyProps
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:11:49.391170+02:00[Europe/Warsaw]")
public class ChannelNotifyProps {

  private String email;

  private String push;

  private String desktop;

  private String markUnread;

  public ChannelNotifyProps email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Set to \"true\" to enable email notifications, \"false\" to disable, or \"default\" to use the global user notification setting.
   * @return email
  */
  
  @Schema(name = "email", description = "Set to \"true\" to enable email notifications, \"false\" to disable, or \"default\" to use the global user notification setting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ChannelNotifyProps push(String push) {
    this.push = push;
    return this;
  }

  /**
   * Set to \"all\" to receive push notifications for all activity, \"mention\" for mentions and direct messages only, \"none\" to disable, or \"default\" to use the global user notification setting.
   * @return push
  */
  
  @Schema(name = "push", description = "Set to \"all\" to receive push notifications for all activity, \"mention\" for mentions and direct messages only, \"none\" to disable, or \"default\" to use the global user notification setting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("push")
  public String getPush() {
    return push;
  }

  public void setPush(String push) {
    this.push = push;
  }

  public ChannelNotifyProps desktop(String desktop) {
    this.desktop = desktop;
    return this;
  }

  /**
   * Set to \"all\" to receive desktop notifications for all activity, \"mention\" for mentions and direct messages only, \"none\" to disable, or \"default\" to use the global user notification setting.
   * @return desktop
  */
  
  @Schema(name = "desktop", description = "Set to \"all\" to receive desktop notifications for all activity, \"mention\" for mentions and direct messages only, \"none\" to disable, or \"default\" to use the global user notification setting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("desktop")
  public String getDesktop() {
    return desktop;
  }

  public void setDesktop(String desktop) {
    this.desktop = desktop;
  }

  public ChannelNotifyProps markUnread(String markUnread) {
    this.markUnread = markUnread;
    return this;
  }

  /**
   * Set to \"all\" to mark the channel unread for any new message, \"mention\" to mark unread for new mentions only. Defaults to \"all\".
   * @return markUnread
  */
  
  @Schema(name = "mark_unread", description = "Set to \"all\" to mark the channel unread for any new message, \"mention\" to mark unread for new mentions only. Defaults to \"all\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mark_unread")
  public String getMarkUnread() {
    return markUnread;
  }

  public void setMarkUnread(String markUnread) {
    this.markUnread = markUnread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelNotifyProps channelNotifyProps = (ChannelNotifyProps) o;
    return Objects.equals(this.email, channelNotifyProps.email) &&
        Objects.equals(this.push, channelNotifyProps.push) &&
        Objects.equals(this.desktop, channelNotifyProps.desktop) &&
        Objects.equals(this.markUnread, channelNotifyProps.markUnread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, push, desktop, markUnread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelNotifyProps {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    markUnread: ").append(toIndentedString(markUnread)).append("\n");
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

