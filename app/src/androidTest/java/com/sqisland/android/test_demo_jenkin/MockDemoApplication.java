package com.sqisland.android.test_demo_jenkin;

public class MockDemoApplication extends DemoApplication {
  @Override
  protected DemoComponent createComponent() {
    return DaggerMainActivityTest_TestComponent.builder().build();
  }
}