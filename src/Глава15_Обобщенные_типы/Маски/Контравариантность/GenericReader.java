package Глава15_Обобщенные_типы.Маски.Контравариантность;

import Глава15_Обобщенные_типы.Маски.Apple;
import Глава15_Обобщенные_типы.Маски.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericReader {

    static <T> T readExtract(List<T> list){
        return list.get(0);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1(){
        Apple a = readExtract(apples);
        Fruit f = readExtract(fruits);
        f = readExtract(apples);
    }

    static class Reader<T>{
        T readExtract(List<T> list){
            return list.get(0);
        }
    }

    static void f2(){
        Reader <Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExtract(fruits);
    }

    static class CovariantReader <T>{
        T readCovariant(List<? extends T> list){
            return list.get(0);
        }
    }

    static void  f3(){
        CovariantReader<Fruit>fruitReader = new CovariantReader<Fruit>();
        Fruit f = fruitReader.readCovariant(fruits);
        Fruit a = fruitReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f1();f2();f3();
    }
}
