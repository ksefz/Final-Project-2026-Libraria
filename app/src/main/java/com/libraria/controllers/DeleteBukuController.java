package com.libraria.controllers;

import com.libraria.models.Buku;
import com.libraria.services.BukuService;
import com.libraria.utils.AlertHelper;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class DeleteBukuController {

    public static void show(Stage stage) {
        BukuService bukuService = new BukuService();

        Label title = new Label("🗑️ DELETE BOOK");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #C0392B;");

        VBox deleteListContainer = new VBox(10);
        deleteListContainer.setAlignment(Pos.CENTER);
        renderDeleteList(deleteListContainer, bukuService);

        Button backButton = new Button("⬅ Back");
        backButton.setPrefWidth(150);
        backButton.setStyle(
                "-fx-background-color: #7F8C8D;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 8;"
        );
        backButton.setOnAction(e -> {
            KelolaBukuController.show(stage);
        });

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #FDFEFE; -fx-padding: 25;");
        root.getChildren().addAll(title, deleteListContainer, backButton);

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    private static void renderDeleteList(VBox container, BukuService service) {
        container.getChildren().clear();

        ArrayList<Buku> listBuku = service.ambilSemuaBuku();
        if (listBuku.isEmpty()) {
            container.getChildren().add(new Label("No books available for deletion."));
            return;
        }

        int nomor = 1;
        for (Buku buku : listBuku) {
            Label infoBuku = new Label(nomor + ". " + buku.getTitle());
            infoBuku.setStyle("-fx-font-size: 14px;");

            Button deleteBtn = new Button("Delete");
            deleteBtn.setStyle(
                    "-fx-background-color: #E74C3C;" +
                    "-fx-text-fill: white;" +
                    "-fx-font-size: 12px;" +
                    "-fx-background-radius: 5;" +
                    "-fx-cursor: hand;"
            );

            deleteBtn.setOnAction(e -> {
                if (service.deleteBuku(buku.getTitle())) {
                    AlertHelper.success("Book '" + buku.getTitle() + "' successfully deleted the book!");
                    renderDeleteList(container, service);
                } else {
                    AlertHelper.error("Failed to delete book!");
                }
            });

            HBox row = new HBox(20);
            row.setAlignment(Pos.CENTER);
            row.getChildren().addAll(infoBuku, deleteBtn);
            container.getChildren().add(row);
            nomor++;
        }
    }
}