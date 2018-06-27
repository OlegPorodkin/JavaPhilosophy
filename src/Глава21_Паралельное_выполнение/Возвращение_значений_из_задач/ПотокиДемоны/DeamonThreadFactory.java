package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.ThreadFactory;

public class DeamonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread();
        t.setDaemon(true);
        return t;
    }
}
