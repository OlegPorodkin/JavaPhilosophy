//: initialization/MethodInit3.java
package Глава5_Инициализация_и_завершение; /* Added by Eclipse.py */
public class MethodInit3 {
  //! int j = g(i); // Illegal forward reference
  int i = f();
  int f() { return 11; }
  int g(int n) { return n * 10; }
} ///:~
