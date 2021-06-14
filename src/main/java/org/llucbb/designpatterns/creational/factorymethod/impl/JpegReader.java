package org.llucbb.designpatterns.creational.factorymethod.impl;

import org.llucbb.designpatterns.creational.factorymethod.DecodedImage;
import org.llucbb.designpatterns.creational.factorymethod.ImageReader;

public class JpegReader implements ImageReader {

  private final DecodedImage decodedImage;

  public JpegReader(String image) {
    decodedImage = new DecodedImage(image);
  }

  @Override
  public DecodedImage getDecodeImage() {
    return decodedImage;
  }
}
