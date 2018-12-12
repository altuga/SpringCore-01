package com.kodcu;
import static org.mockito.Mockito.*;

import org.junit.Test;



public class JavaCoderTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Analist mockAnalist = mock(Analist.class);
    JavaCoder knight = new JavaCoder(mockAnalist);
    knight.startCoding();
    verify(mockAnalist, times(1)).makeAnalize();
  }

}
