package com.example.designpattern.command;

public class Light {

  private boolean isOn;

  public void off() {
    System.out.println("light off");
    this.isOn = false;
  }

  public void on() {
    System.out.println("light on");
    this.isOn = true;
  }
}
