package com.company;

public class Main {

    public static void main(String[] args) {

	    ShapeProcessorModel shapeProcessorModel = new ShapeProcessorModel();
	    ShapeProcessorView shapeProcessorView = new ShapeProcessorView();
	    ShapeProcessorController shapeProcessorController = new ShapeProcessorController(shapeProcessorModel, shapeProcessorView);

        shapeProcessorController.processShapes();
    }
}
