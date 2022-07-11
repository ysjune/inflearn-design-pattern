package com.example.designpattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {

  private char value;
  private String color;
  private Font font;
}
