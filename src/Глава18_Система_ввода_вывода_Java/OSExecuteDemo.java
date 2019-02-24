//: io/OSExecuteDemo.java
package Глава18_Система_ввода_вывода_Java; /* Added by Eclipse.py */
// Demonstrates standard I/O redirection.

import net.mindview.util.OSExecute;

public class OSExecuteDemo {
  public static void main(String[] args) {
    OSExecute.command("javap OSExecuteDemo");
  }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
