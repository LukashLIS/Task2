package com.example.task2.forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class MyRectangle extends MyShape {
    double length;
    double width;


public MyRectangle(Color color){
    super(color);
}

    public MyRectangle(Color color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    double area()
    {
        return length*width;
    }

    @Override
    public void draw(GraphicsContext gr) {
    gr.strokeRect(1,1,width,length);
        gr.setFill(color);
    gr.fillRect(1,1,width,length);

    }

    @Override
    public String toString()
    {
        return "";
    }

    public javafx.scene.shape.Rectangle new_rec_fill(int x, int y, int w, int h, Color col)
    {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle();
        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(w);
        rectangle.setHeight(h);
        rectangle.setFill(col);
        return  rectangle;
    }

    public javafx.scene.shape.Rectangle new_rec_set(int x, int y, int w, int h, Color col)
    {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle();
        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(w);
        rectangle.setHeight(h);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Paint.valueOf("black"));
        rectangle.setStrokeWidth(1);
        return  rectangle;
    }
}
