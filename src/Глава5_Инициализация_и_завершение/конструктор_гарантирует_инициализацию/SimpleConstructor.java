//: initialization/SimpleConstructor.java
package Глава5_Инициализация_и_завершение.конструктор_гарантирует_инициализацию; /* Added by Eclipse.py */
// Demonstration of a simple constructor.

class Rock {
  Rock() { // This is the constructor
    System.out.print("Rock ");
  }
}

public class SimpleConstructor {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
      new Rock();
  }
} /* Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*///:~
