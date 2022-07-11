package com.example.designpattern.strategy;

public class Client {

  public static void main(String[] args) {
    BlueLightRedLight 무궁화꽃게임 = new BlueLightRedLight();
    무궁화꽃게임.blueLight(new Normal());
    무궁화꽃게임.redLight(new Normal());
  }
}
