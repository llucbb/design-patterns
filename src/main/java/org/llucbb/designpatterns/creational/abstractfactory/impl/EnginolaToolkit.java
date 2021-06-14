package org.llucbb.designpatterns.creational.abstractfactory.impl;

import org.llucbb.designpatterns.creational.abstractfactory.AbstractFactory;
import org.llucbb.designpatterns.creational.abstractfactory.model.CPU;
import org.llucbb.designpatterns.creational.abstractfactory.model.EnginolaCPU;
import org.llucbb.designpatterns.creational.abstractfactory.model.EnginolaMMU;
import org.llucbb.designpatterns.creational.abstractfactory.model.MMU;

public class EnginolaToolkit extends AbstractFactory {

  @Override
  public CPU createCPU() {
    return new EnginolaCPU();
  }

  @Override
  public MMU createMMU() {
    return new EnginolaMMU();
  }
}
