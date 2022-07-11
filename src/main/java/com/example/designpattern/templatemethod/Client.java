package com.example.designpattern.templatemethod;

public class Client {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessor("number.txt");
    int result = fileProcessor.process(new Multiply());
    System.out.println(result);
  }
}
