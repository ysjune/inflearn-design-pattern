package com.example.designpattern.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Button {

  private final Command command;

  public void press() {
    command.execute();
  }

  public static void main(String[] args) {
    Button button = new Button(new GameStartCommand(new Game()));
    button.press();
  }
}
