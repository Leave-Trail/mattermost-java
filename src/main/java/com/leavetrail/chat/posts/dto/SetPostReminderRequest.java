package com.leavetrail.chat.posts.dto;

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
 * SetPostReminderRequest
 */

@JsonTypeName("SetPostReminder_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class SetPostReminderRequest {

  private Integer targetTime;

  /**
   * Default constructor
   * @deprecated Use {@link SetPostReminderRequest#SetPostReminderRequest(Integer)}
   */
  @Deprecated
  public SetPostReminderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetPostReminderRequest(Integer targetTime) {
    this.targetTime = targetTime;
  }

  public SetPostReminderRequest targetTime(Integer targetTime) {
    this.targetTime = targetTime;
    return this;
  }

  /**
   * Target time for the reminder
   * @return targetTime
  */
  @NotNull 
  @Schema(name = "target_time", description = "Target time for the reminder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("target_time")
  public Integer getTargetTime() {
    return targetTime;
  }

  public void setTargetTime(Integer targetTime) {
    this.targetTime = targetTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPostReminderRequest setPostReminderRequest = (SetPostReminderRequest) o;
    return Objects.equals(this.targetTime, setPostReminderRequest.targetTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPostReminderRequest {\n");
    sb.append("    targetTime: ").append(toIndentedString(targetTime)).append("\n");
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

