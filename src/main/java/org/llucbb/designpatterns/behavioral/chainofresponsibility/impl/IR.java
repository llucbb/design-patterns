package org.llucbb.designpatterns.behavioral.chainofresponsibility.impl;

import org.llucbb.designpatterns.behavioral.chainofresponsibility.Image;

public class IR implements Image {

  @Override
  public String process() {
    return "IR";
  }
}
