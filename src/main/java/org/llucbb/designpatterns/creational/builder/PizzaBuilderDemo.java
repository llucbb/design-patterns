package org.llucbb.designpatterns.creational.builder;

import org.llucbb.designpatterns.creational.builder.impl.HawaiianPizzaBuilder;
import org.llucbb.designpatterns.creational.builder.impl.SpicyPizzaBuilder;
import org.llucbb.designpatterns.creational.builder.model.Pizza;

public class PizzaBuilderDemo {

  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
    PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();

    waiter.setPizzaBuilder(hawaiianBuilder);
    waiter.constructPizza();

    Pizza pizza = waiter.getPizza();
  }
}
