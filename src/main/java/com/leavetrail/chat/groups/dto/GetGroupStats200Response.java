package com.leavetrail.chat.groups.dto;

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
 * GetGroupStats200Response
 */

@JsonTypeName("GetGroupStats_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class GetGroupStats200Response {

  private String groupId;

  private Integer totalMemberCount;

  public GetGroupStats200Response groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  
  @Schema(name = "group_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group_id")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GetGroupStats200Response totalMemberCount(Integer totalMemberCount) {
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
    GetGroupStats200Response getGroupStats200Response = (GetGroupStats200Response) o;
    return Objects.equals(this.groupId, getGroupStats200Response.groupId) &&
        Objects.equals(this.totalMemberCount, getGroupStats200Response.totalMemberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, totalMemberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupStats200Response {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

