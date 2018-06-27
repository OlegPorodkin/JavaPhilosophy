package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Атомарные_классы;

import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.EventChecker;
import Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);
    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EventChecker.test(new AtomicEvenGenerator());
    }
}
