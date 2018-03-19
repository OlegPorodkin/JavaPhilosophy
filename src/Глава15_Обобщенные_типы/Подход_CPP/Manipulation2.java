package Глава15_Обобщенные_типы.Подход_CPP;

public class Manipulation2<T extends HasF> {
    private T obj;
    public Manipulation2(T x){obj = x;}
    public void mamipulate(){obj.f();}
}
