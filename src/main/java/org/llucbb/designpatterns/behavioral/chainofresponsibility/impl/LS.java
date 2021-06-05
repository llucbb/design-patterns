package org.llucbb.designpatterns.behavioral.chainofresponsibility.impl;

import org.llucbb.designpatterns.behavioral.chainofresponsibility.Image;

public class LS implements Image {

  @Override
  public String process() {
    return "LS";
  }
}
