package com.leavetrail.chat.teams.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InviteGuestsToTeamRequest
 */

@JsonTypeName("InviteGuestsToTeam_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class InviteGuestsToTeamRequest {

  @Valid
  private List<String> emails = new ArrayList<>();

  @Valid
  private List<String> channels = new ArrayList<>();

  private String message;

  /**
   * Default constructor
   * @deprecated Use {@link InviteGuestsToTeamRequest#InviteGuestsToTeamRequest(List<String>, List<String>)}
   */
  @Deprecated
  public InviteGuestsToTeamRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InviteGuestsToTeamRequest(List<String> emails, List<String> channels) {
    this.emails = emails;
    this.channels = channels;
  }

  public InviteGuestsToTeamRequest emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public InviteGuestsToTeamRequest addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * List of emails
   * @return emails
  */
  @NotNull 
  @Schema(name = "emails", description = "List of emails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("emails")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public InviteGuestsToTeamRequest channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public InviteGuestsToTeamRequest addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * List of channel ids
   * @return channels
  */
  @NotNull 
  @Schema(name = "channels", description = "List of channel ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("channels")
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }

  public InviteGuestsToTeamRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message to include in the invite
   * @return message
  */
  
  @Schema(name = "message", description = "Message to include in the invite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteGuestsToTeamRequest inviteGuestsToTeamRequest = (InviteGuestsToTeamRequest) o;
    return Objects.equals(this.emails, inviteGuestsToTeamRequest.emails) &&
        Objects.equals(this.channels, inviteGuestsToTeamRequest.channels) &&
        Objects.equals(this.message, inviteGuestsToTeamRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, channels, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteGuestsToTeamRequest {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

