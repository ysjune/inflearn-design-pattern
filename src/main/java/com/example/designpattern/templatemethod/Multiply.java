package com.example.designpattern.templatemethod;

public class Multiply implements Operator{

  @Override
  public int getResult(int result, int number) {
    if(result == 0) {
      result = 1;
    }
    return result *= number;
  }
}
