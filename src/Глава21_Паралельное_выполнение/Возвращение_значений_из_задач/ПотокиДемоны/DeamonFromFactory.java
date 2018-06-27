package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeamonFromFactory implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool(new DeamonThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DeamonFromFactory());
        }
        System.out.println("All demons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
