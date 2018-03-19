package Глава15_Обобщенные_типы.Подход_CPP;

public class Manipulation3 {
    private HasF obj;

    public Manipulation3(HasF obj) {
        this.obj = obj;
    }

    public void manipulate(){
        obj.f();
    }
}
