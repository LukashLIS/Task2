package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {
    double length;


    public MyLine(Color color){
        super(color);
        this.length=10;
    }
    public MyLine(Color color, double length, double width){
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
        gr.strokeLine(1,1,1+length,1);

    }

    @Override
    public String toString()
    {
        return "";
    }
}
