package com.leavetrail.chat.users.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Timezone
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:27:21.756932+02:00[Europe/Warsaw]")
public class Timezone {

  private Boolean useAutomaticTimezone;

  private String manualTimezone;

  private String automaticTimezone;

  public Timezone useAutomaticTimezone(Boolean useAutomaticTimezone) {
    this.useAutomaticTimezone = useAutomaticTimezone;
    return this;
  }

  /**
   * Set to \"true\" to use the browser/system timezone, \"false\" to set manually. Defaults to \"true\".
   * @return useAutomaticTimezone
  */
  
  @Schema(name = "useAutomaticTimezone", description = "Set to \"true\" to use the browser/system timezone, \"false\" to set manually. Defaults to \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useAutomaticTimezone")
  public Boolean getUseAutomaticTimezone() {
    return useAutomaticTimezone;
  }

  public void setUseAutomaticTimezone(Boolean useAutomaticTimezone) {
    this.useAutomaticTimezone = useAutomaticTimezone;
  }

  public Timezone manualTimezone(String manualTimezone) {
    this.manualTimezone = manualTimezone;
    return this;
  }

  /**
   * Value when setting manually the timezone, i.e. \"Europe/Berlin\".
   * @return manualTimezone
  */
  
  @Schema(name = "manualTimezone", description = "Value when setting manually the timezone, i.e. \"Europe/Berlin\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manualTimezone")
  public String getManualTimezone() {
    return manualTimezone;
  }

  public void setManualTimezone(String manualTimezone) {
    this.manualTimezone = manualTimezone;
  }

  public Timezone automaticTimezone(String automaticTimezone) {
    this.automaticTimezone = automaticTimezone;
    return this;
  }

  /**
   * This value is set automatically when the \"useAutomaticTimezone\" is set to \"true\".
   * @return automaticTimezone
  */
  
  @Schema(name = "automaticTimezone", description = "This value is set automatically when the \"useAutomaticTimezone\" is set to \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("automaticTimezone")
  public String getAutomaticTimezone() {
    return automaticTimezone;
  }

  public void setAutomaticTimezone(String automaticTimezone) {
    this.automaticTimezone = automaticTimezone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timezone timezone = (Timezone) o;
    return Objects.equals(this.useAutomaticTimezone, timezone.useAutomaticTimezone) &&
        Objects.equals(this.manualTimezone, timezone.manualTimezone) &&
        Objects.equals(this.automaticTimezone, timezone.automaticTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAutomaticTimezone, manualTimezone, automaticTimezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timezone {\n");
    sb.append("    useAutomaticTimezone: ").append(toIndentedString(useAutomaticTimezone)).append("\n");
    sb.append("    manualTimezone: ").append(toIndentedString(manualTimezone)).append("\n");
    sb.append("    automaticTimezone: ").append(toIndentedString(automaticTimezone)).append("\n");
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

