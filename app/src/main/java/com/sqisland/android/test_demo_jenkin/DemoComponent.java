package com.sqisland.android.test_demo_jenkin;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ClockModule.class)
public interface DemoComponent {
  void inject(MainActivity mainActivity);
}