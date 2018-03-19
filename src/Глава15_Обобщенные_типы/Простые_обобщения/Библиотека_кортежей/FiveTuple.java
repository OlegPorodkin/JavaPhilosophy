package Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E fifht;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifht = e;
    }

    @Override
    public String toString() {
        return "(" + first + " " + second + " " + third + " " + fourth + " " + fifht + ")";
    }
}
