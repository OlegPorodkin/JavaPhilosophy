package Глава15_Обобщенные_типы.Компенсация_стирания.Массивы_Обобщений;

import java.util.ArrayList;
import java.util.List;

public class ListOfGeneric<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item){array.add(item);}
    public T get(int index){return array.get(index);}
}
