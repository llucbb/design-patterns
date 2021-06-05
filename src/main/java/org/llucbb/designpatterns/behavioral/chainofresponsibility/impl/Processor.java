package org.llucbb.designpatterns.behavioral.chainofresponsibility.impl;

import java.util.Random;
import org.llucbb.designpatterns.behavioral.chainofresponsibility.Image;

public class Processor {

  private static final Random RANDOM = new Random();
  private static int nextID = 1;
  private final int id = nextID++;

  public boolean execute(Image image) {
    if (RANDOM.nextInt(2) != 0) {
      System.out.println("   Processor " + id + " is busy");
      return false;
    }
    System.out.println("Processor " + id + " - " + image.process());
    return true;
  }
}
