package com.example.task2;

import com.example.task2.forms.MyShape;
import com.example.task2.forms.ShapeFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Canvas can;
    public TextField numb_s;
    public ColorPicker color;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Ondraw(ActionEvent actionEvent) {
        GraphicsContext graphicsContext = can.getGraphicsContext2D();
        ShapeFactory factory = new ShapeFactory();
        MyShape myShape = factory.createShape(Integer.parseInt(numb_s.getText()),color.getValue());
        myShape.draw(graphicsContext);
    }
}