package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends MyShape {
    double length;
    public MyTriangle(Color color){
        super(color);
        this.length=100;
    }
    public MyTriangle(Color color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    double area()
    {
        return length*3;
    }

    @Override
    public void draw(GraphicsContext gr) {
        double[] x;
        double[] y;
        x = new double[]{length/2, length/2*2, length/2*3};
        y = new double[]{length/2, length/4, length/2};
        gr.strokePolygon(x,y,3);
        gr.setFill(color);
        gr.fillPolygon(x,y,3);
    }

    @Override
    public String toString()
    {
        return "";
    }
}
