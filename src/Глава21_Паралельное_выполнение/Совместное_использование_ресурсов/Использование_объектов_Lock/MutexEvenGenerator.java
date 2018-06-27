package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Использование_объектов_Lock;

import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.EventChecker;
import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.IntGenerator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EventChecker.test(new MutexEvenGenerator());
    }
}
