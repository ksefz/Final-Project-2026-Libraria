package com.libraria.controllers;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KelolaBukuController {
    public static void show(Stage stage) {
        Label title = new Label("📚 BOOKS MANAGEMENT");

        title.setStyle(
                "-fx-font-size: 24px;" +
                "-fx-font-weight: bold;"
        );

        Button addButton = new Button("Add Books");
        Button deleteButton = new Button("Delete Books");
        Button viewButton = new Button("View List Books");
        Button backButton = new Button("⬅ Back");

        addButton.setPrefWidth(220);
        deleteButton.setPrefWidth(220);
        viewButton.setPrefWidth(220);
        backButton.setPrefWidth(220);

        // STYLE BUTTON
        String buttonStyle =
                "-fx-background-color: #4DA8DA;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 10px;";

        addButton.setStyle(buttonStyle);
        deleteButton.setStyle(buttonStyle);
        viewButton.setStyle(buttonStyle);

        backButton.setStyle(
                "-fx-background-color: #E74C3C;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 10px;"
        );

        // ADD BOOK
        addButton.setOnAction(e -> {

            BukuController.show(stage);

        });

        // DELETE BOOK
        deleteButton.setOnAction(e -> {

            DeleteBukuController.show(stage);

        });

        // VIEW BOOK
        viewButton.setOnAction(e -> {

            ViewBukuController.show(stage);

        });

        // BACK
        backButton.setOnAction(e -> {

            DashboardController.show(stage);

        });

        VBox root = new VBox(20);

        root.setAlignment(Pos.CENTER);

        root.setStyle(
                "-fx-background-color: #F5F7FA;"
        );

        root.getChildren().addAll(
                title,
                addButton,
                deleteButton,
                viewButton,
                backButton
        );

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Books Management");
        stage.setScene(scene);
        stage.show();
    }
}