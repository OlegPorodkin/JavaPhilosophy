package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Использование_объектов_Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Attemptlocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();
        try{
            System.out.println("tryLock(): " + captured);
        }finally {
            if(captured)lock.unlock();
        }
    }
    public void timed(){
        boolean captured = false;
        try{
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("tryLock(2, TimeUnit.MILLISECONDS): " + captured);
        }finally {
            if(captured)lock.unlock();
        }
    }

    public static void main(String[] args) {
        final Attemptlocking al = new Attemptlocking();
        al.untimed();
        al.timed();
        new Thread(){
            {setDaemon(true);}

            @Override
            public void run() {
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
