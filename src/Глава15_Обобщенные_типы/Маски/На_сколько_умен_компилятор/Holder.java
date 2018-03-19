package Глава15_Обобщенные_типы.Маски.На_сколько_умен_компилятор;

import Глава15_Обобщенные_типы.Маски.Apple;
import Глава15_Обобщенные_типы.Маски.Fruit;
import Глава15_Обобщенные_типы.Маски.Orange;

public class Holder<T> {
    private T value;

    public Holder(){}
    public Holder(T value) {
        this.value = value;
    }

    public void set (T val){value = val;}
    public T get(){return value;}

    public boolean equals (Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
//        Holder<Fruit> fruit = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple)fruit.get();
        try{
            Orange c = (Orange)fruit.get();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(fruit.equals(d));
    }
}
