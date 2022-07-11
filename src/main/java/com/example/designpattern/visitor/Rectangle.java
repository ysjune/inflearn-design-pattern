package com.example.designpattern.visitor;

public class Rectangle implements Shape{

  @Override
  public void accept(Device device) {
      device.print(this);
  }
}
