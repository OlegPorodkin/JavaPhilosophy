package Глава17_Подробнее_о_контейнерах.Полная_таксономия_контейнеров.Решение_с_Generator;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Goverment implements Generator<String> {

    String[] foundation = ("strange woman lying in ponds " +
            "distributing sword is no basis for a system of " +
            "government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData<String>(new Goverment(), 15)
        );
        set.addAll(CollectionData.list(new Goverment(), 15));
        System.out.println(set);
    }
}
