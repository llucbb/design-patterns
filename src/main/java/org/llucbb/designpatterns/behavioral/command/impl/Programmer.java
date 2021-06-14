package org.llucbb.designpatterns.behavioral.command.impl;

import org.llucbb.designpatterns.behavioral.command.Command;

public class Programmer implements Command {

  @Override
  public void execute() {
    System.out.println("sell the bugs, charge extra for the fixes");
  }
}
