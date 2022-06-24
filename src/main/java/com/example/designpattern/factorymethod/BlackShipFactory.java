package com.example.designpattern.factorymethod;

public class BlackShipFactory implements ShipFactory{

  @Override
  public Ship createShip() {
    return new BlackShip();
  }
}
