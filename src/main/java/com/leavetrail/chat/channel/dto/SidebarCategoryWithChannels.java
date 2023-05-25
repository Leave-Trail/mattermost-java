package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * User&#39;s sidebar category with it&#39;s channels
 */

@Schema(name = "SidebarCategoryWithChannels", description = "User's sidebar category with it's channels")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class SidebarCategoryWithChannels {

  private String id;

  private String userId;

  private String teamId;

  private String displayName;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CHANNELS("channels"),
    
    CUSTOM("custom"),
    
    DIRECT_MESSAGES("direct_messages"),
    
    FAVORITES("favorites");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private List<String> channelIds;

  public SidebarCategoryWithChannels id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SidebarCategoryWithChannels userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SidebarCategoryWithChannels teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  */
  
  @Schema(name = "team_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_id")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public SidebarCategoryWithChannels displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SidebarCategoryWithChannels type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SidebarCategoryWithChannels channelIds(List<String> channelIds) {
    this.channelIds = channelIds;
    return this;
  }

  public SidebarCategoryWithChannels addChannelIdsItem(String channelIdsItem) {
    if (this.channelIds == null) {
      this.channelIds = new ArrayList<>();
    }
    this.channelIds.add(channelIdsItem);
    return this;
  }

  /**
   * Get channelIds
   * @return channelIds
  */
  
  @Schema(name = "channel_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_ids")
  public List<String> getChannelIds() {
    return channelIds;
  }

  public void setChannelIds(List<String> channelIds) {
    this.channelIds = channelIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SidebarCategoryWithChannels sidebarCategoryWithChannels = (SidebarCategoryWithChannels) o;
    return Objects.equals(this.id, sidebarCategoryWithChannels.id) &&
        Objects.equals(this.userId, sidebarCategoryWithChannels.userId) &&
        Objects.equals(this.teamId, sidebarCategoryWithChannels.teamId) &&
        Objects.equals(this.displayName, sidebarCategoryWithChannels.displayName) &&
        Objects.equals(this.type, sidebarCategoryWithChannels.type) &&
        Objects.equals(this.channelIds, sidebarCategoryWithChannels.channelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, teamId, displayName, type, channelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SidebarCategoryWithChannels {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
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

