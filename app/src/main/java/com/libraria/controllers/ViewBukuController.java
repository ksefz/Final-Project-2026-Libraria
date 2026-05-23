package com.libraria.controllers;

import com.libraria.models.Buku;
import com.libraria.services.BukuService;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ViewBukuController {
    public static void show(Stage stage) {
        BukuService bukuService = new BukuService();

        Label title = new Label("📖 LIST BOOKS");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #1E3A5F;");

        VBox bookListContainer = new VBox(12);
        bookListContainer.setAlignment(Pos.CENTER);
        ArrayList<Buku> listBuku = bukuService.ambilSemuaBuku();

        if (listBuku.isEmpty()) {
            bookListContainer.getChildren().add(new Label("No books available."));
        } else {
            int nomor = 1;
            for (Buku buku : listBuku) {
                Label infoBuku = new Label(nomor + ". " + buku.getTitle() + " - " + buku.getAuthor() + " (" + buku.getGenre() + ")");
                infoBuku.setStyle("-fx-font-size: 14px; -fx-text-fill: #2C3E50;");
                bookListContainer.getChildren().add(infoBuku);
                nomor++;
            }
        }

        Button backButton = new Button("⬅ Back");
        backButton.setPrefWidth(150);
        backButton.setStyle(
                "-fx-background-color: #34495E;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 8;"
        );
        backButton.setOnAction(e -> {
            KelolaBukuController.show(stage);
        });

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #F5F7FA; -fx-padding: 25;");
        root.getChildren().addAll(title, bookListContainer, backButton);

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}