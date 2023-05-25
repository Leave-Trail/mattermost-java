package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * UserAutocomplete
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserAutocomplete {

  @Valid
  private List<@Valid User> users;

  @Valid
  private List<@Valid User> outOfChannel;

  public UserAutocomplete users(List<@Valid User> users) {
    this.users = users;
    return this;
  }

  public UserAutocomplete addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * A list of users that are the main result of the query
   * @return users
  */
  @Valid 
  @Schema(name = "users", description = "A list of users that are the main result of the query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<@Valid User> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid User> users) {
    this.users = users;
  }

  public UserAutocomplete outOfChannel(List<@Valid User> outOfChannel) {
    this.outOfChannel = outOfChannel;
    return this;
  }

  public UserAutocomplete addOutOfChannelItem(User outOfChannelItem) {
    if (this.outOfChannel == null) {
      this.outOfChannel = new ArrayList<>();
    }
    this.outOfChannel.add(outOfChannelItem);
    return this;
  }

  /**
   * A special case list of users returned when autocompleting in a specific channel. Omitted when empty or not relevant
   * @return outOfChannel
  */
  @Valid 
  @Schema(name = "out_of_channel", description = "A special case list of users returned when autocompleting in a specific channel. Omitted when empty or not relevant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("out_of_channel")
  public List<@Valid User> getOutOfChannel() {
    return outOfChannel;
  }

  public void setOutOfChannel(List<@Valid User> outOfChannel) {
    this.outOfChannel = outOfChannel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAutocomplete userAutocomplete = (UserAutocomplete) o;
    return Objects.equals(this.users, userAutocomplete.users) &&
        Objects.equals(this.outOfChannel, userAutocomplete.outOfChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, outOfChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAutocomplete {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    outOfChannel: ").append(toIndentedString(outOfChannel)).append("\n");
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

