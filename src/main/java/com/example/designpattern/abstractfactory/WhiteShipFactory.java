package com.example.designpattern.abstractfactory;

public class WhiteShipFactory {

  private ShipPartsFactory shipPartsFactory;

  public WhiteShipFactory(WhiteShipPartsFactory whiteShipPartsFactory) {
    this.shipPartsFactory = whiteShipPartsFactory;
  }

  public Ship createShip() {
    Ship ship = new WhiteShip();
    ship.setAnchor(shipPartsFactory.createAnchor());
    ship.setWheel(shipPartsFactory.createWheel());
    return ship;
  }
}
