package com.example.designpattern.decorate;

public class App {

  private static boolean enabledSpamFilter = true;

  private static boolean enabledTrimming = true;

  public static void main(String[] args) {

    CommentService commentService = new DefaultCommentService();

    if(enabledSpamFilter) {
      commentService = new SpamFilteringCommentDecorator(
          commentService);
    }
    if(enabledTrimming) {
      commentService = new TrimmingCommentDecorator(commentService);
    }

    Client client = new Client(commentService);
    client.writeComment("game");
    client.writeComment("is playing good....");
    client.writeComment("http://naver.com");
  }

}
