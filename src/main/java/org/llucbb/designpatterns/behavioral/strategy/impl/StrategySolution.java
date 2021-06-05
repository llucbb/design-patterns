package org.llucbb.designpatterns.behavioral.strategy.impl;

import org.llucbb.designpatterns.behavioral.strategy.Strategy;

public abstract class StrategySolution implements Strategy {

  @Override
  public void solve() {
    start();
    while (nextTry() && !isSolution()) {}
    stop();
  }

  abstract void start();

  abstract boolean nextTry();

  abstract boolean isSolution();

  abstract void stop();
}
