package com.example.designpattern.proxy;

public class Client {

  public static void main(String[] args) {
    GameServiceProxy proxy = new GameServiceProxy(new DefaultGameService());
    proxy.startGame();
  }
}
