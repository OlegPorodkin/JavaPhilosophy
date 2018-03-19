package Глава15_Обобщенные_типы.Построение_сложных_моделей;

import Глава15_Обобщенные_типы.Обобщенные_интерфейсы.Generator;
import Глава15_Обобщенные_типы.Обобщенные_методы.Обобщеный_метод_для_для_работы_с_генераторам.Generators;

import java.util.ArrayList;
import java.util.Random;

class Product {

    public static Generator<Product> generator = new Generator<Product>() {

        private Random random = new Random(47);

        @Override
        public Product next() {
            return new Product(random.nextInt(1000), "Test",
                    Math.round(random.nextDouble() * 1000) + 0.99);
        }
    };

    private final long id;
    private String description;
    private double price;

    public Product(long IDnumber, String description, double price) {
        this.id = IDnumber;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: " + price;
    }

    public void priceChange(double change) {
        price += change;
    }
}

class Shelf extends ArrayList<Product> {
    public Shelf(int nProduct) {
        Generators.fill(this, Product.generator, nProduct);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelfs, int nProduct) {
        for (int i = 0; i < nShelfs; i++) {
            add(new Shelf(nProduct));
        }
    }
}

class CheckoutStend{}
class Office{}

public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStend> checkouts = new ArrayList<CheckoutStend>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProduct){
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProduct));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Aisle a: this){
            for(Shelf s : a){
                for (Product p : s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
