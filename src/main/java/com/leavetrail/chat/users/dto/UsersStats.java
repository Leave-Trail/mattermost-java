package com.leavetrail.chat.users.dto;

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
 * UsersStats
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UsersStats {

  private Integer totalUsersCount;

  public UsersStats totalUsersCount(Integer totalUsersCount) {
    this.totalUsersCount = totalUsersCount;
    return this;
  }

  /**
   * Get totalUsersCount
   * @return totalUsersCount
  */
  
  @Schema(name = "total_users_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_users_count")
  public Integer getTotalUsersCount() {
    return totalUsersCount;
  }

  public void setTotalUsersCount(Integer totalUsersCount) {
    this.totalUsersCount = totalUsersCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersStats usersStats = (UsersStats) o;
    return Objects.equals(this.totalUsersCount, usersStats.totalUsersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUsersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersStats {\n");
    sb.append("    totalUsersCount: ").append(toIndentedString(totalUsersCount)).append("\n");
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

