package org.llucbb.designpatterns.behavioral.strategy;

import org.llucbb.designpatterns.behavioral.strategy.impl.BAR;
import org.llucbb.designpatterns.behavioral.strategy.impl.FOO;

/** @see <a href="https://sourcemaking.com/design_patterns/strategy">Strategy Design Pattern</a> */
public class StrategyDemo {

  private static void execute(Strategy strategy) {
    strategy.solve();
  }

  public static void main(String[] args) {
    Strategy[] algorithms = {new FOO(), new BAR()};
    for (Strategy algorithm : algorithms) {
      execute(algorithm);
    }
  }
}
