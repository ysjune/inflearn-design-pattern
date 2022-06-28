package com.example.designpattern.abstractfactory;

public interface ShipPartsFactory {

  Anchor createAnchor();

  Wheel createWheel();
}
