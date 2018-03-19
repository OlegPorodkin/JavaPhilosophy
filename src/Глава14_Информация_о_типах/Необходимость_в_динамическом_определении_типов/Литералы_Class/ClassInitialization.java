package Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Литералы_Class;

import java.util.Random;

class Initable {
    static final int staticFinale = 47;
    static final int staticFinale2 = ClassInitialization.random.nextInt(1000);

    static {
        System.out.println("Инициализация Initable");
    }
}

class Initable2 {
    static int staticNotFinal = 147;

    static {
        System.out.println("Инициализация Initable2");
    }
}

class Initable3 {
    static int staticNotFinal = 74;

    static {
        System.out.println("Инициализация Initable3");
    }
}

public class ClassInitialization {
    public static Random random = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("После создания ссылки на Initable");
        System.out.println(Initable.staticFinale);
        System.out.println(Initable.staticFinale2);
        System.out.println(Initable2.staticNotFinal);
        Class initable3 = Class.forName("Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Литералы_Class.Initable3");
        System.out.println("После сохдания ссылки на Initable3");
        System.out.println(Initable3.staticNotFinal);
    }
}
