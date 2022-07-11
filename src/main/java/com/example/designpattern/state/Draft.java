package com.example.designpattern.state;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Draft implements State{

  private final OnlineCourse onlineCourse;

  @Override
  public void addReview(String review, Student student) {
    throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.");
  }

  @Override
  public void addStudent(Student student) {
    this.onlineCourse.getStudents().add(student);
    if(this.onlineCourse.getStudents().size() > 1) {
     this.onlineCourse.changeState(new Private(this.onlineCourse));
    }
  }

  @Override
  public String toString() {
    return "Draft";
  }
}
