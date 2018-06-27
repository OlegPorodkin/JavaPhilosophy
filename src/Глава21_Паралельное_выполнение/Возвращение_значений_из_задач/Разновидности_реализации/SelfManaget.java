package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.Разновидности_реализации;

public class SelfManaget implements Runnable {
    private int countDown = 5;
    private Thread t = new Thread(this);
    public SelfManaget() {t.start();}

    @Override
    public String toString() {
        return Thread.currentThread().getName()+"("+countDown+"), ";
    }

    @Override
    public void run() {
        System.out.println(this);
        if (--countDown == 0)return;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SelfManaget();
        }
    }
}
