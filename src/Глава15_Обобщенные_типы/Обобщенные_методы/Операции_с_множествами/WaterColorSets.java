package Глава15_Обобщенные_типы.Обобщенные_методы.Операции_с_множествами;

import java.util.EnumSet;
import java.util.Set;

import static Глава15_Обобщенные_типы.Обобщенные_методы.Операции_с_множествами.Sets.*;
import static Глава15_Обобщенные_типы.Обобщенные_методы.Операции_с_множествами.WaterColors.*;


public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("Set 1:" + set1);
        System.out.println("Set 2:" + set2);
        System.out.println("union(set1,set2): " + union(set1,set2));

        Set<WaterColors> subSet = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subSet);

        System.out.println("difference(set1, subSet): " + difference(set1, subSet));
        System.out.println("difference(set2, subSet): " + difference(set2, subSet));
        System.out.println("complement(set1, set2): " + complement(set1, set2));


    }
}
