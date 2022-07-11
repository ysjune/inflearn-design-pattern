package com.example.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

  private int blueTeamScore;

  private int redTeamScore;

  public GameSave save() {
    return new GameSave(blueTeamScore, redTeamScore);
  }

  public void restore(GameSave gameSave) {
    this.blueTeamScore = gameSave.getBlueTeamScore();
    this.redTeamScore = gameSave.getRedTeamScore();
  }
}
