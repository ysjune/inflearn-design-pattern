package com.example.designpattern.proxy;

public class DefaultGameService implements GameService {

  @Override
  public void startGame() {
    System.out.println("game start!");
  }
}
