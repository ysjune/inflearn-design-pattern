package com.example.designpattern.prototype;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubIssue implements Cloneable {

  private int id;
  private String title;
  private GithubRepository repository;

  public String getUrl() {
    return String.format("https://github.com/%s/%s/issues/%d",
        repository.getUser(),
        repository.getName(),
        this.getId());
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubIssue that = (GithubIssue) o;
    return id == that.id && Objects.equals(title, that.title) && Objects.equals(
        repository, that.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, repository);
  }
}
