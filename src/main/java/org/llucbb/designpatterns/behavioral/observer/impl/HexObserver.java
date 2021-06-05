package org.llucbb.designpatterns.behavioral.observer.impl;

import org.llucbb.designpatterns.behavioral.observer.Observer;
import org.llucbb.designpatterns.behavioral.observer.Subject;

public class HexObserver extends Observer {

  public HexObserver(Subject subject) {
    this.subject = subject;
    this.subject.add(this);
  }

  public void update() {
    System.out.print(" " + Integer.toHexString(subject.getState()));
  }
}
