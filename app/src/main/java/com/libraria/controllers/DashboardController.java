package com.libraria.controllers;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.libraria.utils.AlertHelper;

public class DashboardController {
    public static void show(Stage stage) {
        Button bukuButton = new Button("📚 Books Management");
        Button pinjamButton = new Button("📥 Borrowing");
        Button kembaliButton = new Button("📤 Returning");

        bukuButton.setOnAction(e -> {
            KelolaBukuController.show(stage);
        });

        pinjamButton.setOnAction(e -> {
            AlertHelper.info("Borrowing feature is not available yet!");
        });

        kembaliButton.setOnAction(e -> {
            AlertHelper.info("Returning feature is not available yet!");
        });

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(
                bukuButton,
                pinjamButton,
                kembaliButton
        );

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.show();
    }
}