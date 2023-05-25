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
 * AddChannelMemberRequest
 */

@JsonTypeName("AddChannelMember_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class AddChannelMemberRequest {

  private String userId;

  private String postRootId;

  /**
   * Default constructor
   * @deprecated Use {@link AddChannelMemberRequest#AddChannelMemberRequest(String)}
   */
  @Deprecated
  public AddChannelMemberRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddChannelMemberRequest(String userId) {
    this.userId = userId;
  }

  public AddChannelMemberRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of user to add into the channel
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", description = "The ID of user to add into the channel", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AddChannelMemberRequest postRootId(String postRootId) {
    this.postRootId = postRootId;
    return this;
  }

  /**
   * The ID of root post where link to add channel member originates
   * @return postRootId
  */
  
  @Schema(name = "post_root_id", description = "The ID of root post where link to add channel member originates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post_root_id")
  public String getPostRootId() {
    return postRootId;
  }

  public void setPostRootId(String postRootId) {
    this.postRootId = postRootId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddChannelMemberRequest addChannelMemberRequest = (AddChannelMemberRequest) o;
    return Objects.equals(this.userId, addChannelMemberRequest.userId) &&
        Objects.equals(this.postRootId, addChannelMemberRequest.postRootId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, postRootId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChannelMemberRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postRootId: ").append(toIndentedString(postRootId)).append("\n");
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

