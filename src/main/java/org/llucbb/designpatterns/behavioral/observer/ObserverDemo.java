package org.llucbb.designpatterns.behavioral.observer;

import java.util.Scanner;
import org.llucbb.designpatterns.behavioral.observer.impl.BinObserver;
import org.llucbb.designpatterns.behavioral.observer.impl.HexObserver;
import org.llucbb.designpatterns.behavioral.observer.impl.OctObserver;

/** @see <a href="https://sourcemaking.com/design_patterns/observer">Observer Design Pattern</a> */
public class ObserverDemo {

  public static void main(String[] args) {
    Subject sub = new Subject();
    new HexObserver(sub);
    new OctObserver(sub);
    new BinObserver(sub);
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("\nEnter a number: ");
      sub.setState(scan.nextInt());
    }
  }
}
