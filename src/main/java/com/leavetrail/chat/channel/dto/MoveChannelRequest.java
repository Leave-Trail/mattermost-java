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
 * MoveChannelRequest
 */

@JsonTypeName("MoveChannel_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class MoveChannelRequest {

  private String teamId;

  private Boolean force;

  /**
   * Default constructor
   * @deprecated Use {@link MoveChannelRequest#MoveChannelRequest(String)}
   */
  @Deprecated
  public MoveChannelRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveChannelRequest(String teamId) {
    this.teamId = teamId;
  }

  public MoveChannelRequest teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  */
  @NotNull 
  @Schema(name = "team_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public MoveChannelRequest force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Remove members those are not member of target team before moving the channel.
   * @return force
  */
  
  @Schema(name = "force", description = "Remove members those are not member of target team before moving the channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveChannelRequest moveChannelRequest = (MoveChannelRequest) o;
    return Objects.equals(this.teamId, moveChannelRequest.teamId) &&
        Objects.equals(this.force, moveChannelRequest.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveChannelRequest {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

