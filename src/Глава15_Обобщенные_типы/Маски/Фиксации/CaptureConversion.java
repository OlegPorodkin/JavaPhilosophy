package Глава15_Обобщенные_типы.Маски.Фиксации;

import Глава15_Обобщенные_типы.Маски.На_сколько_умен_компилятор.Holder;

public class CaptureConversion {
    static <T> void f1 (Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder holder){
        f1(holder);
    }
    @SuppressWarnings("uncecked")
    public static void main(String[] args) {
        Holder row = new Holder<Integer>(1);
        f1(row);
        f2(row);
        Holder rawBasic = new Holder();
        rawBasic.set(new Object());
        f2(rawBasic);
        Holder<?>wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}
