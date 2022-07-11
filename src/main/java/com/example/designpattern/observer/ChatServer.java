package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

  private Map<String, List<Subscriber>> subscribers = new HashMap<>();

  public void register(String subject, Subscriber subscriber) {
    if(this.subscribers.containsKey(subject)) {
      this.subscribers.get(subject).add(subscriber);
    } else {
      ArrayList<Subscriber> list = new ArrayList<>();
      list.add(subscriber);
      this.subscribers.put(subject, list);
    }
  }

  public void unregister(String subject, Subscriber subscriber) {
    if(this.subscribers.containsKey(subject)) {
      this.subscribers.get(subject).remove(subscriber);
    }
  }

  public void sendMessage(User user, String subject, String message) {
    if(this.subscribers.containsKey(subject)) {
      String userMessage = user.getName() + ": " + message;
      this.subscribers.get(subject).forEach(v -> v.HandleMessage(userMessage));
    }
  }
}
