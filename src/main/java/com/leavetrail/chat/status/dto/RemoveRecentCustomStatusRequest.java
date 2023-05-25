package com.leavetrail.chat.status.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RemoveRecentCustomStatusRequest
 */

@JsonTypeName("RemoveRecentCustomStatus_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:29.136457+02:00[Europe/Warsaw]")
public class RemoveRecentCustomStatusRequest {

  private String emoji;

  private String text;

  private String duration;

  private String expiresAt;

  /**
   * Default constructor
   * @deprecated Use {@link RemoveRecentCustomStatusRequest#RemoveRecentCustomStatusRequest(String, String, String, String)}
   */
  @Deprecated
  public RemoveRecentCustomStatusRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveRecentCustomStatusRequest(String emoji, String text, String duration, String expiresAt) {
    this.emoji = emoji;
    this.text = text;
    this.duration = duration;
    this.expiresAt = expiresAt;
  }

  public RemoveRecentCustomStatusRequest emoji(String emoji) {
    this.emoji = emoji;
    return this;
  }

  /**
   * Any emoji
   * @return emoji
  */
  @NotNull 
  @Schema(name = "emoji", description = "Any emoji", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("emoji")
  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  public RemoveRecentCustomStatusRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Any custom status text
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Any custom status text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RemoveRecentCustomStatusRequest duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of custom status, can be `thirty_minutes`, `one_hour`, `four_hours`, `today`, `this_week` or `date_and_time`
   * @return duration
  */
  @NotNull 
  @Schema(name = "duration", description = "Duration of custom status, can be `thirty_minutes`, `one_hour`, `four_hours`, `today`, `this_week` or `date_and_time`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public RemoveRecentCustomStatusRequest expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The time at which custom status should be expired. It should be in ISO format.
   * @return expiresAt
  */
  @NotNull 
  @Schema(name = "expires_at", description = "The time at which custom status should be expired. It should be in ISO format.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveRecentCustomStatusRequest removeRecentCustomStatusRequest = (RemoveRecentCustomStatusRequest) o;
    return Objects.equals(this.emoji, removeRecentCustomStatusRequest.emoji) &&
        Objects.equals(this.text, removeRecentCustomStatusRequest.text) &&
        Objects.equals(this.duration, removeRecentCustomStatusRequest.duration) &&
        Objects.equals(this.expiresAt, removeRecentCustomStatusRequest.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emoji, text, duration, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveRecentCustomStatusRequest {\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

