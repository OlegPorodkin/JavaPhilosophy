package Глава18_Система_ввода_вывода_Java.ввод_в_файл;

import Глава18_Система_ввода_вывода_Java.буризирование_чтение.BufferedInputFile;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("D:\\GoogleGDisk\\JavaProject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\ввод_в_файл\\BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();

        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
