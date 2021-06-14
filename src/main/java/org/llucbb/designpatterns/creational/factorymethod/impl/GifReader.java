package org.llucbb.designpatterns.creational.factorymethod.impl;

import org.llucbb.designpatterns.creational.factorymethod.DecodedImage;
import org.llucbb.designpatterns.creational.factorymethod.ImageReader;

public class GifReader implements ImageReader {

  private final DecodedImage decodedImage;

  public GifReader(String image) {
    this.decodedImage = new DecodedImage(image);
  }

  @Override
  public DecodedImage getDecodeImage() {
    return decodedImage;
  }
}
