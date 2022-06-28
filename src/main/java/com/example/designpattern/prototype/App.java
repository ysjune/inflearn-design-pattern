package com.example.designpattern.prototype;

public class App {

  public static void main(String[] args) throws Exception{


    //TODO clone != githubIssue
    //TODO clone.equals(githubIssue) => true
    GithubRepository repository = new GithubRepository();
    repository.setUser("user");
    repository.setName("name");

    GithubIssue issue = new GithubIssue();
    GithubIssue clone = (GithubIssue) issue.clone();

    System.out.println(clone != issue);
    System.out.println(clone.equals(issue));
    System.out.println(clone.getClass() == issue.getClass());
  }

}
