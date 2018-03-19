package Глава15_Обобщенные_типы.Подход_CPP.Граничные_ситуации;

import java.util.ArrayList;
import java.util.List;

public class FiledListMaker<T> {
    List<T> create(T t, int n){
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FiledListMaker<String> flm = new FiledListMaker<String>();
        List<String> stringList = flm.create("Hello", 5);
        System.out.println(stringList);
    }
}
