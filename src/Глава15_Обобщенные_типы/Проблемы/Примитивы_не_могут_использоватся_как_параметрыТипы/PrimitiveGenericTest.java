package Глава15_Обобщенные_типы.Проблемы.Примитивы_не_могут_использоватся_как_параметрыТипы;

class FArray{
    public static <T> T[] fill(T[] a/*, Generator<T> gen*/){
        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.next();
        }
        return a;
    }
}

public class PrimitiveGenericTest {
    public static void main(String[] args) {
        String [] strings= FArray.fill(new String[10]/*, new RandomGenerator.String(10)*/);
        for (String s : strings) {
            System.out.println(s);
        }
        Integer[] integers = FArray.fill(new Integer[7]/*, new RandomGenerator.Integer()*/);
        for (int i:integers) {
            System.out.println(i);
        }
    }
}
