package com.kodcu;

import java.io.PrintStream;

public class KanbanMaster {

  private PrintStream stream;
  
  public KanbanMaster(PrintStream stream) {
    this.stream = stream;
  }

  public void doBeforeStart() {
    stream.println("Replenishment is going to start");
  }

  public void doAfter() {
    stream.println("All requirements are done. I love my Agile team");
  }

}
