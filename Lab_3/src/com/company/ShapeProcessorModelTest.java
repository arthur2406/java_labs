package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeProcessorModelTest {

    @Test
    public void calcTotalSquareAllShapes() {
        ShapeProcessorModel model = new ShapeProcessorModel();
        model.setShapes(FixtureGenerator.getShapes());

        Double resultArea = 0.;

        for (Shape shape: model.getShapes()) {
            resultArea += shape.getCalculatedArea();
        }

        model.calcTotalSquareAllShapes();

        Assert.assertEquals(resultArea, model.getTotalSquareAllShapes());


    }

    @Test
    public void calcTotalSquareTypeSpecific() {

        ShapeProcessorModel model = new ShapeProcessorModel();
        model.setShapes(FixtureGenerator.getShapes());

        Double resultArea = 0.;

        model.calcTotalSquareTypeSpecific(1);

        for (Shape shape: model.getShapes()) {
            if (shape instanceof Triangle) {
                resultArea += shape.getCalculatedArea();
            }
        }

        model.calcTotalSquareTypeSpecific(1);

        Assert.assertEquals(resultArea, model.getTotalSquareTypeSpecific());
    }

    @Test
    public void sortShapesByAreasAsc() {
        ShapeProcessorModel model = new ShapeProcessorModel();
        model.setShapes(FixtureGenerator.getShapes());

        model.sortShapesByAreasAsc();

        Assert.assertTrue(model.getShapes()[0].getCalculatedArea() < 55);
        Assert.assertTrue(model.getShapes()[model.getShapes().length - 1].getCalculatedArea() > 5900);

    }

    @Test
    public void sortShapesByColor() {
        ShapeProcessorModel model = new ShapeProcessorModel();
        model.setShapes(FixtureGenerator.getShapes());

        model.sortShapesByColor();
        Assert.assertEquals(model.getShapes()[0].shapeColor, "black");
        Assert.assertEquals(model.getShapes()[model.getShapes().length - 1].shapeColor, "yellow");
    }
}