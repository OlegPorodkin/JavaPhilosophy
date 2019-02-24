package Глава10innerclasses.анонимные_внутренние_классы;

import Глава10innerclasses.внуренние_классы_и_восходящее_преобразование.Contents;

public class Parcel7 {
    public Contents contents() {
        return new Contents() { // Insert a class definition
            private int i = 11;

            public int value() {
                return i;
            }
        }; // Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
} ///:~
