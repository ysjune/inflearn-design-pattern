package com.example.designpattern.flyweight;

public class Client {

  public static void main(String[] args) {
    FontFactory fontFactory = new FontFactory();
    Character c1 = new Character('h', "white", fontFactory.getFont("gothic:12"));
    Character c2 = new Character('c', "black", fontFactory.getFont("gulim:13"));
    Character c3 = new Character('d', "blue", fontFactory.getFont("namun:11"));
    Character c4 = new Character('e', "green", fontFactory.getFont("myungjo:10"));

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
  }
}
