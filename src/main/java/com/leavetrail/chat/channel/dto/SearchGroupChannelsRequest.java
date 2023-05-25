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
 * SearchGroupChannelsRequest
 */

@JsonTypeName("SearchGroupChannels_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class SearchGroupChannelsRequest {

  private String term;

  /**
   * Default constructor
   * @deprecated Use {@link SearchGroupChannelsRequest#SearchGroupChannelsRequest(String)}
   */
  @Deprecated
  public SearchGroupChannelsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchGroupChannelsRequest(String term) {
    this.term = term;
  }

  public SearchGroupChannelsRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The search term to match against the members' usernames of the group channels
   * @return term
  */
  @NotNull 
  @Schema(name = "term", description = "The search term to match against the members' usernames of the group channels", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchGroupChannelsRequest searchGroupChannelsRequest = (SearchGroupChannelsRequest) o;
    return Objects.equals(this.term, searchGroupChannelsRequest.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchGroupChannelsRequest {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

