package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Локальная_память_потоков;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Accessor implements Runnable{
    private final int id;
    public Accessor(int id){this.id = id;}
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolder.get();
    }
}

public class ThreadLocalVariableHolder {
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
        private Random rand = new Random(47);
        protected synchronized Integer initValue(){
            return rand.nextInt(10_000);
        }
    };
    public static void increment(){
        value.set(value.get() + 1);
    }
    public static int get(){
        return value.get();
    }

    public static void main(String[] args)throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Accessor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }
}
