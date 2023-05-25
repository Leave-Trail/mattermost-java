package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.bots.dto.ChannelModeratedRole;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChannelModeratedRoles
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class ChannelModeratedRoles {

  private ChannelModeratedRole guests;

  private ChannelModeratedRole members;

  public ChannelModeratedRoles guests(ChannelModeratedRole guests) {
    this.guests = guests;
    return this;
  }

  /**
   * Get guests
   * @return guests
  */
  @Valid 
  @Schema(name = "guests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guests")
  public ChannelModeratedRole getGuests() {
    return guests;
  }

  public void setGuests(ChannelModeratedRole guests) {
    this.guests = guests;
  }

  public ChannelModeratedRoles members(ChannelModeratedRole members) {
    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
  */
  @Valid 
  @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public ChannelModeratedRole getMembers() {
    return members;
  }

  public void setMembers(ChannelModeratedRole members) {
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
    ChannelModeratedRoles channelModeratedRoles = (ChannelModeratedRoles) o;
    return Objects.equals(this.guests, channelModeratedRoles.guests) &&
        Objects.equals(this.members, channelModeratedRoles.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guests, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelModeratedRoles {\n");
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

