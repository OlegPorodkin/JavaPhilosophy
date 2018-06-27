package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.Чуткие_пользвательские_интерфейсы;

class UnresponsiveUI{
    private volatile double d = 1;
    public UnresponsiveUI()throws Exception{
        while (d > 0 )d = d + (Math.PI + Math.E) / d;
        System.in.read();
    }

}

public class ResponsiveUI extends Thread {
    private static volatile double d = 1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public synchronized void start() {
        while (true)d = d + (Math.PI + Math.E) / d;
    }

    public static void main(String[] args)throws Exception {
        //! new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
