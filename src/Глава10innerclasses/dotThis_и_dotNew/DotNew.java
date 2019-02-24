//: innerclasses/DotNew.java
package Глава10innerclasses.dotThis_и_dotNew; /* Added by Eclipse.py */
// Creating an inner class directly using the .new syntax.

public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    Inner dni = dn.new Inner();
  }
} ///:~
