package com.example.designpattern.chainofresponsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RequestHandler {

  private final RequestHandler nextHandler;

  public void handler(Request request) {
    if(nextHandler != null) {
      nextHandler.handler(request);
    }
  }
}
