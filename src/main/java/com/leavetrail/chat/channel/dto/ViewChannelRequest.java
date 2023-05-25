package com.leavetrail.chat.channel.dto;

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
 * ViewChannelRequest
 */

@JsonTypeName("ViewChannel_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class ViewChannelRequest {

  private String channelId;

  private String prevChannelId;

  /**
   * Default constructor
   * @deprecated Use {@link ViewChannelRequest#ViewChannelRequest(String)}
   */
  @Deprecated
  public ViewChannelRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ViewChannelRequest(String channelId) {
    this.channelId = channelId;
  }

  public ViewChannelRequest channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The channel ID that is being viewed. Use a blank string to indicate that all channels have lost focus.
   * @return channelId
  */
  @NotNull 
  @Schema(name = "channel_id", description = "The channel ID that is being viewed. Use a blank string to indicate that all channels have lost focus.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ViewChannelRequest prevChannelId(String prevChannelId) {
    this.prevChannelId = prevChannelId;
    return this;
  }

  /**
   * The channel ID of the previous channel, used when switching channels. Providing this ID will cause push notifications to clear on the channel being switched to.
   * @return prevChannelId
  */
  
  @Schema(name = "prev_channel_id", description = "The channel ID of the previous channel, used when switching channels. Providing this ID will cause push notifications to clear on the channel being switched to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev_channel_id")
  public String getPrevChannelId() {
    return prevChannelId;
  }

  public void setPrevChannelId(String prevChannelId) {
    this.prevChannelId = prevChannelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewChannelRequest viewChannelRequest = (ViewChannelRequest) o;
    return Objects.equals(this.channelId, viewChannelRequest.channelId) &&
        Objects.equals(this.prevChannelId, viewChannelRequest.prevChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, prevChannelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewChannelRequest {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    prevChannelId: ").append(toIndentedString(prevChannelId)).append("\n");
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

