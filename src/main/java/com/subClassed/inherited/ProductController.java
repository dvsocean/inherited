package com.subClassed.inherited;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  private Product product = new Product("Desert Storm");

  @GetMapping("/item/{id}")
  public String locateAndReturnProduct(@PathVariable("id") int id){
    return product.getItem(id);
  }



}
