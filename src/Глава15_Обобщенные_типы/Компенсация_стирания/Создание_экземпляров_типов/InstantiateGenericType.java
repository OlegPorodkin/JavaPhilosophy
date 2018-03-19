package Глава15_Обобщенные_типы.Компенсация_стирания.Создание_экземпляров_типов;

class ClassAsFactory<T>{
    T x;

    public ClassAsFactory(Class<T> kind) {
        try{
            x = kind.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class Employee{}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fl = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try{
            ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        }catch (Exception e){
            System.out.println("ClassAsFactory<Employee> failed");
        }
    }
}
