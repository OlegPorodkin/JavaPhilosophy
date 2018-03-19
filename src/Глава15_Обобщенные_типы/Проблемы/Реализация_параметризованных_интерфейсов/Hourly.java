package Глава15_Обобщенные_типы.Проблемы.Реализация_параметризованных_интерфейсов;

interface Payable<T>{}

class Employee implements Payable<Employee>{}

//public class Hourly extends Employee implements Payable<Hourly> {
//}
