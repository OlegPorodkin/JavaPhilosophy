package Глава18_Система_ввода_вывода_Java.Вспомогательные_средства_для_работы_с_каталогами;

import java.util.Collection;

public class PPrint {
    public static String pformat(Collection<?> c){
        if (c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c) {
            if (c.size() != 1)
                result.append("\n ");
            result.append(elem);
        }
        if (c.size() != 1)
            result.append("\n ");
        result.append("]");
        return result.toString();
    }
}
