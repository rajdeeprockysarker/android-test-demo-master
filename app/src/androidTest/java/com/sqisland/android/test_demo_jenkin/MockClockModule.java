package com.sqisland.android.test_demo_jenkin;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockClockModule {
  @Provides
  @Singleton
  Clock provideClock() {
    return Mockito.mock(Clock.class);
  }
}