package com.subClassed.inherited;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

  List<Product> list = new ArrayList<>();

  @GetMapping("/item/{id}")
  public Product locateAndReturnProduct(@PathVariable("id") int id){
    list.add(new Product("Nintendo 64", 50));
    list.add(new Product("Mongoose", 15));
    return list.get(id);
  }



}
