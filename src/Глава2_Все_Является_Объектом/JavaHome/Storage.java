package Глава2_Все_Является_Объектом.JavaHome;

public class Storage {
    int storage(String s){
        return s.length() * 2;
    }
}

class Tast{
    Storage s = new Storage();

    public static void main(String[] args) {
        Storage s = new Storage();
        System.out.println(s.storage("Hello World"));
    }
}
