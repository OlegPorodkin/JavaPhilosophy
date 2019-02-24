//: exceptions/OnOffSwitch.java
package Глава12_Обработка_ошибок_и_исключения; /* Added by Eclipse.py */
// Why use finally?

public class OnOffSwitch {
  private static Switch sw = new Switch();
  public static void f() {}
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      f();
      sw.off();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
      sw.off();
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
