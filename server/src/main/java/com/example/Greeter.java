package com.example;


import java.util.Map;


  /**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    try {
      Map map = System.getProperties();
      for(;;) {
        map.put(new MemLeak("&amp;quot;key&amp;quot"), "test");
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }



  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
