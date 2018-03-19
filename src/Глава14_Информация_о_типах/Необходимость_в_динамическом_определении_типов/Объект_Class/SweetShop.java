package Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Объект_Class;

class Candy{
    static {
        System.out.println("Загрука класса Candy");
    }
}

class Gum {
    static {
        System.out.println("Загрука класса Gum");
    }
}

class Cookie {
    static {
        System.out.println("Загрука класса Cookie");
    }
}

public class SweetShop {

    public static void main(String[] args) {
        System.out.println("В методе майн!");
        new Candy();
        System.out.println("После создание объекта Candy");
        try{
            Class.forName("Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Объект_Class.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Не удалось найти Gum");
        }
        System.out.println("После вызова метода Class.forName(\"Gum\");");
        new Cookie();
        System.out.println("После создание объекта Cookie");

    }
}
