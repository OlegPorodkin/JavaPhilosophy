package Глава18_Система_ввода_вывода_Java.формитирование_чтение_из_памяти;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\GoogleGDisk\\JavaProject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\формитирование_чтение_из_памяти\\TestEOF.java")));

        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}
