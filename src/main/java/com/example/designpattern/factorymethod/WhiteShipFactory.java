package com.example.designpattern.factorymethod;

public class WhiteShipFactory implements ShipFactory{

  @Override
  public Ship createShip() {
    return new WhiteShip();
  }
}
