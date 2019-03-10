package Глава18_Система_ввода_вывода_Java.формитирование_чтение_из_памяти;

import Глава18_Система_ввода_вывода_Java.буризирование_чтение.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("D:\\GoogleGDisk\\JavaProject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\формитирование_чтение_из_памяти\\FormattedMemoryInput.java").getBytes()));
            while (true)
                System.out.print((char) in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
