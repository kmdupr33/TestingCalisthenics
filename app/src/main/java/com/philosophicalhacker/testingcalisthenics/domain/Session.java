package com.philosophicalhacker.testingcalisthenics.domain;

class Session {

  private final boolean isKeynote;

  Session(boolean isKeynote) {
    this.isKeynote = isKeynote;
  }

  boolean isKeynote() {
    return isKeynote;
  }
}
