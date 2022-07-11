package com.example.designpattern.bridge;

import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration.TransactionTemplateConfiguration;

public class App {

  public static void main(String[] args) {
    Champion kdaAhri = new 아리(new KDA());
    kdaAhri.move();
    kdaAhri.skillR();


  }
}
