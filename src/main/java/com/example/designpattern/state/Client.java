package com.example.designpattern.state;

public class Client {

  public static void main(String[] args) {
    OnlineCourse onlineCourse = new OnlineCourse();
    Student student = new Student("snack");
    Student student2 = new Student("wine");

    onlineCourse.addStudent(student);
//    onlineCourse.addReview("draft review", student);

    onlineCourse.changeState(new Private(onlineCourse));
    onlineCourse.addReview("hello", student);

    student2.addPrivate(onlineCourse);
    onlineCourse.addStudent(student2);

    System.out.println(onlineCourse.getReviews());
    System.out.println(onlineCourse.getState());
    System.out.println(onlineCourse.getStudents());
  }
}
