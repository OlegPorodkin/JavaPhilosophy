//: exceptions/WithFinally.java
package Глава12_Обработка_ошибок_и_исключения; /* Added by Eclipse.py */
// Finally Guarantees cleanup.

public class WithFinally {
  static Switch sw = new Switch();
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      OnOffSwitch.f();
    } finally {
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
