package com.example.designpattern.strategy;


public class BlueLightRedLight {

  public void blueLight(Speed speed) {
    speed.blueLight();
  }

  public void redLight(Speed speed) {
    speed.redLight();
  }
}
