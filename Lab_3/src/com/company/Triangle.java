package com.company;

public class Triangle extends Shape {

    private final Double baseSide;


    private final Double heightToBaseSide;


    Triangle(String shapeColor, Double baseSide, Double heightToBaseSide) {
        super(shapeColor);

        this.baseSide = baseSide;
        this.heightToBaseSide = heightToBaseSide;

        this.calcArea();
    }


    public void calcArea () {
        this.calculatedArea = this.baseSide * this.heightToBaseSide / 2;
    }


    @Override
    public String toString() {
        return "A triangle with base side of " + this.baseSide + ", and height to base side of " + this.heightToBaseSide;
    }

}
