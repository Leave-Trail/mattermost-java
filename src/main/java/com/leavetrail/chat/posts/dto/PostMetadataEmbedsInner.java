package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostMetadataEmbedsInner
 */

@JsonTypeName("PostMetadata_embeds_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T12:48:35.460650+02:00[Europe/Warsaw]")
public class PostMetadataEmbedsInner {

  /**
   * The type of content that is embedded in this point.
   */
  public enum TypeEnum {
    IMAGE("image"),
    
    MESSAGE_ATTACHMENT("message_attachment"),
    
    OPENGRAPH("opengraph"),
    
    LINK("link");

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

  private String url;

  private Object data;

  public PostMetadataEmbedsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of content that is embedded in this point.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of content that is embedded in this point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PostMetadataEmbedsInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the embedded content, if one exists.
   * @return url
  */
  
  @Schema(name = "url", description = "The URL of the embedded content, if one exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PostMetadataEmbedsInner data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Any additional information about the embedded content. Only used at this time to store OpenGraph metadata. This field will be null for non-OpenGraph embeds. 
   * @return data
  */
  
  @Schema(name = "data", description = "Any additional information about the embedded content. Only used at this time to store OpenGraph metadata. This field will be null for non-OpenGraph embeds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMetadataEmbedsInner postMetadataEmbedsInner = (PostMetadataEmbedsInner) o;
    return Objects.equals(this.type, postMetadataEmbedsInner.type) &&
        Objects.equals(this.url, postMetadataEmbedsInner.url) &&
        Objects.equals(this.data, postMetadataEmbedsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMetadataEmbedsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

