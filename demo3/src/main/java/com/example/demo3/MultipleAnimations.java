package com.example.demo3;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MultipleAnimations extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Circle animation (Translation)
        Circle circle = new Circle(50, Color.BLUE);
        circle.setTranslateX(50);
        circle.setTranslateY(50);
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), circle);
        translateTransition.setByX(200);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.setAutoReverse(true);

        // Rectangle animation (Rotation)
        Rectangle rectangle = new Rectangle(100, 50, Color.GREEN);
        rectangle.setTranslateX(50);
        rectangle.setTranslateY(150);
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), rectangle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(true);

        // Ellipse animation (Scaling)
        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setTranslateX(50);
        ellipse.setTranslateY(250);
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), ellipse);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.setAutoReverse(true);

        // Text animation (Fading)
        Text text = new Text("Hello, JavaFX!");
        text.setFill(Color.BLACK);
        text.setTranslateX(50);
        text.setTranslateY(350);
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), text);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setAutoReverse(true);

        // Create a Pane and add shapes to it
        Pane pane = new Pane();
        pane.getChildren().addAll(circle, rectangle, ellipse, text);

        // Create a Scene and add the Pane to it
        Scene scene = new Scene(pane, 300, 400);

        // Set the stage title and scene, then show the stage
        primaryStage.setTitle("Multiple Animations");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Play animations
        translateTransition.play();
        rotateTransition.play();
        scaleTransition.play();
        fadeTransition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}