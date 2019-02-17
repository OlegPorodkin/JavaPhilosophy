package Глава11_Колекции_объектов.Generics_and_typesafe_containers;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}
