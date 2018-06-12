package Глава15_Обобщенные_типы.Исключения.Примеси_с_использованием_интерфейсов;

import java.util.*;

interface TimeStamped{long getStamp();}

class TimeStampetImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampetImp() {
        this.timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered{ long getSerialNumber();}

class SerialNumberImp implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter ++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
    void set(String val);
    String get();
}

class BasicImp implements Basic{
    private String value;

    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
    private TimeStamped timeStamped = new TimeStampetImp();
    private SerialNumbered serialNumber = new SerialNumberImp();

    @Override
    public long getStamp() {
        return timeStamped.getStamp();
    }

    @Override
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp()+" "+mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp()+" "+mixin2.getSerialNumber());
    }
}
