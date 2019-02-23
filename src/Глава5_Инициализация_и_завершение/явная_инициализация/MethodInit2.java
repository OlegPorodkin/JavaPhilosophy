//: initialization/MethodInit2.java
package Глава5_Инициализация_и_завершение.явная_инициализация; /* Added by Eclipse.py */
public class MethodInit2 {
  int i = f();
  int j = g(i);
  int f() { return 11; }
  int g(int n) { return n * 10; }
} ///:~
