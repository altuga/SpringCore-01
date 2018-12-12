package com.kodcu;

        import org.springframework.context.support.
        ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                    "META-INF/analist.xml");
    Coder coder = context.getBean(Coder.class);
    coder.startCoding();
    context.close();
  }

}
