package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.users.dto.User;
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
 * GetUsersByGroupChannelIds200Response
 */

@JsonTypeName("GetUsersByGroupChannelIds_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class GetUsersByGroupChannelIds200Response {

  @Valid
  private List<@Valid User> lessThanCHANNELIDGreaterThan;

  public GetUsersByGroupChannelIds200Response lessThanCHANNELIDGreaterThan(List<@Valid User> lessThanCHANNELIDGreaterThan) {
    this.lessThanCHANNELIDGreaterThan = lessThanCHANNELIDGreaterThan;
    return this;
  }

  public GetUsersByGroupChannelIds200Response addLessThanCHANNELIDGreaterThanItem(User lessThanCHANNELIDGreaterThanItem) {
    if (this.lessThanCHANNELIDGreaterThan == null) {
      this.lessThanCHANNELIDGreaterThan = new ArrayList<>();
    }
    this.lessThanCHANNELIDGreaterThan.add(lessThanCHANNELIDGreaterThanItem);
    return this;
  }

  /**
   * Get lessThanCHANNELIDGreaterThan
   * @return lessThanCHANNELIDGreaterThan
  */
  @Valid 
  @Schema(name = "<CHANNEL_ID>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("&lt;CHANNEL_ID&gt;")
  public List<@Valid User> getLessThanCHANNELIDGreaterThan() {
    return lessThanCHANNELIDGreaterThan;
  }

  public void setLessThanCHANNELIDGreaterThan(List<@Valid User> lessThanCHANNELIDGreaterThan) {
    this.lessThanCHANNELIDGreaterThan = lessThanCHANNELIDGreaterThan;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersByGroupChannelIds200Response getUsersByGroupChannelIds200Response = (GetUsersByGroupChannelIds200Response) o;
    return Objects.equals(this.lessThanCHANNELIDGreaterThan, getUsersByGroupChannelIds200Response.lessThanCHANNELIDGreaterThan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lessThanCHANNELIDGreaterThan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersByGroupChannelIds200Response {\n");
    sb.append("    lessThanCHANNELIDGreaterThan: ").append(toIndentedString(lessThanCHANNELIDGreaterThan)).append("\n");
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

