package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape {
    protected Color color;
    protected double x,y;
    abstract double area();
    public abstract void draw(GraphicsContext gr);
    public MyShape(Color color) {
        System.out.println("Shape constructor");
        this.color= color;
    }
    public  void setColor(Color color)
    {
        this.color=color;
    }
}
