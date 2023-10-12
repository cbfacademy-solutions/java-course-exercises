package com.cbfacademy.shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {
        List<Enclosure> shapes = new ArrayList<>();
        shapes.add(new Square(20.0));
        shapes.add(new Square(4.0));
        shapes.add(new Square(12.0));
        shapes.add(new Circle(15.0));
        shapes.add(new Circle(10.0));
        shapes.add(new Circle(5.0));

        for (Enclosure shape : shapes) {
            if (shape instanceof Square) {
                double area = shape.area();
                double perimeter = shape.perimeter();
                System.out.printf("Square Area: %.2f\n", area);
                System.out.printf("Square Perimeter: %.2f\n", perimeter);
            } else if (shape instanceof Circle) {
                double area = shape.area();
                double perimeter = shape.perimeter();
                System.out.printf("Circle Area: %.3f\n", area);
                System.out.printf("Circle Perimeter: %.3f\n", perimeter);
            }

            System.out.println();
        }
    }
}
