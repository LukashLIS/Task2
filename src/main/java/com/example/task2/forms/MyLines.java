package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLines extends MyShape {
    double length1;
    double length2;
    public MyLines(Color color){
        super(color);
        this.length1=100;
        this.length2=100;
    }
    public MyLines(Color color, double length, double width){
        super(color);
        this.length1=length;
        this.length2=width;
    }
    @Override
    double area()
    {
        return length1*length2;
    }

    @Override
    public void draw(GraphicsContext gr) {

    }

    @Override
    public String toString()
    {
        return "";
    }
}
