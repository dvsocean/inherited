package com.subClassed.inherited;

public class Product {

  private String item;
  private int price;

  public Product(String item, int price) {
    this.item = item;
    this.price = price;
  }

  public String getItem() {
    return item;
  }

  public int getPrice() {
    return price;
  }
}
