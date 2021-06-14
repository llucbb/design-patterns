package org.llucbb.designpatterns.behavioral.command.impl;

import org.llucbb.designpatterns.behavioral.command.Command;

public class Politician implements Command {

  @Override
  public void execute() {
    System.out.println("take money from the rich, take votes from the poor");
  }
}
