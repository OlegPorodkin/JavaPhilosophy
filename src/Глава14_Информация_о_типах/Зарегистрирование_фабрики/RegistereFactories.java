package Глава14_Информация_о_типах.Зарегистрирование_фабрики;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//class Part{
//    @Override
//    public String toString() {
//        return getClass().getSimpleName();
//    }
//
//    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
//
//    static {
//        partFactories.add(new FuelFilter().Factory());
//    }
//
//    private static Random random = new Random(47);
//    public static Part createRandom (){
//        int n = random.nextInt(partFactories.size());
//        return partFactories.get(n).create();
//    }
//}
//
//class Filter extends Part{}
//
//class FuelFilter extends Filter{
//
//}
//
//public class RegisteredFactories {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Part.createRandom());
//        }
//    }
//}
