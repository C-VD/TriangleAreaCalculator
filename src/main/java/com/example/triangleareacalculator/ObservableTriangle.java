package com.example.triangleareacalculator;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Button;

public class ObservableTriangle {
    SimpleDoubleProperty a;
    SimpleDoubleProperty b;
    SimpleDoubleProperty c;
    public ObservableTriangle(double a, double b, double c){
        this.a.set(a);
        this.b.set(b);
        this.c.set(c);
    }
}
