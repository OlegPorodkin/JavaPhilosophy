//: interfaces/filters/Filter.java
package Глава9_Интерфейсы.filters;

public class Filter {
  public String name() {
    return getClass().getSimpleName();
  }
  public Waveform process(Waveform input) { return input; }
} ///:~
