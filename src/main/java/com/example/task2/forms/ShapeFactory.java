package com.example.task2.forms;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class ShapeFactory {
    public MyShape createShape(int numberofSides, Color color) {
        HashMap<Integer, MyShape> key = new HashMap<>();
        key.put(1,new MyLine(color));
        key.put(2,new MyRectangle(color));
        key.put(3,new MyTriangle(color));
        key.put(4,new MySquare(color));
        key.put(5,new MyPentagon(color));
        return key.get(numberofSides);
    }
}

