package com.example.designpattern.iterator;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

  private String content;

  private LocalDateTime createdDateTime;

  public Post(String content) {
    this.content = content;
    this.createdDateTime = LocalDateTime.now();
  }
}
