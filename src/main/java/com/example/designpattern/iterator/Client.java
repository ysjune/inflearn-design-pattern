package com.example.designpattern.iterator;

import java.util.Iterator;

public class Client {

  public static void main(String[] args) {
    Board board = new Board();
    board.addPost("design pattern game");
    board.addPost("sensei, do game?");
    board.addPost("all");

    Iterator<Post> recentPostIterator = board.getRecentPostIterator();
    while (recentPostIterator.hasNext()) {
      Post next = recentPostIterator.next();
      System.out.println(next.getContent());
    }

    board.getPosts().iterator().forEachRemaining(p -> System.out.println(p.getContent()));
  }

}
