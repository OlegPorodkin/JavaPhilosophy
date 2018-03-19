package Глава15_Обобщенные_типы.Обобщенные_интерфейсы;

public class Coffee {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
