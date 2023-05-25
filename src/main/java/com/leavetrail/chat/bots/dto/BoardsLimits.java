package com.leavetrail.chat.bots.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoardsLimits
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:11:49.391170+02:00[Europe/Warsaw]")
public class BoardsLimits {

  private JsonNullable<Integer> cards = JsonNullable.undefined();

  private JsonNullable<Integer> views = JsonNullable.undefined();

  public BoardsLimits cards(Integer cards) {
    this.cards = JsonNullable.of(cards);
    return this;
  }

  /**
   * Get cards
   * @return cards
  */
  
  @Schema(name = "cards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cards")
  public JsonNullable<Integer> getCards() {
    return cards;
  }

  public void setCards(JsonNullable<Integer> cards) {
    this.cards = cards;
  }

  public BoardsLimits views(Integer views) {
    this.views = JsonNullable.of(views);
    return this;
  }

  /**
   * Get views
   * @return views
  */
  
  @Schema(name = "views", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("views")
  public JsonNullable<Integer> getViews() {
    return views;
  }

  public void setViews(JsonNullable<Integer> views) {
    this.views = views;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardsLimits boardsLimits = (BoardsLimits) o;
    return equalsNullable(this.cards, boardsLimits.cards) &&
        equalsNullable(this.views, boardsLimits.views);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cards), hashCodeNullable(views));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsLimits {\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

