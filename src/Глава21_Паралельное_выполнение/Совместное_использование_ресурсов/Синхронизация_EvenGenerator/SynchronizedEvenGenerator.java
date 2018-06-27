package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Синхронизация_EvenGenerator;

import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.EventChecker;
import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.IntGenerator;

public class SynchronizedEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EventChecker.test(new SynchronizedEvenGenerator());
    }
}
