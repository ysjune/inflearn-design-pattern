package com.example.designpattern.templatemethod;

public class Plus implements Operator{

  @Override
  public int getResult(int result, int number) {
    return result += number;
  }
}
