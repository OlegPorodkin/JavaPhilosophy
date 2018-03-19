package Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Ссылки_на_обобщенные_классы;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
//        Class<Integer> genericIntClass = int.class; - было
        Class<?> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        genericIntClass = double.class;
    }
}
