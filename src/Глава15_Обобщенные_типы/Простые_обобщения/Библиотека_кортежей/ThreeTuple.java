package Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{

    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b );
        third = c;
    }

    @Override
    public String toString() {
        return "(" + first +" " + second + " " + third + ")";
    }
}
