package org.llucbb.designpatterns.creational.abstractfactory;

import org.llucbb.designpatterns.creational.abstractfactory.model.Architecture;
import org.llucbb.designpatterns.creational.abstractfactory.model.CPU;

public class Client {

  public static void main(String[] args) {
    AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
    CPU cpu = factory.createCPU();
  }
}
