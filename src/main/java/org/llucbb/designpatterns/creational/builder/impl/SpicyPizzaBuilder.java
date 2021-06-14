package org.llucbb.designpatterns.creational.builder.impl;

import org.llucbb.designpatterns.creational.builder.PizzaBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildSauce() {
    pizza.setSauce("hot");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni+salami");
  }
}
