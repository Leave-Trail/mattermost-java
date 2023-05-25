package com.leavetrail.chat.users.dto;

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
 * AttachDeviceIdRequest
 */

@JsonTypeName("AttachDeviceId_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class AttachDeviceIdRequest {

  private String deviceId;

  /**
   * Default constructor
   * @deprecated Use {@link AttachDeviceIdRequest#AttachDeviceIdRequest(String)}
   */
  @Deprecated
  public AttachDeviceIdRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AttachDeviceIdRequest(String deviceId) {
    this.deviceId = deviceId;
  }

  public AttachDeviceIdRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Mobile device id. For Android prefix the id with `android:` and Apple with `apple:`
   * @return deviceId
  */
  @NotNull 
  @Schema(name = "device_id", description = "Mobile device id. For Android prefix the id with `android:` and Apple with `apple:`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("device_id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachDeviceIdRequest attachDeviceIdRequest = (AttachDeviceIdRequest) o;
    return Objects.equals(this.deviceId, attachDeviceIdRequest.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachDeviceIdRequest {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

