package Глава15_Обобщенные_типы.Проблемы.Приведения_типа_и_предупреждения;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class NeedCasting {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
//        List<Widget> shapes = (List<Widget>) in.readObject();
    }
}