package Глава12_Обработка_ошибок_и_исключения;

public class OnOffSwitch {
  private static Switch sw = new Switch();
  public static void f() {}
  public static void main(String[] args) {
    sw.on();
    // Code that can throw exceptions...
    f();
    sw.off();
  }
}
