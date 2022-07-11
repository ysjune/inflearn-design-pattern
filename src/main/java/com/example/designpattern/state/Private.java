package com.example.designpattern.state;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Private implements State{

  private final OnlineCourse onlineCourse;

  @Override
  public void addReview(String review, Student student) {
    if(this.onlineCourse.getStudents().contains(student)) {
      this.onlineCourse.getReviews().add(review);
    } else {
      throw new UnsupportedOperationException("프라이빗 코스는 수강하는 학생만 리뷰를 남길 수 있습니다.");
    }
  }

  @Override
  public void addStudent(Student student) {
    if(student.isAvailable(this.onlineCourse)) {
      this.onlineCourse.getStudents().add(student);
    } else {
      throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 엇습니다.");
    }
  }

  @Override
  public String toString() {
    return "Private";
  }
}
