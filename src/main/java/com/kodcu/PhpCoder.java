package com.kodcu;

public class PhpCoder implements Coder {

  private BusinessAnalist quest;

  public PhpCoder() {
    this.quest = new BusinessAnalist();
  }

  public void startCoding() {
    quest.makeAnalize();
  }

}
