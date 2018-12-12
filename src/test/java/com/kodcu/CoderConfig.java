package com.kodcu;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoderConfig {

  @Bean
  public Coder knight() {
    return new JavaCoder(quest());
  }

  @Bean
  public Analist quest() {
    return new FunctionalAnalist(stream());
  }

  @Bean
  public PrintStream stream() {
    return new FakePrintStream();
  }

}
