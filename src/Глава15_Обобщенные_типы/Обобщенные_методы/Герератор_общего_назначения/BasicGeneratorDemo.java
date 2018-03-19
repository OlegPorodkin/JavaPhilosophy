package Глава15_Обобщенные_типы.Обобщенные_методы.Герератор_общего_назначения;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen1 = BasicGenerator.create(CountedObject.class);
        Generator<CountedObject> gen2 = new  BasicGenerator(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(gen2.next());
        }
    }
}
