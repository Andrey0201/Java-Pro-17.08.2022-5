package com.javapro.lesson5.model;

import com.javapro.lesson5.service.Figureanable;

public class Circle implements Figureanable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
