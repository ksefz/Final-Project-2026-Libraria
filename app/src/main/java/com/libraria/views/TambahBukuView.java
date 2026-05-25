package com.libraria.views;

import com.libraria.models.Buku;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TambahBukuView {
    private HBox root;
    private TextField judulField;
    private TextField penulisField;
    private TextField kategoriField;
    private TextField genreField;
    private Button tambahButton;
    private Button kembaliButton;

    private TableView<Buku> tableBuku;

    @SuppressWarnings("unchecked")
    public TambahBukuView() {
        Label formTitle = new Label("➕ Add New Book");
        formTitle.setStyle("-fx-font-family: 'Segoe UI', Arial, sans-serif; -fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #FFFFFF;");

        judulField = new TextField();
        judulField.setPromptText("Book Title");
        penulisField = new TextField();
        penulisField.setPromptText("Author Name");
        kategoriField = new TextField();
        kategoriField.setPromptText("Category");
        genreField = new TextField();
        genreField.setPromptText("Genre");

        String fieldStyle = 
            "-fx-background-color: #FFFFFF;" +
            "-fx-background-radius: 12;" +
            "-fx-border-radius: 12;" +
            "-fx-padding: 12;" +
            "-fx-font-family: 'Segoe UI', sans-serif;" +
            "-fx-font-size: 14px;" +
            "-fx-text-fill: #172440;";

        judulField.setStyle(fieldStyle);
        penulisField.setStyle(fieldStyle);
        kategoriField.setStyle(fieldStyle);
        genreField.setStyle(fieldStyle);

        judulField.setPrefWidth(280);
        penulisField.setPrefWidth(280);
        kategoriField.setPrefWidth(280);
        genreField.setPrefWidth(280);

        tambahButton = new Button("📥 Save Book");
        tambahButton.setStyle(
            "-fx-background-color: #004AAD;" +
            "-fx-text-fill: white;" +
            "-fx-font-family: 'Segoe UI', sans-serif;" +
            "-fx-font-size: 15px;" +
            "-fx-font-weight: bold;" +
            "-fx-background-radius: 12;" +
            "-fx-cursor: hand;" +
            "-fx-pref-width: 280;" +
            "-fx-padding: 12;"
        );

        kembaliButton = new Button("⬅ Back to Book Management");
        kembaliButton.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: #FFAAA6;" + 
            "-fx-font-family: 'Segoe UI', sans-serif;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );

        VBox leftPane = new VBox(20);
        leftPane.setAlignment(Pos.CENTER);
        leftPane.setPadding(new Insets(40));
        leftPane.setPrefWidth(360);
        leftPane.setStyle("-fx-background-color: linear-gradient(to bottom, #2C426F, #172440);");
        leftPane.getChildren().addAll(formTitle, judulField, penulisField, kategoriField, genreField, tambahButton, kembaliButton);

        Label tableTitle = new Label("New Book List");
        tableTitle.setStyle("-fx-font-family: 'Segoe UI', Arial, sans-serif; -fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #172440;");

        tableBuku = new TableView<>();
        tableBuku.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-border-color: #E2E8F0;" +
            "-fx-border-radius: 8;" +
            "-fx-background-radius: 8;"
        );

        TableColumn<Buku, String> colJudul = new TableColumn<>("Title");
        colJudul.setCellValueFactory(new PropertyValueFactory<>("title"));
        colJudul.setPrefWidth(160);

        TableColumn<Buku, String> colPenulis = new TableColumn<>("Author");
        colPenulis.setCellValueFactory(new PropertyValueFactory<>("author"));
        colPenulis.setPrefWidth(120);

        TableColumn<Buku, String> colKategori = new TableColumn<>("Category");
        colKategori.setCellValueFactory(new PropertyValueFactory<>("category"));
        colKategori.setPrefWidth(100);

        TableColumn<Buku, String> colGenre = new TableColumn<>("Genre");
        colGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        colGenre.setPrefWidth(100);

        tableBuku.getColumns().addAll(colJudul, colPenulis, colKategori, colGenre);

        VBox rightPane = new VBox(20);
        rightPane.setAlignment(Pos.TOP_LEFT);
        rightPane.setPadding(new Insets(40, 30, 40, 30));
        rightPane.setStyle("-fx-background-color: #FFFFFF;");
        rightPane.setPrefWidth(540);
        rightPane.getChildren().addAll(tableTitle, tableBuku);

        root = new HBox();
        root.getChildren().addAll(leftPane, rightPane);
    }

    public HBox getRoot() {
        return root; 
    }
    public TextField getJudulField() { 
        return judulField; 
    }
    public TextField getPenulisField() { 
        return penulisField; 
    }
    public TextField getKategoriField() { 
        return kategoriField; 
    }
    public TextField getGenreField() { 
        return genreField; 
    }
    public Button getTambahButton() { 
        return tambahButton; 
    }
    public Button getKembaliButton() { 
        return kembaliButton; 
    }
    public TableView<Buku> getTableBuku() { 
        return tableBuku;
    }
}