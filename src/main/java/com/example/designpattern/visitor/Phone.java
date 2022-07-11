package com.example.designpattern.visitor;

public class Phone implements Device{

  @Override
  public void print(Circle circle) {
    System.out.println("print circle to phone");
  }

  @Override
  public void print(Rectangle rectangle) {
    System.out.println("print rectangle to phone");
  }

  @Override
  public void print(Triangle triangle) {
    System.out.println("print rectangle to phone");
  }
}
