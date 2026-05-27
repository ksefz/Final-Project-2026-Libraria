package com.libraria;

import com.libraria.controllers.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    BukuBaseController dashboardController = new DashboardController();

    @Override
    public void start(Stage stage) {
        dashboardController.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}