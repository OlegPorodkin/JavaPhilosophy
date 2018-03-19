package Глава15_Обобщенные_типы.Построение_сложных_моделей;

import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.Amphibian;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.FourTuple;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.TupleTest;
import Глава15_Обобщенные_типы.Простые_обобщения.Библиотека_кортежей.Vehicle;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {

    public static void main(String[] args) {

        TupleList<Vehicle, Amphibian, String, Integer> tl =
                new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());

        for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl) {
            System.out.println(i);
        }
    }
}
