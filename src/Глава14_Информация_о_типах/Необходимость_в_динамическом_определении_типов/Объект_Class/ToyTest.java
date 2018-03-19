package Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Объект_Class;

interface HasBatteries{}
interface WaterProof{}
interface Shoots{}
interface Alive{}

class Toy {
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots, Alive{
    FancyToy(){super(1);}
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Имя класа: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноничное имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try{
            c = Class.forName("Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов.Объект_Class.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Не удалось найти FancyToy");
            System.exit(1);
        }

        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try{
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Не удалось создать экземпляр");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());

    }
}
