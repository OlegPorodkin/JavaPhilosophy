package Глава21_Паралельное_выполнение.Совместное_использование_ресурсов.Атомарность_и_видимость_изменений;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static synchronized int nextSerialNumber(){
        return serialNumber;
    }
}
