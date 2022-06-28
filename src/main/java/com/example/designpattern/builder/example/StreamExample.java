package com.example.designpattern.builder.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamExample {

  public static void main(String[] args) {
    Builder<String> stringStreamBuilder = Stream.builder();
    Stream<String> names = stringStreamBuilder.add("lazy").add("snack").build();
    names.collect(Collectors.toList()).forEach(System.out::println);
  }

}
