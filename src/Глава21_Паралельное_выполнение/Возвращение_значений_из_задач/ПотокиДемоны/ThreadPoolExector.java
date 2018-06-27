package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.ПотокиДемоны;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExector extends ThreadPoolExecutor {

    public ThreadPoolExector() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DeamonThreadFactory());
    }
}
