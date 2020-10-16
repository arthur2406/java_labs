package com.company;

public class Circle extends Shape {

    private Double radius;

    Circle(String shapeColor, Double radius) {
        super(shapeColor);

        this.radius = radius;

        this.calcArea();
    }


    public void calcArea () {
        this.calculatedArea = Math.PI * this.radius * this.radius;
    }


    @Override
    public String toString() {
        return "A circle with radius of " + this.radius;
    }

}
