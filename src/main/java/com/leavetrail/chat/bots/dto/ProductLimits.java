package com.leavetrail.chat.bots.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.bots.dto.BoardsLimits;
import com.leavetrail.chat.bots.dto.FilesLimits;
import com.leavetrail.chat.bots.dto.IntegrationsLimits;
import com.leavetrail.chat.bots.dto.MessagesLimits;
import com.leavetrail.chat.bots.dto.TeamsLimits;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductLimits
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T13:58:19.652456+02:00[Europe/Warsaw]")
public class ProductLimits {

  private BoardsLimits boards;

  private FilesLimits files;

  private IntegrationsLimits integrations;

  private MessagesLimits messages;

  private TeamsLimits teams;

  public ProductLimits boards(BoardsLimits boards) {
    this.boards = boards;
    return this;
  }

  /**
   * Get boards
   * @return boards
  */
  @Valid 
  @Schema(name = "boards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boards")
  public BoardsLimits getBoards() {
    return boards;
  }

  public void setBoards(BoardsLimits boards) {
    this.boards = boards;
  }

  public ProductLimits files(FilesLimits files) {
    this.files = files;
    return this;
  }

  /**
   * Get files
   * @return files
  */
  @Valid 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public FilesLimits getFiles() {
    return files;
  }

  public void setFiles(FilesLimits files) {
    this.files = files;
  }

  public ProductLimits integrations(IntegrationsLimits integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * Get integrations
   * @return integrations
  */
  @Valid 
  @Schema(name = "integrations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("integrations")
  public IntegrationsLimits getIntegrations() {
    return integrations;
  }

  public void setIntegrations(IntegrationsLimits integrations) {
    this.integrations = integrations;
  }

  public ProductLimits messages(MessagesLimits messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Get messages
   * @return messages
  */
  @Valid 
  @Schema(name = "messages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages")
  public MessagesLimits getMessages() {
    return messages;
  }

  public void setMessages(MessagesLimits messages) {
    this.messages = messages;
  }

  public ProductLimits teams(TeamsLimits teams) {
    this.teams = teams;
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public TeamsLimits getTeams() {
    return teams;
  }

  public void setTeams(TeamsLimits teams) {
    this.teams = teams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLimits productLimits = (ProductLimits) o;
    return Objects.equals(this.boards, productLimits.boards) &&
        Objects.equals(this.files, productLimits.files) &&
        Objects.equals(this.integrations, productLimits.integrations) &&
        Objects.equals(this.messages, productLimits.messages) &&
        Objects.equals(this.teams, productLimits.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boards, files, integrations, messages, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLimits {\n");
    sb.append("    boards: ").append(toIndentedString(boards)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

