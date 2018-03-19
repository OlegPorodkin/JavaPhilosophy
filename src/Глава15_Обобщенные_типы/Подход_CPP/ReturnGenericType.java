package Глава15_Обобщенные_типы.Подход_CPP;

public class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T obj) {
        this.obj = obj;
    }

    public T get (){return obj;}
}
