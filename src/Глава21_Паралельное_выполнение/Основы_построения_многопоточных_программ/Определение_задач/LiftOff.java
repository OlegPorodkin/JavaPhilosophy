package Глава21_Паралельное_выполнение.Основы_построения_многопоточных_программ.Определение_задач;

public class LiftOff implements Runnable{
    protected  int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Lift_off!")+"),";
    }
    @Override
    public void run() {
        while (countDown-->0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
