package com.kodcu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CoderConfig.class,loader=AnnotationConfigContextLoader.class)
public class CoderJavaConfigInjectionTest {

  @Autowired
  Coder coder;
  
  @Autowired
  FakePrintStream printStream;

  @After
  public void clearPrintStream() {
    printStream.clear();
  }

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    coder.startCoding();
    assertEquals(
        "Analyzing the Functional side ...\n",
        printStream.getPrintedString());
  }

}
