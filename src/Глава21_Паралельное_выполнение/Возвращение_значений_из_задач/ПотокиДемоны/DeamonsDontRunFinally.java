package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.TimeUnit;

public class DeamonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
        t.setDaemon(true);
        t.start();
    }
}

class ADeamon implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Starting ADeamon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("This should always run?");
        }
    }
}
