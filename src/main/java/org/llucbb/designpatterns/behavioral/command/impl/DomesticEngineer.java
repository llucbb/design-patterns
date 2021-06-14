package org.llucbb.designpatterns.behavioral.command.impl;

import org.llucbb.designpatterns.behavioral.command.Command;

public class DomesticEngineer implements Command {

  @Override
  public void execute() {
    System.out.println("take out the trash");
  }
}
