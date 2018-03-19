package Глава2_Все_Является_Объектом.JavaHome;

public class Incrementable {
    static void increment(){
        StaticTest.i++;
    }
}

class StaticTest{
    static int i = 0;
}

class Test2{
    public static void main(String[] args) {
        StaticTest a = new StaticTest();
        StaticTest b = new StaticTest();
        Incrementable i = new Incrementable();

        System.out.println(a.i);
        i.increment();
        i.increment();
        i.increment();
        System.out.println(b.i);
    }

}
