package Глава15_Обобщенные_типы.Самоограничиваемые_типы.Ковариантность_аргументов;

class Base{}
class Derived extends Base{}

interface OrdinaryGetter{
    Base get();
}

interface DerivedGetter extends OrdinaryGetter{
    Derived get();
}

public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived d2 = d.get();
    }
}
