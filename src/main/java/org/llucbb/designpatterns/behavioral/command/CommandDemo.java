package org.llucbb.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import org.llucbb.designpatterns.behavioral.command.impl.DomesticEngineer;
import org.llucbb.designpatterns.behavioral.command.impl.Politician;
import org.llucbb.designpatterns.behavioral.command.impl.Programmer;

public class CommandDemo {

  public static List<Command> produceRequests() {
    List<Command> queue = new ArrayList<>();
    queue.add(new DomesticEngineer());
    queue.add(new Politician());
    queue.add(new Programmer());
    return queue;
  }

  public static void workOffRequests(List<Command> queue) {
    for (Command command : queue) {
      command.execute();
    }
  }

  public static void main(String[] args) {
    List<Command> queue = produceRequests();
    workOffRequests(queue);
  }
}
