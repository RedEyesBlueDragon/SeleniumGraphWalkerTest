package com.company;

import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;

import java.io.IOException;

public class Runner {

  //public static WebDriver driver = null;

  public static void main(String[] args) throws IOException {



    TestExecutor executor = new TestExecutor(
      VisitTest.class
    );

    Result result = executor.execute(true);
    System.out.println("Done: [" + result.getResults().toString(2) + "]");
  }
}
