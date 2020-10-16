package com.company;

public class FixtureGenerator {
    public static Shape[] getShapes() {
        return new Shape[]{
                new Circle("green", 5.5),
                new Circle("blue", 6.5),
                new Circle("black", 7.6),
                new Circle("brown", 8.9),
                new Rectangle("violet", 10.5, 12.0),
                new Rectangle("pink", 255.0, 233.0),
                new Rectangle("yellow", 554.4, 44.5),
                new Rectangle("green", 44.1, 2.0),
                new Triangle("black", 15.6, 6.5),
                new Triangle("violet", 123.2, 123.5),
                new Triangle("white", 52.5, 25.5),
        };
    }
}
