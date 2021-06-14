package org.llucbb.designpatterns.creational.abstractfactory.impl;

import org.llucbb.designpatterns.creational.abstractfactory.AbstractFactory;
import org.llucbb.designpatterns.creational.abstractfactory.model.CPU;
import org.llucbb.designpatterns.creational.abstractfactory.model.EmberCPU;
import org.llucbb.designpatterns.creational.abstractfactory.model.EmberMMU;
import org.llucbb.designpatterns.creational.abstractfactory.model.MMU;

public class EmberToolkit extends AbstractFactory {

  @Override
  public CPU createCPU() {
    return new EmberCPU();
  }

  @Override
  public MMU createMMU() {
    return new EmberMMU();
  }
}
