package Глава15_Обобщенные_типы.Маски.Контравариантность;

import Глава15_Обобщенные_типы.Маски.Apple;
import Глава15_Обобщенные_типы.Маски.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();
    static void f1(){writeExact(apples, new Apple());}

    static <T> void writeWithWildcard(List<? super T> list, T item){
        list.add(item);
    }

    static void f2(){
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());

    }

    public static void main(String[] args) { f1(); f2();}

}
