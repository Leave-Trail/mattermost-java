package com.leavetrail.chat.teams.dto;

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
 * SearchTeamsRequest
 */

@JsonTypeName("SearchTeams_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:46.357824+02:00[Europe/Warsaw]")
public class SearchTeamsRequest {

  private String term;

  private String page;

  private String perPage;

  private Boolean allowOpenInvite;

  private Boolean groupConstrained;

  private Boolean excludePolicyConstrained = false;

  public SearchTeamsRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The search term to match against the name or display name of teams
   * @return term
  */
  
  @Schema(name = "term", description = "The search term to match against the name or display name of teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public SearchTeamsRequest page(String page) {
    this.page = page;
    return this;
  }

  /**
   * The page number to return, if paginated. If this parameter is not present with the `per_page` parameter then the results will be returned un-paged.
   * @return page
  */
  
  @Schema(name = "page", description = "The page number to return, if paginated. If this parameter is not present with the `per_page` parameter then the results will be returned un-paged.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public SearchTeamsRequest perPage(String perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * The number of entries to return per page, if paginated. If this parameter is not present with the `page` parameter then the results will be returned un-paged.
   * @return perPage
  */
  
  @Schema(name = "per_page", description = "The number of entries to return per page, if paginated. If this parameter is not present with the `page` parameter then the results will be returned un-paged.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("per_page")
  public String getPerPage() {
    return perPage;
  }

  public void setPerPage(String perPage) {
    this.perPage = perPage;
  }

  public SearchTeamsRequest allowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
    return this;
  }

  /**
   * Filters results to teams where `allow_open_invite` is set to true or false, excludes group constrained channels if this filter option is passed. If this filter option is not passed then the query will remain unchanged. __Minimum server version__: 5.28 
   * @return allowOpenInvite
  */
  
  @Schema(name = "allow_open_invite", description = "Filters results to teams where `allow_open_invite` is set to true or false, excludes group constrained channels if this filter option is passed. If this filter option is not passed then the query will remain unchanged. __Minimum server version__: 5.28 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_open_invite")
  public Boolean getAllowOpenInvite() {
    return allowOpenInvite;
  }

  public void setAllowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
  }

  public SearchTeamsRequest groupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
    return this;
  }

  /**
   * Filters results to teams where `group_constrained` is set to true or false, returns the union of results when used with `allow_open_invite` If the filter option is not passed then the query will remain unchanged. __Minimum server version__: 5.28 
   * @return groupConstrained
  */
  
  @Schema(name = "group_constrained", description = "Filters results to teams where `group_constrained` is set to true or false, returns the union of results when used with `allow_open_invite` If the filter option is not passed then the query will remain unchanged. __Minimum server version__: 5.28 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group_constrained")
  public Boolean getGroupConstrained() {
    return groupConstrained;
  }

  public void setGroupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
  }

  public SearchTeamsRequest excludePolicyConstrained(Boolean excludePolicyConstrained) {
    this.excludePolicyConstrained = excludePolicyConstrained;
    return this;
  }

  /**
   * If set to true, only teams which do not have a granular retention policy assigned to them will be returned. The `sysconsole_read_compliance_data_retention` permission is required to use this parameter. __Minimum server version__: 5.35 
   * @return excludePolicyConstrained
  */
  
  @Schema(name = "exclude_policy_constrained", description = "If set to true, only teams which do not have a granular retention policy assigned to them will be returned. The `sysconsole_read_compliance_data_retention` permission is required to use this parameter. __Minimum server version__: 5.35 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude_policy_constrained")
  public Boolean getExcludePolicyConstrained() {
    return excludePolicyConstrained;
  }

  public void setExcludePolicyConstrained(Boolean excludePolicyConstrained) {
    this.excludePolicyConstrained = excludePolicyConstrained;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTeamsRequest searchTeamsRequest = (SearchTeamsRequest) o;
    return Objects.equals(this.term, searchTeamsRequest.term) &&
        Objects.equals(this.page, searchTeamsRequest.page) &&
        Objects.equals(this.perPage, searchTeamsRequest.perPage) &&
        Objects.equals(this.allowOpenInvite, searchTeamsRequest.allowOpenInvite) &&
        Objects.equals(this.groupConstrained, searchTeamsRequest.groupConstrained) &&
        Objects.equals(this.excludePolicyConstrained, searchTeamsRequest.excludePolicyConstrained);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, page, perPage, allowOpenInvite, groupConstrained, excludePolicyConstrained);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTeamsRequest {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    allowOpenInvite: ").append(toIndentedString(allowOpenInvite)).append("\n");
    sb.append("    groupConstrained: ").append(toIndentedString(groupConstrained)).append("\n");
    sb.append("    excludePolicyConstrained: ").append(toIndentedString(excludePolicyConstrained)).append("\n");
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

