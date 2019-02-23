//: initialization/BananaPeel.java
package Глава5_Инициализация_и_завершение.ключевое_слово_this; /* Added by Eclipse.py */

class Banana { void peel(int i) { /* ... */ } }

public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
           b = new Banana();
    a.peel(1);
    b.peel(2);
  }
} ///:~
