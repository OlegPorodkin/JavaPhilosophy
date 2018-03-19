package Глава15_Обобщенные_типы.Маски.На_сколько_умен_компилятор;

import Глава15_Обобщенные_типы.Маски.*;
import java.util.*;




public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
