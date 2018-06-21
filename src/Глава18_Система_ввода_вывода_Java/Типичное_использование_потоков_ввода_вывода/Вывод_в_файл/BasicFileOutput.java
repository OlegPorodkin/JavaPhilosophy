package Глава18_Система_ввода_вывода_Java.Типичное_использование_потоков_ввода_вывода.Вывод_в_файл;

import Глава18_Система_ввода_вывода_Java.Типичное_использование_потоков_ввода_вывода.Буферизированое_чтение_из_файла.BufferedInputFile;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args)throws Exception {
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("D:\\GoogleGDisk\\JavaProdject\\Java Philosophy\\src\\Глава18_Система_ввода_вывода_Java\\Типичное_использование_потоков_ввода_вывода\\Вывод_в_файл\\BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) out.println(lineCount++ + ": " + s);
        out.close();
    }
}
