package com.libraria.controllers;

import com.libraria.services.BukuService;
import javafx.stage.Stage;

public abstract class BukuBaseController {
    protected static BukuService bukuService = new BukuService();

    public abstract void show(Stage stage);
}