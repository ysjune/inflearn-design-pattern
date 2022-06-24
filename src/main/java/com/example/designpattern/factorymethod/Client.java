package com.example.designpattern.factorymethod;

public class Client {

  public static void main(String[] args) {

    Client client = new Client();
    client.print(new WhiteShipFactory(), "whiteShip", "ss@mail.com");

    Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "ss@mail.com");
    System.out.println(whiteShip);

    Ship blackShip = new BlackShipFactory().orderShip("blackShip", "ss@mail.com");
    System.out.println(blackShip);
  }

  private void print(ShipFactory ShipFactory, String name, String email) {
    System.out.println(ShipFactory.orderShip(name, email));
  }
}
