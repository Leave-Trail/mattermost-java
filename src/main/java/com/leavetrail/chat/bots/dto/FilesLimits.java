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
 * FilesLimits
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:11:49.391170+02:00[Europe/Warsaw]")
public class FilesLimits {

  private JsonNullable<Long> totalStorage = JsonNullable.undefined();

  public FilesLimits totalStorage(Long totalStorage) {
    this.totalStorage = JsonNullable.of(totalStorage);
    return this;
  }

  /**
   * Get totalStorage
   * @return totalStorage
  */
  
  @Schema(name = "total_storage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_storage")
  public JsonNullable<Long> getTotalStorage() {
    return totalStorage;
  }

  public void setTotalStorage(JsonNullable<Long> totalStorage) {
    this.totalStorage = totalStorage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesLimits filesLimits = (FilesLimits) o;
    return equalsNullable(this.totalStorage, filesLimits.totalStorage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(totalStorage));
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
    sb.append("class FilesLimits {\n");
    sb.append("    totalStorage: ").append(toIndentedString(totalStorage)).append("\n");
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

