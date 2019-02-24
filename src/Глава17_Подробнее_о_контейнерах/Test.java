//: containers/Test.java
package Глава17_Подробнее_о_контейнерах; /* Added by Eclipse.py */
// Framework for performing timed tests of containers.

public abstract class Test<C> {
  String name;
  public Test(String name) { this.name = name; }
  // Override this method for different tests.
  // Returns actual number of repetitions of test.
  abstract int test(C container, TestParam tp);
} ///:~
