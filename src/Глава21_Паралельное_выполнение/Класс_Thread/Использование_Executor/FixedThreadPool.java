package Глава21_Паралельное_выполнение.Класс_Thread.Использование_Executor;

import Глава21_Паралельное_выполнение.Основы_построения_многопоточных_программ.Определение_задач.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
