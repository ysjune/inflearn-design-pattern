package com.example.designpattern.memento;

public class Client {

  public static void main(String[] args) {
    Game game = new Game(10, 20);

    GameSave save = game.save();
    game.setBlueTeamScore(12);
    game.setRedTeamScore(33);

    game.restore(save);

    System.out.println(game.getBlueTeamScore());
    System.out.println(game.getRedTeamScore());

  }

}
