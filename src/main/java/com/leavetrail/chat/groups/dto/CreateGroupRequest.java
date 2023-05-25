package com.leavetrail.chat.groups.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.leavetrail.chat.groups.dto.CreateGroupRequestGroup;

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
 * CreateGroupRequest
 */

@JsonTypeName("CreateGroup_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T15:06:25.608383+02:00[Europe/Warsaw]")
public class CreateGroupRequest {

  private CreateGroupRequestGroup group;

  @Valid
  private List<String> userIds = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link CreateGroupRequest#CreateGroupRequest(CreateGroupRequestGroup, List<String>)}
   */
  @Deprecated
  public CreateGroupRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateGroupRequest(CreateGroupRequestGroup group, List<String> userIds) {
    this.group = group;
    this.userIds = userIds;
  }

  public CreateGroupRequest group(CreateGroupRequestGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @NotNull @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("group")
  public CreateGroupRequestGroup getGroup() {
    return group;
  }

  public void setGroup(CreateGroupRequestGroup group) {
    this.group = group;
  }

  public CreateGroupRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public CreateGroupRequest addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * The user ids of the group members to add.
   * @return userIds
  */
  @NotNull 
  @Schema(name = "user_ids", description = "The user ids of the group members to add.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_ids")
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.group, createGroupRequest.group) &&
        Objects.equals(this.userIds, createGroupRequest.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

