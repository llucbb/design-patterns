package org.llucbb.designpatterns.creational.builder.impl;

import org.llucbb.designpatterns.creational.builder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("cross");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }

  public void buildTopping() {
    pizza.setTopping("ham+pineapple");
  }
}
