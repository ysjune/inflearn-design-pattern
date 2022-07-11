package com.example.designpattern.composite;

public class Client {

  public static void main(String[] args) {

    Item doranBlade = new Item("doran blade", 500);

    Bag bag = new Bag();
    bag.add(doranBlade);
    bag.add(new Item("doran ring", 500));
    bag.add(new Item("posion", 100));

    System.out.println(bag.getPrintPrice());
    System.out.println(doranBlade.getPrintPrice());
  }
}
