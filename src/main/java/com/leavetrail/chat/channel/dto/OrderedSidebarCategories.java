package com.leavetrail.chat.channel.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leavetrail.chat.channel.dto.SidebarCategoryWithChannels;
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
 * List of user&#39;s categories with their channels
 */

@Schema(name = "OrderedSidebarCategories", description = "List of user's categories with their channels")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:40:38.446207+02:00[Europe/Warsaw]")
public class OrderedSidebarCategories {

  @Valid
  private List<String> order;

  @Valid
  private List<@Valid SidebarCategoryWithChannels> categories;

  public OrderedSidebarCategories order(List<String> order) {
    this.order = order;
    return this;
  }

  public OrderedSidebarCategories addOrderItem(String orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
  */
  
  @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public List<String> getOrder() {
    return order;
  }

  public void setOrder(List<String> order) {
    this.order = order;
  }

  public OrderedSidebarCategories categories(List<@Valid SidebarCategoryWithChannels> categories) {
    this.categories = categories;
    return this;
  }

  public OrderedSidebarCategories addCategoriesItem(SidebarCategoryWithChannels categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid SidebarCategoryWithChannels> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid SidebarCategoryWithChannels> categories) {
    this.categories = categories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderedSidebarCategories orderedSidebarCategories = (OrderedSidebarCategories) o;
    return Objects.equals(this.order, orderedSidebarCategories.order) &&
        Objects.equals(this.categories, orderedSidebarCategories.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderedSidebarCategories {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

