package com.philosophicalhacker.testingcalisthenics.domain;

import java.util.ArrayList;
import java.util.List;

class Schedule {

  private final List<Session> sessions = new ArrayList<>();

  List<Session> get() {
    return sessions;
  }

  void add(Session session) {
    sessions.add(session);
  }

  void remove(Session session) {
    if (session.isKeynote()) {
      throw new UnsupportedOperationException();
    }
    sessions.remove(session);
  }
}
