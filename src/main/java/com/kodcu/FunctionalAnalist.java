package com.kodcu;

import java.io.PrintStream;

public class FunctionalAnalist implements Analist {

  private PrintStream stream;

  public FunctionalAnalist(PrintStream stream) {
    this.stream = stream;
  }

  public void makeAnalize() {
    stream.println("Analyzing the Functional side ...");
  }

}
