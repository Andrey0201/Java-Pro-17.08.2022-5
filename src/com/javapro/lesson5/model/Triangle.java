package com.javapro.lesson5.model;

import com.javapro.lesson5.api.Figureanable;

  /**
   * Сосдает треугольник у которого есть три сторони
   * */
public class Triangle implements Figureanable {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double area = (((a + b + c) / 2) * ((a + b + c) / 2 - a) *
                ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        return Math.sqrt(area);
    }
}
