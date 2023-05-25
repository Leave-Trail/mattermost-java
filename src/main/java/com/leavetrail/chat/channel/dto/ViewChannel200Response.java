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
 * ViewChannel200Response
 */

@JsonTypeName("ViewChannel_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class ViewChannel200Response {

  private String status;

  private Object lastViewedAtTimes;

  public ViewChannel200Response status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Value should be \"OK\" if successful
   * @return status
  */
  
  @Schema(name = "status", description = "Value should be \"OK\" if successful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ViewChannel200Response lastViewedAtTimes(Object lastViewedAtTimes) {
    this.lastViewedAtTimes = lastViewedAtTimes;
    return this;
  }

  /**
   * A JSON object mapping channel IDs to the channel view times
   * @return lastViewedAtTimes
  */
  
  @Schema(name = "last_viewed_at_times", description = "A JSON object mapping channel IDs to the channel view times", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_viewed_at_times")
  public Object getLastViewedAtTimes() {
    return lastViewedAtTimes;
  }

  public void setLastViewedAtTimes(Object lastViewedAtTimes) {
    this.lastViewedAtTimes = lastViewedAtTimes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewChannel200Response viewChannel200Response = (ViewChannel200Response) o;
    return Objects.equals(this.status, viewChannel200Response.status) &&
        Objects.equals(this.lastViewedAtTimes, viewChannel200Response.lastViewedAtTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lastViewedAtTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewChannel200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastViewedAtTimes: ").append(toIndentedString(lastViewedAtTimes)).append("\n");
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

