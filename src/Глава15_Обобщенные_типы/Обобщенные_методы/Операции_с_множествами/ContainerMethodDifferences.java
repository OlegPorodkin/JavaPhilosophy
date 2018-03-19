package Глава15_Обобщенные_типы.Обобщенные_методы.Операции_с_множествами;

import java.lang.reflect.Method;
import java.util.*;

public class ContainerMethodDifferences {

    static Set<String> methodSet(Class<?> type){
        Set<String> result = new TreeSet<String>();
        for (Method m : type.getMethods()) {
            result.add(m.getName());
        }
        return result;
    }

    static void interfases(Class<?> type){
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<String>();
        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);
    static {object.add("clone");}

    static void difference(Class<?> superset, Class<?> subset){
        System.out.print(subset.getSimpleName()+" extend " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfases(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));
        interfases(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, Map.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}
