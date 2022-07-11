package com.example.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Subscriber{
  private String name;

  @Override
  public void HandleMessage(String message) {
    System.out.println("who: " + this.name + " || Message : " + message);
  }
}
