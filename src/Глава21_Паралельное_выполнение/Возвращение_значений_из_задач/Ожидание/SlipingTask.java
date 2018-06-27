package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.Ожидание;

import Глава21_Паралельное_выполнение.Основы_построения_многопоточных_программ.Определение_задач.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SlipingTask extends LiftOff {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SlipingTask());
        }
        exec.shutdown();
    }

    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
}
