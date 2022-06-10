package com.example.designpattern.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

  private Settings() { }

  private static class SettingHolder {
    private static volatile Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

  protected  Object readResolve() {
    return getInstance();
  }
}
