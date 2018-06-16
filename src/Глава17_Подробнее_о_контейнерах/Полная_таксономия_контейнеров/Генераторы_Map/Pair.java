package Глава17_Подробнее_о_контейнерах.Полная_таксономия_контейнеров.Генераторы_Map;

public class Pair<K,V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
