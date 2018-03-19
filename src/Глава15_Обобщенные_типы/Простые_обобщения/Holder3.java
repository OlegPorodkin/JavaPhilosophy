package Глава15_Обобщенные_типы.Простые_обобщения;

class Avtomobile{}

public class Holder3<T> {

    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Avtomobile> h3 = new Holder3<Avtomobile>(new Avtomobile());

        Avtomobile a = h3.get();
    }
}
