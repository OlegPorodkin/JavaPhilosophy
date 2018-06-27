package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Синхронизация_по_другим_объектам;

public class DualSynch {
    private final Object syncObj = new Object();
    public synchronized void f(){
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }
    public void g(){
        synchronized (syncObj){
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}

class SyncObject{
    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        new Thread(ds::f).start();
        ds.g();
    }
}