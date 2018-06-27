package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.TimeUnit;

class Deamon implements Runnable{
    private Thread[] t = new Thread[10];
    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DeamonSpawn());
            t[i].start();
            System.out.println("DeamonSpawn " + i + " started, ");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "].isDeamon() = " + t[i].isDaemon() + ", ");
        }
        while (true)Thread.yield();
    }
}

class DeamonSpawn implements Runnable{

    @Override
    public void run() {
        while (true)Thread.yield();
    }
}

public class Deamons {
    public static void main(String[] args) throws Exception{
        Thread d = new Thread(new Deamon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");
        TimeUnit.SECONDS.sleep(1);
    }
}
