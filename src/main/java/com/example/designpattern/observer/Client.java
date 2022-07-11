package com.example.designpattern.observer;

import lombok.RequiredArgsConstructor;

public class Client {

  public static void main(String[] args) {
    ChatServer chatServer = new ChatServer();

    User user1 = new User("snack");
    User user2 = new User("gum");
    User user3 = new User("wine");

    chatServer.register("game", user1);
    chatServer.register("game", user2);
    chatServer.register("pattern", user1);
    chatServer.register("pattern", user3);

    chatServer.sendMessage(user1, "game", "lol!");
    chatServer.sendMessage(user3, "pattern", "observer!");


  }
}
