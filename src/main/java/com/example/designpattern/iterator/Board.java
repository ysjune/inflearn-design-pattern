package com.example.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

  private List<Post> posts = new ArrayList<>();

  public void addPost(String content) {
    posts.add(new Post(content));
  }

  public Iterator<Post> getDefaultIterator() {
    return posts.iterator();
  }

  public Iterator<Post> getRecentPostIterator() {
    return new RecentPostIterator(this);
  }
}
