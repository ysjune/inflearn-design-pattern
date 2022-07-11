package com.example.designpattern.interpreter;

import java.util.Map;

public interface PostfixExpression {

  int interpret(Map<Character, Integer> context);
}
