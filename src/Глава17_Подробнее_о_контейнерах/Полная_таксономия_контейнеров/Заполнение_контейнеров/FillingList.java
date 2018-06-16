package Глава17_Подробнее_о_контейнерах.Полная_таксономия_контейнеров.Заполнение_контейнеров;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAdress{
    private String s;
    public StringAdress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingList {
    public static void main(String[] args) {
        List<StringAdress> list = new ArrayList<StringAdress>(
                Collections.nCopies(4, new StringAdress("Hello"))
        );
        System.out.println(list);
        Collections.fill(list, new StringAdress("World"));
        System.out.println(list);
    }
}
