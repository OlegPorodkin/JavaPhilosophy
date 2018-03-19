package Глава15_Обобщенные_типы.Самоограничиваемые_типы.Самоограничение;

import Глава15_Обобщенные_типы.Самоограничиваемые_типы.Необычные_рекурсивные_обощения.BasicHolder;

class Other{}
class BasicOther extends BasicHolder<Other>{

}

public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b1 = new BasicOther(), b2 = new BasicOther();
        b1.set(new Other());
        Other other = b1.get();
        b1.f();
    }
}
