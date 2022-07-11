package com.example.designpattern.flyweight;

import lombok.Getter;

@Getter
public final class Font {

  private final String family;
  private final int size;

  public Font(String family, int size) {
    this.family = family;
    this.size = size;
  }
}
