package com.sqisland.android.test_demo_jenkin;

import org.joda.time.DateTime;

import javax.inject.Singleton;

@Singleton
public class Clock {
  public DateTime getNow() {
    return new DateTime();
  }
}