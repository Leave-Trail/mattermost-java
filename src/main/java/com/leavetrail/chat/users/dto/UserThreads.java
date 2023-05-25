package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.users.dto.UserThread;
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
 * UserThreads
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:16.070020+02:00[Europe/Warsaw]")
public class UserThreads {

  private Integer total;

  @Valid
  private List<com.leavetrail.chat.users.dto.UserThread> threads;

  public UserThreads total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of threads (used for paging)
   * @return total
  */
  
  @Schema(name = "total", description = "Total number of threads (used for paging)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public UserThreads threads(List<com.leavetrail.chat.users.dto.UserThread> threads) {
    this.threads = threads;
    return this;
  }

  public UserThreads addThreadsItem(UserThread threadsItem) {
    if (this.threads == null) {
      this.threads = new ArrayList<>();
    }
    this.threads.add(threadsItem);
    return this;
  }

  /**
   * Array of threads
   * @return threads
  */
  @Valid 
  @Schema(name = "threads", description = "Array of threads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threads")
  public List<com.leavetrail.chat.users.dto.UserThread> getThreads() {
    return threads;
  }

  public void setThreads(List<com.leavetrail.chat.users.dto.UserThread> threads) {
    this.threads = threads;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserThreads userThreads = (UserThreads) o;
    return Objects.equals(this.total, userThreads.total) &&
        Objects.equals(this.threads, userThreads.threads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, threads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserThreads {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    threads: ").append(toIndentedString(threads)).append("\n");
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

