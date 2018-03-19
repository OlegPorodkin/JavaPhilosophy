package Глава15_Обобщенные_типы.Подход_CPP;

class Manipulator<T> {

    private T obj;
    public Manipulator(T x){ obj = x;}
    //public void manipulate(){obj.f();} //Ошибка компиляции
}

public class Manipulation{
    public static void main(String[] args) {
        HasF f = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(f);
//        manipulator.manipulate();
    }
}
