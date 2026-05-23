package com.libraria;

import com.libraria.controllers.DashboardController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        DashboardController.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}