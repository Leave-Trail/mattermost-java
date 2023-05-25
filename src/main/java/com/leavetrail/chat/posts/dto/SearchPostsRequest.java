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
 * SearchPostsRequest
 */

@JsonTypeName("SearchPosts_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:39.819728+02:00[Europe/Warsaw]")
public class SearchPostsRequest {

  private String terms;

  private Boolean isOrSearch;

  private Integer timeZoneOffset = 0;

  private Boolean includeDeletedChannels;

  private Integer page = 0;

  private Integer perPage = 60;

  /**
   * Default constructor
   * @deprecated Use {@link SearchPostsRequest#SearchPostsRequest(String, Boolean)}
   */
  @Deprecated
  public SearchPostsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchPostsRequest(String terms, Boolean isOrSearch) {
    this.terms = terms;
    this.isOrSearch = isOrSearch;
  }

  public SearchPostsRequest terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * The search terms as inputed by the user. To search for posts from a user include `from:someusername`, using a user's username. To search in a specific channel include `in:somechannel`, using the channel name (not the display name).
   * @return terms
  */
  @NotNull 
  @Schema(name = "terms", description = "The search terms as inputed by the user. To search for posts from a user include `from:someusername`, using a user's username. To search in a specific channel include `in:somechannel`, using the channel name (not the display name).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("terms")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public SearchPostsRequest isOrSearch(Boolean isOrSearch) {
    this.isOrSearch = isOrSearch;
    return this;
  }

  /**
   * Set to true if an Or search should be performed vs an And search.
   * @return isOrSearch
  */
  @NotNull 
  @Schema(name = "is_or_search", description = "Set to true if an Or search should be performed vs an And search.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_or_search")
  public Boolean getIsOrSearch() {
    return isOrSearch;
  }

  public void setIsOrSearch(Boolean isOrSearch) {
    this.isOrSearch = isOrSearch;
  }

  public SearchPostsRequest timeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

  /**
   * Offset from UTC of user timezone for date searches.
   * @return timeZoneOffset
  */
  
  @Schema(name = "time_zone_offset", description = "Offset from UTC of user timezone for date searches.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_zone_offset")
  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }

  public SearchPostsRequest includeDeletedChannels(Boolean includeDeletedChannels) {
    this.includeDeletedChannels = includeDeletedChannels;
    return this;
  }

  /**
   * Set to true if deleted channels should be included in the search. (archived channels)
   * @return includeDeletedChannels
  */
  
  @Schema(name = "include_deleted_channels", description = "Set to true if deleted channels should be included in the search. (archived channels)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_deleted_channels")
  public Boolean getIncludeDeletedChannels() {
    return includeDeletedChannels;
  }

  public void setIncludeDeletedChannels(Boolean includeDeletedChannels) {
    this.includeDeletedChannels = includeDeletedChannels;
  }

  public SearchPostsRequest page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * The page to select. (Only works with Elasticsearch)
   * @return page
  */
  
  @Schema(name = "page", description = "The page to select. (Only works with Elasticsearch)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchPostsRequest perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * The number of posts per page. (Only works with Elasticsearch)
   * @return perPage
  */
  
  @Schema(name = "per_page", description = "The number of posts per page. (Only works with Elasticsearch)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("per_page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchPostsRequest searchPostsRequest = (SearchPostsRequest) o;
    return Objects.equals(this.terms, searchPostsRequest.terms) &&
        Objects.equals(this.isOrSearch, searchPostsRequest.isOrSearch) &&
        Objects.equals(this.timeZoneOffset, searchPostsRequest.timeZoneOffset) &&
        Objects.equals(this.includeDeletedChannels, searchPostsRequest.includeDeletedChannels) &&
        Objects.equals(this.page, searchPostsRequest.page) &&
        Objects.equals(this.perPage, searchPostsRequest.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, isOrSearch, timeZoneOffset, includeDeletedChannels, page, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchPostsRequest {\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    isOrSearch: ").append(toIndentedString(isOrSearch)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    includeDeletedChannels: ").append(toIndentedString(includeDeletedChannels)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

