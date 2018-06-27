package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
    @Override
    public void run() {
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args)throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamons());
            deamon.setDaemon(true);
            deamon.start();
        }
        System.out.println("All deamons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
