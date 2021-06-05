package org.llucbb.designpatterns.behavioral.chainofresponsibility;

import org.llucbb.designpatterns.behavioral.chainofresponsibility.impl.IR;
import org.llucbb.designpatterns.behavioral.chainofresponsibility.impl.LS;
import org.llucbb.designpatterns.behavioral.chainofresponsibility.impl.Processor;

/**
 * @see <a href="https://sourcemaking.com/design_patterns/chain_of_responsibility">Chain of
 *     Responsibility Design Pattern</a>
 */
public class ChainDemo {

  public static void main(String[] args) {
    Image[] inputImages = {new IR(), new IR(), new LS(), new IR(), new LS(), new LS()};
    Processor[] processors = {new Processor(), new Processor(), new Processor()};
    for (int i = 0, j; i < inputImages.length; i++) {
      System.out.println("Operation #" + (i + 1) + ":");
      j = 0;
      while (!processors[j].execute(inputImages[i])) {
        j = (j + 1) % processors.length;
      }
      System.out.println();
    }
  }
}
