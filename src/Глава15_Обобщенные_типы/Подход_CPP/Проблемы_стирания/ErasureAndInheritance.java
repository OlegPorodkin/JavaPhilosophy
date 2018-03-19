package Глава15_Обобщенные_типы.Подход_CPP.Проблемы_стирания;

class GenericBase<T> {

    private T element;

    public void set(T arg) {
        arg = element;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T>{}

class Derived2 extends GenericBase{}

//class Derived3 extends GenericBase<?>{}

public class ErasureAndInheritance {

    @SuppressWarnings("uncecked")
    public static void main(String[] args) {
        Derived2 d2= new Derived2();
        Object ob = d2.get();
        d2.set(ob);//Предупреждение
    }
}
