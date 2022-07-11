package com.example.designpattern.decorate;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommentDecorator implements CommentService{

  private final CommentService commentService;

  @Override
  public void addComment(String comment) {
    commentService.addComment(comment);
  }
}
