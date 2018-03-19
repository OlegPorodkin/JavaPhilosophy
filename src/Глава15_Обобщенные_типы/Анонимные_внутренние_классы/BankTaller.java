package Глава15_Обобщенные_типы.Анонимные_внутренние_классы;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;
import Глава15_Обобщенные_типы.Обобщенные_методы.Обобщеный_метод_для_для_работы_с_генераторам.Generators;

import java.util.*;

class Customer{
    private static long counter = 0;
    private final long id = counter++;

    private Customer(){}

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator(){
        return Customer::new;
    }
}

class Taller{
    private static long counter = 0;
    private final long id = counter++;

    private Taller(){}

    @Override
    public String toString() {
        return "Taller " + id;
    }

    public static Generator<Taller> generator(){
        return Taller::new;
    }
}

public class BankTaller {
    public static void serve(Taller t, Customer c){
        System.out.println(t+" serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Taller> tallers = new ArrayList<Taller>();
        Generators.fill(tallers, Taller.generator(), 4);
        for (Customer c : line) {
            serve(tallers.get(random.nextInt(tallers.size())), c);
        }

    }
}
