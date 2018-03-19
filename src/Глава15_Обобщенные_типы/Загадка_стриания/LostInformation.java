package Глава15_Обобщенные_типы.Загадка_стриания;

import java.util.*;

class Frob{}
class Fronkle{}
class Quark<Q>{}
class Practicle<POSITION, MOMENTUM>{}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fronkle> map = new HashMap<Frob, Fronkle>();
        Quark<Fronkle> quark = new Quark<Fronkle>();
        Practicle<Long, Double> practicle = new Practicle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(practicle.getClass().getTypeParameters()));
    }
}
