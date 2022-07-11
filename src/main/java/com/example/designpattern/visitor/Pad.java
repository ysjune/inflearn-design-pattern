package com.example.designpattern.visitor;

public class Pad implements Device{

  @Override
  public void print(Circle circle) {
    System.out.println("print circle to pad");
  }

  @Override
  public void print(Rectangle rectangle) {
    System.out.println("print rectangle to pad");
  }

  @Override
  public void print(Triangle triangle) {
    System.out.println("print rectangle to pad");
  }
}
