package com.example.designpattern.state;

import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private String name;
  private Set<OnlineCourse> onlineCourses = new HashSet<>();

  public Student(String name) {
    this.name = name;
  }

  public boolean isAvailable(OnlineCourse onlineCourse) {
    return this.onlineCourses.contains(onlineCourse);
  }

  public void addPrivate(OnlineCourse onlineCourse) {
    this.onlineCourses.add(onlineCourse);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }
}
