//: initialization/DynamicArray.java
package Глава5_Инициализация_и_завершение.инициализация_массисов; /* Added by Eclipse.py */
// Array initialization.

public class DynamicArray {
  public static void main(String[] args) {
    Other.main(new String[]{ "fiddle", "de", "dum" });
  }
}

class Other {
  public static void main(String[] args) {
    for(String s : args)
      System.out.print(s + " ");
  }
} /* Output:
fiddle de dum
*///:~
