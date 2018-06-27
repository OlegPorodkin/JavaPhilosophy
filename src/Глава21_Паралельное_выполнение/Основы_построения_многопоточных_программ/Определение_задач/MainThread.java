package Глава21_Паралельное_выполнение.Основы_построения_многопоточных_программ.Определение_задач;

public class MainThread {
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
