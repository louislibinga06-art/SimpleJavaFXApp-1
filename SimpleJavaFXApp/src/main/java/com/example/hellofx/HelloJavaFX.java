package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    // >>> EDIT THESE TWO LINES WITH YOUR OWN DETAILS <<<
    private static final String STUDENT_NAME = "louis libinga";
    private static final String STUDENT_NUMBER = "202510301";

    @Override
    public void start(Stage stage) {
        // The starting message (Challenge 2)
        String welcomeMessage = "Welcome, " + STUDENT_NAME + "!";

        Label message = new Label(welcomeMessage);

        // Challenge 3: button text is now "Start"
        Button startButton = new Button("Start");
        startButton.setOnAction(event ->
            message.setText("Great! You clicked the button.")
        );

        // Challenge 4: second button called "Reset"
        Button resetButton = new Button("Reset");
        resetButton.setOnAction(event ->
            message.setText(welcomeMessage)
        );

        HBox buttons = new HBox(15, startButton, resetButton);
        buttons.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(message, buttons);

        Scene scene = new Scene(layout, 500, 300);

        // Challenge 1: student number in the title
        stage.setTitle("My First JavaFX Application - " + STUDENT_NUMBER);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
