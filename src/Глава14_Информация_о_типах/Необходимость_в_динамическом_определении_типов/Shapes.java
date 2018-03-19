package Глава14_Информация_о_типах.Необходимость_в_динамическом_определении_типов;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{

    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        for (Shape shape: shapeList) {
            shape.draw();
        }
    }
}
