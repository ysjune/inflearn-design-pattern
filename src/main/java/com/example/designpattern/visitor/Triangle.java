package com.example.designpattern.visitor;

public class Triangle implements Shape{

  @Override
  public void accept(Device device) {
   device.print(this);
  }
}
