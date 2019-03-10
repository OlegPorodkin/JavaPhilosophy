package Глава12_Обработка_ошибок_и_исключения;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() {
    }

    public void event() {
        // Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning() {
    }

    public StormyInning(String s) {
    }

    // Regular methods must conform to base class:
//! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() {
    }

    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    public void atBat() {
    }

    public static void main(String[] args) {
        StormyInning si = new StormyInning();
        si.atBat();
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
} ///:~
