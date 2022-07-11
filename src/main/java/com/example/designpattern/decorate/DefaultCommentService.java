package com.example.designpattern.decorate;

public class DefaultCommentService implements CommentService{

  @Override
  public void addComment(String comment) {
    System.out.println(comment);
  }
}
