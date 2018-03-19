package Глава15_Обобщенные_типы.Проблемы.Примитивы_не_могут_использоватся_как_параметрыТипы;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {
    Byte[] possibles = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
}
