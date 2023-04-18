package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyPentagon extends MyShape {
    double length;
    public MyPentagon(Color color){
        super(color);
        this.length=100;
    }
    public MyPentagon(Color color, double length){
        super(color);
        this.length=length;
    }
    @Override
    double area()
    {
        return length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        double[] x;
        double[] y;
        x = new double[]{length/2, length/2*2, length/2*3, length/2*2.5, length/2*1.5};
        y = new double[]{length/2, length/4, length/2, length/1.5, length/1.5};
        gr.strokePolygon(x,y,5);
        gr.setFill(color);
        gr.fillPolygon(x,y,5);

    }

    @Override
    public String toString()
    {
        return "";
    }
}
