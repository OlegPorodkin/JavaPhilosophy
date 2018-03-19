package Глава2_Все_Является_Объектом.JavaHome;

public class TestClass {
    int i;
    char j;
    public void printInt(){
        System.out.println(i);
    }
    public void printChar(){
        System.out.println(j);
    }
}

class Test{
    public static void main(String[] args) {
        TestClass a = new TestClass();
        a.printInt();
        a.printChar();
    }
}