//: exceptions/NeverCaught.java
package Глава12_Обработка_ошибок_и_исключения; /* Added by Eclipse.py */
// Ignoring RuntimeExceptions.
// {ThrowsException}

public class NeverCaught {
  static void f() {
    throw new RuntimeException("From f()");
  }
  static void g() {
    f();
  }
  public static void main(String[] args) {
    g();
  }
} ///:~
