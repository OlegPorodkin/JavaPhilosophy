package Глава17_Подробнее_о_контейнерах.Полная_таксономия_контейнеров.Решение_с_Generator;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen, quantity);
    }
}
