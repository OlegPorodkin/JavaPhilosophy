package Глава15_Обобщенные_типы.Самоограничиваемые_типы.Необычные_рекурсивные_обощения;

public class BasicHolder<T> {
    T element;
    public void set(T arg){ element = arg;}
    public T get(){return element;}
    public void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
