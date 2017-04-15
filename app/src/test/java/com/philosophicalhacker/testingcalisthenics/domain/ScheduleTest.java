package com.philosophicalhacker.testingcalisthenics.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ScheduleTest {
  @Test public void removesNonKeynoteSession() throws Exception {
    Schedule schedule = new Schedule();
    final Session session = new Session(false);
    schedule.add(session);
    schedule.remove(session);
    assertFalse(schedule.get().contains(session));
  }

  @Test(expected = UnsupportedOperationException.class) public void throwsOnRemoveKeyNote() throws Exception {
    Schedule schedule = new Schedule();
    final Session session = new Session(true);
    schedule.add(session);
    schedule.remove(session);
  }
}