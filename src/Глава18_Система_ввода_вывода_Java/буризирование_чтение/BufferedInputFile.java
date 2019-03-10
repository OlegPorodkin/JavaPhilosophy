package Глава18_Система_ввода_вывода_Java.буризирование_чтение;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    // Throw exceptions to console:
    public static String read(String filename) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(filename));

        String s;

        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null) sb.append(s + "\n");

        in.close();

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(read("D:\\GoogleGDisk\\JavaProject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\буризирование_чтение\\BufferedInputFile.java"));
    }
}
