//: exceptions/ExceptionSilencer.java
package Глава12_Обработка_ошибок_и_исключения; /* Added by Eclipse.py */

public class ExceptionSilencer {
  public static void main(String[] args) {
    try {
      throw new RuntimeException();
    } finally {
      // Using 'return' inside the finally block
      // will silence any thrown exception.
      return;
    }
  }
} ///:~
