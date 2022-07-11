package com.example.designpattern.decorate;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

  private final CommentService commentService;

  public void writeComment(String comment) {
    commentService.addComment(comment);
  }

}
