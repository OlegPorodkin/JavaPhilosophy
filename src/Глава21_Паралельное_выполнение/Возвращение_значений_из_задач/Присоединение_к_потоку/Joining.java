package Глава21_Паралельное_выполнение.Возвращение_значений_из_задач.Присоединение_к_потоку;

class Sleaper extends Thread{
    private int duration;
    public Sleaper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + "has awakened");
    }
}

class Joiner extends Thread{
    private Sleaper sleaper;
    public Joiner(String name, Sleaper sleaper){
        super(name);
        this.sleaper = sleaper;
        start();
    }

    @Override
    public synchronized void start() {
        try {
            sleaper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + "join compete.");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleaper sleepy = new Sleaper("Sleepy", 1500),
                grumpy = new Sleaper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleepy),
                doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
