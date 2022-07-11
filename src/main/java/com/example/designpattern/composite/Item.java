package com.example.designpattern.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Component{

  private String name;
  private int price;

  @Override
  public int getPrintPrice() {
    return this.price;
  }
}
