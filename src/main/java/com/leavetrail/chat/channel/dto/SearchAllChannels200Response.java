package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.channel.dto.Channel;
import java.math.BigDecimal;
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
 * SearchAllChannels200Response
 */

@JsonTypeName("SearchAllChannels_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class SearchAllChannels200Response {

  @Valid
  private List<@Valid Channel> channels;

  private BigDecimal totalCount;

  public SearchAllChannels200Response channels(List<@Valid Channel> channels) {
    this.channels = channels;
    return this;
  }

  public SearchAllChannels200Response addChannelsItem(Channel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * The channels that matched the query.
   * @return channels
  */
  @Valid 
  @Schema(name = "channels", description = "The channels that matched the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channels")
  public List<@Valid Channel> getChannels() {
    return channels;
  }

  public void setChannels(List<@Valid Channel> channels) {
    this.channels = channels;
  }

  public SearchAllChannels200Response totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of results, regardless of page and per_page requested.
   * @return totalCount
  */
  @Valid 
  @Schema(name = "total_count", description = "The total number of results, regardless of page and per_page requested.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_count")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAllChannels200Response searchAllChannels200Response = (SearchAllChannels200Response) o;
    return Objects.equals(this.channels, searchAllChannels200Response.channels) &&
        Objects.equals(this.totalCount, searchAllChannels200Response.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAllChannels200Response {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

