package Глава15_Обобщенные_типы.Обобщенные_методы.Герератор_общего_назначения;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;

public class BasicGenerator <T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
