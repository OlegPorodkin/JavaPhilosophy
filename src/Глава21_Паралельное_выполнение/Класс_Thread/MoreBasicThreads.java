package Глава21_Паралельное_выполнение.Класс_Thread;

import Глава21_Паралельное_выполнение.Основы_построения_многопоточных_программ.Определение_задач.LiftOff;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff!");
        }
    }
}
