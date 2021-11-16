package com.mycompany.week12problemcar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        Rectangle body = new Rectangle(50,200,540,130);
        
        Circle c1 = new Circle();
        c1.setCenterX(165);
        c1.setCenterY(330);
        c1.setRadius(65);
        c1.setFill(Color.WHITE);

        Circle c2 = new Circle();
        c2.setCenterX(475);
        c2.setCenterY(330);
        c2.setRadius(65);
        c2.setFill(Color.WHITE);
        
        Circle c3 = new Circle();
        c3.setCenterX(165);
        c3.setCenterY(330);
        c3.setRadius(50);
        c3.setFill(Color.BLACK);
        
        Circle c4 = new Circle();
        c4.setCenterX(475);
        c4.setCenterY(330);
        c4.setRadius(50);
        c4.setFill(Color.BLACK);
        
        Circle c5 = new Circle();
        c5.setCenterX(165);
        c5.setCenterY(330);
        c5.setRadius(35);
        c5.setFill(Color.WHITE);
        
        Circle c6 = new Circle();
        c6.setCenterX(475);
        c6.setCenterY(330);
        c6.setRadius(35);
        c6.setFill(Color.WHITE);
        
        Rectangle rect = new Rectangle(50,400,540,20);
        
        
        var label = new Label("Luke's car");
        
        Group qp = new Group(body, c1, c2, c3, c4, c5, c6, rect);
        
        var scene = new Scene(qp, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}