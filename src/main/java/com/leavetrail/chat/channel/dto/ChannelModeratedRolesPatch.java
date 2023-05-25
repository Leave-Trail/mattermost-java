package com.leavetrail.chat.channel.dto;

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
 * ChannelModeratedRolesPatch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class ChannelModeratedRolesPatch {

  private Boolean guests;

  private Boolean members;

  public ChannelModeratedRolesPatch guests(Boolean guests) {
    this.guests = guests;
    return this;
  }

  /**
   * Get guests
   * @return guests
  */
  
  @Schema(name = "guests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guests")
  public Boolean getGuests() {
    return guests;
  }

  public void setGuests(Boolean guests) {
    this.guests = guests;
  }

  public ChannelModeratedRolesPatch members(Boolean members) {
    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
  */
  
  @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public Boolean getMembers() {
    return members;
  }

  public void setMembers(Boolean members) {
    this.members = members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelModeratedRolesPatch channelModeratedRolesPatch = (ChannelModeratedRolesPatch) o;
    return Objects.equals(this.guests, channelModeratedRolesPatch.guests) &&
        Objects.equals(this.members, channelModeratedRolesPatch.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guests, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelModeratedRolesPatch {\n");
    sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

