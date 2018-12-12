package com.kodcu;
  
public class JavaCoder implements Coder {

  private Analist analist;

  public JavaCoder(Analist analist) {
    this.analist = analist;
  }

  public void startCoding() {
    analist.makeAnalize();
  }

}
