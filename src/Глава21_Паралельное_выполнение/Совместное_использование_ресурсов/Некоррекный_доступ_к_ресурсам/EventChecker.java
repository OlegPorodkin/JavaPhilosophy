package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventChecker implements Runnable {
    private IntGenerator generator;
    private final int id;
    public EventChecker(IntGenerator g, int ident){
        generator = g;
        id = ident;
    }
    @Override
    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            if(val % 2 != 0){
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Ctrl+C to Exit");

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) exec.execute(new EventChecker(gp, i));
        exec.shutdown();
    }
    public static void test(IntGenerator gp){
        test(gp, 10);
    }
}
