package com.javapro.lesson5.model;

import com.javapro.lesson5.api.Figureanable;

public class Square implements Figureanable {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
