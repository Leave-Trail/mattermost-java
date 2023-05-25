package com.leavetrail.chat.posts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.posts.dto.Emoji;
import com.leavetrail.chat.posts.dto.FileInfo;
import com.leavetrail.chat.posts.dto.PostAcknowledgement;
import com.leavetrail.chat.posts.dto.PostMetadataEmbedsInner;
import com.leavetrail.chat.posts.dto.PostMetadataImagesInner;
import com.leavetrail.chat.posts.dto.PostMetadataPriority;
import com.leavetrail.chat.posts.dto.Reaction;
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
 * Additional information used to display a post.
 */

@Schema(name = "PostMetadata", description = "Additional information used to display a post.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T14:09:08.499061+02:00[Europe/Warsaw]")
public class PostMetadata {

  @Valid
  private List<@Valid PostMetadataEmbedsInner> embeds;

  @Valid
  private List<@Valid Emoji> emojis;

  @Valid
  private List<@Valid FileInfo> files;

  @Valid
  private List<@Valid PostMetadataImagesInner> images;

  @Valid
  private List<@Valid Reaction> reactions;

  private PostMetadataPriority priority;

  @Valid
  private List<@Valid PostAcknowledgement> acknowledgements;

  public PostMetadata embeds(List<@Valid PostMetadataEmbedsInner> embeds) {
    this.embeds = embeds;
    return this;
  }

  public PostMetadata addEmbedsItem(PostMetadataEmbedsInner embedsItem) {
    if (this.embeds == null) {
      this.embeds = new ArrayList<>();
    }
    this.embeds.add(embedsItem);
    return this;
  }

  /**
   * Information about content embedded in the post including OpenGraph previews, image link previews, and message attachments. This field will be null if the post does not contain embedded content. 
   * @return embeds
  */
  @Valid 
  @Schema(name = "embeds", description = "Information about content embedded in the post including OpenGraph previews, image link previews, and message attachments. This field will be null if the post does not contain embedded content. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("embeds")
  public List<@Valid PostMetadataEmbedsInner> getEmbeds() {
    return embeds;
  }

  public void setEmbeds(List<@Valid PostMetadataEmbedsInner> embeds) {
    this.embeds = embeds;
  }

  public PostMetadata emojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public PostMetadata addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * The custom emojis that appear in this point or have been used in reactions to this post. This field will be null if the post does not contain custom emojis. 
   * @return emojis
  */
  @Valid 
  @Schema(name = "emojis", description = "The custom emojis that appear in this point or have been used in reactions to this post. This field will be null if the post does not contain custom emojis. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emojis")
  public List<@Valid Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
  }

  public PostMetadata files(List<@Valid FileInfo> files) {
    this.files = files;
    return this;
  }

  public PostMetadata addFilesItem(FileInfo filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * The FileInfo objects for any files attached to the post. This field will be null if the post does not have any file attachments. 
   * @return files
  */
  @Valid 
  @Schema(name = "files", description = "The FileInfo objects for any files attached to the post. This field will be null if the post does not have any file attachments. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid FileInfo> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid FileInfo> files) {
    this.files = files;
  }

  public PostMetadata images(List<@Valid PostMetadataImagesInner> images) {
    this.images = images;
    return this;
  }

  public PostMetadata addImagesItem(PostMetadataImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * An object mapping the URL of an external image to an object containing the dimensions of that image. This field will be null if the post or its embedded content does not reference any external images. 
   * @return images
  */
  @Valid 
  @Schema(name = "images", description = "An object mapping the URL of an external image to an object containing the dimensions of that image. This field will be null if the post or its embedded content does not reference any external images. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public List<@Valid PostMetadataImagesInner> getImages() {
    return images;
  }

  public void setImages(List<@Valid PostMetadataImagesInner> images) {
    this.images = images;
  }

  public PostMetadata reactions(List<@Valid Reaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public PostMetadata addReactionsItem(Reaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

  /**
   * Any reactions made to this point. This field will be null if no reactions have been made to this post. 
   * @return reactions
  */
  @Valid 
  @Schema(name = "reactions", description = "Any reactions made to this point. This field will be null if no reactions have been made to this post. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reactions")
  public List<@Valid Reaction> getReactions() {
    return reactions;
  }

  public void setReactions(List<@Valid Reaction> reactions) {
    this.reactions = reactions;
  }

  public PostMetadata priority(PostMetadataPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public PostMetadataPriority getPriority() {
    return priority;
  }

  public void setPriority(PostMetadataPriority priority) {
    this.priority = priority;
  }

  public PostMetadata acknowledgements(List<@Valid PostAcknowledgement> acknowledgements) {
    this.acknowledgements = acknowledgements;
    return this;
  }

  public PostMetadata addAcknowledgementsItem(PostAcknowledgement acknowledgementsItem) {
    if (this.acknowledgements == null) {
      this.acknowledgements = new ArrayList<>();
    }
    this.acknowledgements.add(acknowledgementsItem);
    return this;
  }

  /**
   * Any acknowledgements made to this point. 
   * @return acknowledgements
  */
  @Valid 
  @Schema(name = "acknowledgements", description = "Any acknowledgements made to this point. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgements")
  public List<@Valid PostAcknowledgement> getAcknowledgements() {
    return acknowledgements;
  }

  public void setAcknowledgements(List<@Valid PostAcknowledgement> acknowledgements) {
    this.acknowledgements = acknowledgements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMetadata postMetadata = (PostMetadata) o;
    return Objects.equals(this.embeds, postMetadata.embeds) &&
        Objects.equals(this.emojis, postMetadata.emojis) &&
        Objects.equals(this.files, postMetadata.files) &&
        Objects.equals(this.images, postMetadata.images) &&
        Objects.equals(this.reactions, postMetadata.reactions) &&
        Objects.equals(this.priority, postMetadata.priority) &&
        Objects.equals(this.acknowledgements, postMetadata.acknowledgements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeds, emojis, files, images, reactions, priority, acknowledgements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMetadata {\n");
    sb.append("    embeds: ").append(toIndentedString(embeds)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    acknowledgements: ").append(toIndentedString(acknowledgements)).append("\n");
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

