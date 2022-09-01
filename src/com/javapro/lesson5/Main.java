package com.javapro.lesson5;

import com.javapro.lesson5.model.Circle;
import com.javapro.lesson5.model.Square;
import com.javapro.lesson5.model.Triangle;
import com.javapro.lesson5.api.Figureanable;

public class Main {

    private static Figureanable[] array = null;

    public static void main(String[] args) {
        sumTotalArea();
        Figureanable triangle = new Triangle(2, 2, 2);
    }

    private static void createFigure() {

        array = new Figureanable[]{
                new Circle(5),
                new Square(2),
                new Triangle(2, 2, 2),
        };
    }

    private static void sumTotalArea() {
        createFigure();
        double totalSum = 0;
        for (Figureanable figure : array) {
            totalSum += figure.getArea();
            System.out.printf("%.2f\n", figure.getArea());
        }
        System.out.printf("Total sum all's figure: %.2f \n", totalSum);
    }
}



