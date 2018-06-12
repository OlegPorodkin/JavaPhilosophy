package Глава15_Обобщенные_типы.Исключения.Использование_патерна_декоратор;

import java.util.Date;

class Basic {
    private String value;

    public String get() {
        return value;
    }

    public void set(String value) {
        this.value = value;
    }
}

class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    public String get() {
        return basic.get();
    }

    public void set(String val) {
        basic.set(val);
    }
}

class TimeStamped extends Decorator {
    private final long timeStamp;

    public TimeStamped(Basic basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

class SerialNumber extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumber(Basic basic) {
        super(basic);
    }
    public long getSerialNumber(){
        return serialNumber;
    }
}

public class Decartion {
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(
                new SerialNumber(new Basic())
        );
        SerialNumber s = new SerialNumber(new Basic());
        SerialNumber s2 = new SerialNumber(
                new TimeStamped(new Basic())
        );

    }
}
