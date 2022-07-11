package com.example.designpattern.chainofresponsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

  private final RequestHandler requestHandler;

  public void doWork() {
    Request jakpot = new Request("this game is jakpot");
    requestHandler.handler(jakpot);
  }

  public static void main(String[] args) {
    RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
    Client client = new Client(handler);
    client.doWork();
  }
}
