package Глава15_Обобщенные_типы.Обобщенные_методы.Упращение_использоване_кортежей;

import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.FiveTuple;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.FourTuple;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.ThreeTuple;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.TwoTuple;

public class Tuple {

    public static <A, B>TwoTuple<A, B> tuple(A a, B b){
        return new TwoTuple<A, B>(a, b);
    }

    public static <A, B, C>ThreeTuple<A, B, C> tuple(A a, B b, C c){
        return new ThreeTuple<A, B, C>(a, b, c);
    }

    public static <A, B, C, D>FourTuple<A, B, C, D> tuple(A a, B b, C c, D d){
        return new FourTuple<A, B, C, D>(a, b, c, d);
    }

    public static <A, B, C, D, E>FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e){
        return new FiveTuple(a, b, c, d, e);
    }
}
