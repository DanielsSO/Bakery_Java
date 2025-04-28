package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.Controllers.ProductoController;
import org.example.Models.ProductoModel;
import org.example.Views.CategoriaView;
import org.example.Views.MenuView;

import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        CategoriaView categoriaView = new CategoriaView();
        categoriaView.mostrar(primaryStage);
        primaryStage.setTitle("Seleccionar categoría");
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}