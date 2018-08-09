package com.subClassed.inherited;

import java.util.ArrayList;
import java.util.List;

public class Product {

  private String item;

  List<String> list = new ArrayList<>();

  public Product(String item) {
    list.add("Exotic Car");
    list.add("Helicoptors and Bikes");
    list.add("Beerbongs and Bentleys");
    list.add(item);
  }

  public String getItem(int ind) {
    return list.get(ind);
  }
}
