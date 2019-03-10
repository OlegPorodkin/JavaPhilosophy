package Глава18_Система_ввода_вывода_Java.чтение_из_памяти;

import Глава18_Система_ввода_вывода_Java.буризирование_чтение.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
  public static void main(String[] args) throws IOException {
    StringReader in = new StringReader(BufferedInputFile.read("D:\\GoogleGDisk\\JavaProject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\чтение_из_памяти\\MemoryInput.java"));
    int c;
    while((c = in.read()) != -1)
      System.out.print((char)c);
  }
}
