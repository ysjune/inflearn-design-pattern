package com.example.designpattern.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameServiceProxy implements GameService{

  private final GameService gameService;

  @Override
  public void startGame() {
    System.out.println("proxy start");
    gameService.startGame();
    System.out.println("proxy end");
  }
}

