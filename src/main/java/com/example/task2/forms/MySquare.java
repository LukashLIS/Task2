package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends MyShape {
    double length;
    public MySquare(Color color){
        super(color);
        this.length=100;
    }
    public MySquare(Color color, double length){
        super(color);
        this.length=length;
    }
    @Override
    double area()
    {
        return length*length;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.strokeRect(1,1,length,length);
        gr.setFill(color);
        gr.fillRect(1,1,length,length);
    }

    @Override
    public String toString()
    {
        return "";
    }
}
