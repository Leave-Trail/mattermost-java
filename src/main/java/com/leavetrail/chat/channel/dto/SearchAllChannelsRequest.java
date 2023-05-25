package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * SearchAllChannelsRequest
 */

@JsonTypeName("SearchAllChannels_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class SearchAllChannelsRequest {

  private String term;

  private String notAssociatedToGroup;

  private Boolean excludeDefaultChannels;

  @Valid
  private List<String> teamIds;

  private Boolean groupConstrained;

  private Boolean excludeGroupConstrained;

  private Boolean _public;

  private Boolean _private;

  private Boolean deleted;

  private String page;

  private String perPage;

  private Boolean excludePolicyConstrained = false;

  private Boolean includeSearchById = false;

  /**
   * Default constructor
   * @deprecated Use {@link SearchAllChannelsRequest#SearchAllChannelsRequest(String)}
   */
  @Deprecated
  public SearchAllChannelsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchAllChannelsRequest(String term) {
    this.term = term;
  }

  public SearchAllChannelsRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The string to search in the channel name, display name, and purpose.
   * @return term
  */
  @NotNull 
  @Schema(name = "term", description = "The string to search in the channel name, display name, and purpose.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public SearchAllChannelsRequest notAssociatedToGroup(String notAssociatedToGroup) {
    this.notAssociatedToGroup = notAssociatedToGroup;
    return this;
  }

  /**
   * A group id to exclude channels that are associated to that group via GroupChannel records.
   * @return notAssociatedToGroup
  */
  
  @Schema(name = "not_associated_to_group", description = "A group id to exclude channels that are associated to that group via GroupChannel records.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("not_associated_to_group")
  public String getNotAssociatedToGroup() {
    return notAssociatedToGroup;
  }

  public void setNotAssociatedToGroup(String notAssociatedToGroup) {
    this.notAssociatedToGroup = notAssociatedToGroup;
  }

  public SearchAllChannelsRequest excludeDefaultChannels(Boolean excludeDefaultChannels) {
    this.excludeDefaultChannels = excludeDefaultChannels;
    return this;
  }

  /**
   * Exclude default channels from the results by setting this parameter to true.
   * @return excludeDefaultChannels
  */
  
  @Schema(name = "exclude_default_channels", description = "Exclude default channels from the results by setting this parameter to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude_default_channels")
  public Boolean getExcludeDefaultChannels() {
    return excludeDefaultChannels;
  }

  public void setExcludeDefaultChannels(Boolean excludeDefaultChannels) {
    this.excludeDefaultChannels = excludeDefaultChannels;
  }

  public SearchAllChannelsRequest teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public SearchAllChannelsRequest addTeamIdsItem(String teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

  /**
   * Filters results to channels belonging to the given team ids  __Minimum server version__: 5.26 
   * @return teamIds
  */
  
  @Schema(name = "team_ids", description = "Filters results to channels belonging to the given team ids  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_ids")
  public List<String> getTeamIds() {
    return teamIds;
  }

  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }

  public SearchAllChannelsRequest groupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
    return this;
  }

  /**
   * Filters results to only return channels constrained to a group  __Minimum server version__: 5.26 
   * @return groupConstrained
  */
  
  @Schema(name = "group_constrained", description = "Filters results to only return channels constrained to a group  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group_constrained")
  public Boolean getGroupConstrained() {
    return groupConstrained;
  }

  public void setGroupConstrained(Boolean groupConstrained) {
    this.groupConstrained = groupConstrained;
  }

  public SearchAllChannelsRequest excludeGroupConstrained(Boolean excludeGroupConstrained) {
    this.excludeGroupConstrained = excludeGroupConstrained;
    return this;
  }

  /**
   * Filters results to exclude channels constrained to a group  __Minimum server version__: 5.26 
   * @return excludeGroupConstrained
  */
  
  @Schema(name = "exclude_group_constrained", description = "Filters results to exclude channels constrained to a group  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude_group_constrained")
  public Boolean getExcludeGroupConstrained() {
    return excludeGroupConstrained;
  }

  public void setExcludeGroupConstrained(Boolean excludeGroupConstrained) {
    this.excludeGroupConstrained = excludeGroupConstrained;
  }

  public SearchAllChannelsRequest _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Filters results to only return Public / Open channels, can be used in conjunction with `private` to return both `public` and `private` channels  __Minimum server version__: 5.26 
   * @return _public
  */
  
  @Schema(name = "public", description = "Filters results to only return Public / Open channels, can be used in conjunction with `private` to return both `public` and `private` channels  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public SearchAllChannelsRequest _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Filters results to only return Private channels, can be used in conjunction with `public` to return both `private` and `public` channels  __Minimum server version__: 5.26 
   * @return _private
  */
  
  @Schema(name = "private", description = "Filters results to only return Private channels, can be used in conjunction with `public` to return both `private` and `public` channels  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("private")
  public Boolean getPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public SearchAllChannelsRequest deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Filters results to only return deleted / archived channels  __Minimum server version__: 5.26 
   * @return deleted
  */
  
  @Schema(name = "deleted", description = "Filters results to only return deleted / archived channels  __Minimum server version__: 5.26 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public SearchAllChannelsRequest page(String page) {
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

  public SearchAllChannelsRequest perPage(String perPage) {
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

  public SearchAllChannelsRequest excludePolicyConstrained(Boolean excludePolicyConstrained) {
    this.excludePolicyConstrained = excludePolicyConstrained;
    return this;
  }

  /**
   * If set to true, only channels which do not have a granular retention policy assigned to them will be returned. The `sysconsole_read_compliance_data_retention` permission is required to use this parameter. __Minimum server version__: 5.35 
   * @return excludePolicyConstrained
  */
  
  @Schema(name = "exclude_policy_constrained", description = "If set to true, only channels which do not have a granular retention policy assigned to them will be returned. The `sysconsole_read_compliance_data_retention` permission is required to use this parameter. __Minimum server version__: 5.35 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude_policy_constrained")
  public Boolean getExcludePolicyConstrained() {
    return excludePolicyConstrained;
  }

  public void setExcludePolicyConstrained(Boolean excludePolicyConstrained) {
    this.excludePolicyConstrained = excludePolicyConstrained;
  }

  public SearchAllChannelsRequest includeSearchById(Boolean includeSearchById) {
    this.includeSearchById = includeSearchById;
    return this;
  }

  /**
   * If set to true, returns channels where given search 'term' matches channel ID. __Minimum server version__: 5.35 
   * @return includeSearchById
  */
  
  @Schema(name = "include_search_by_id", description = "If set to true, returns channels where given search 'term' matches channel ID. __Minimum server version__: 5.35 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_search_by_id")
  public Boolean getIncludeSearchById() {
    return includeSearchById;
  }

  public void setIncludeSearchById(Boolean includeSearchById) {
    this.includeSearchById = includeSearchById;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAllChannelsRequest searchAllChannelsRequest = (SearchAllChannelsRequest) o;
    return Objects.equals(this.term, searchAllChannelsRequest.term) &&
        Objects.equals(this.notAssociatedToGroup, searchAllChannelsRequest.notAssociatedToGroup) &&
        Objects.equals(this.excludeDefaultChannels, searchAllChannelsRequest.excludeDefaultChannels) &&
        Objects.equals(this.teamIds, searchAllChannelsRequest.teamIds) &&
        Objects.equals(this.groupConstrained, searchAllChannelsRequest.groupConstrained) &&
        Objects.equals(this.excludeGroupConstrained, searchAllChannelsRequest.excludeGroupConstrained) &&
        Objects.equals(this._public, searchAllChannelsRequest._public) &&
        Objects.equals(this._private, searchAllChannelsRequest._private) &&
        Objects.equals(this.deleted, searchAllChannelsRequest.deleted) &&
        Objects.equals(this.page, searchAllChannelsRequest.page) &&
        Objects.equals(this.perPage, searchAllChannelsRequest.perPage) &&
        Objects.equals(this.excludePolicyConstrained, searchAllChannelsRequest.excludePolicyConstrained) &&
        Objects.equals(this.includeSearchById, searchAllChannelsRequest.includeSearchById);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, notAssociatedToGroup, excludeDefaultChannels, teamIds, groupConstrained, excludeGroupConstrained, _public, _private, deleted, page, perPage, excludePolicyConstrained, includeSearchById);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAllChannelsRequest {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    notAssociatedToGroup: ").append(toIndentedString(notAssociatedToGroup)).append("\n");
    sb.append("    excludeDefaultChannels: ").append(toIndentedString(excludeDefaultChannels)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    groupConstrained: ").append(toIndentedString(groupConstrained)).append("\n");
    sb.append("    excludeGroupConstrained: ").append(toIndentedString(excludeGroupConstrained)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    excludePolicyConstrained: ").append(toIndentedString(excludePolicyConstrained)).append("\n");
    sb.append("    includeSearchById: ").append(toIndentedString(includeSearchById)).append("\n");
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

