package com.example.designpattern.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOnCommand implements Command{

  private final Light light;

  @Override
  public void execute() {
    light.on();
  }
}
