package Глава15_Обобщенные_типы.Обобщенные_методы.Обобщеный_метод_для_для_работы_с_генераторам;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Coffee;
import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.CoffeeGenerator;
import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Fibonacci;
import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c :coffees) {
            System.out.println(c);
        }
        Collection<Integer> fnumber = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (int i : fnumber) {
            System.out.print(i + ", ");
        }
    }
}
