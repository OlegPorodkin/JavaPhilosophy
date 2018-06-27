package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Некоррекный_доступ_к_ресурсам;

public class EventGenerator extends IntGenerator {
    private int currentEventValue = 0;
    @Override
    public int next() {
        ++currentEventValue;
        ++currentEventValue;
        return currentEventValue;
    }

    public static void main(String[] args) {
        EventChecker.test(new EventGenerator());
    }
}
