package com.leavetrail.chat.groups.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
// import com.leavetrail.chat.users.dto.@ValidUser;
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
 * GetGroupUsers200Response
 */

@JsonTypeName("GetGroupUsers_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GetGroupUsers200Response {

  @Valid
  private List<@Valid User> members;

  private Integer totalMemberCount;

  public GetGroupUsers200Response members(List<@Valid User> members) {
    this.members = members;
    return this;
  }

  public GetGroupUsers200Response addMembersItem(User membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
  */
  @Valid 
  @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid User> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid User> members) {
    this.members = members;
  }

  public GetGroupUsers200Response totalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
    return this;
  }

  /**
   * Get totalMemberCount
   * @return totalMemberCount
  */
  
  @Schema(name = "total_member_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_member_count")
  public Integer getTotalMemberCount() {
    return totalMemberCount;
  }

  public void setTotalMemberCount(Integer totalMemberCount) {
    this.totalMemberCount = totalMemberCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupUsers200Response getGroupUsers200Response = (GetGroupUsers200Response) o;
    return Objects.equals(this.members, getGroupUsers200Response.members) &&
        Objects.equals(this.totalMemberCount, getGroupUsers200Response.totalMemberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, totalMemberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupUsers200Response {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    totalMemberCount: ").append(toIndentedString(totalMemberCount)).append("\n");
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

