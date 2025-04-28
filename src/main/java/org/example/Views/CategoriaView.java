package org.example.Views;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Models.ProductoModel;
import org.example.Controllers.ProductoController;

import java.util.List;

public class CategoriaView {
    public void mostrar(Stage primaryStage) {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));

        Label titulo = new Label("Selecciona una categoría");
        Button irProductos = new Button("Panadería");
        Button pasteles = new Button("Pastelería");


        irProductos.setOnAction(e -> {
            List<ProductoModel> productos = List.of(
                    new ProductoModel("Croissant", "https://panamarbakery.com/public/Image/2022/6/12309-13112_1-croissant-artesano-margcopia_Galeria.png", 10, 10),
                    new ProductoModel("Pirujo", "https://panamarbakery.com/public/Image/2022/6/130524pan_pueblo_660.png", 5, 1.50),
                    new ProductoModel("Manteca", "https://www.panaderia.com.gt/wp-content/uploads/2015/03/ma1.png", 6, 2.50)
            );

            MenuView menu = new MenuView(productos);
            new ProductoController(menu);

            // Botón para volver
            Button volver = new Button("Volver");
            volver.setOnAction(ev -> mostrar(primaryStage));
            menu.getLayout().getChildren().add(0, volver);

            Scene menuScene = new Scene(menu.getLayout());
            primaryStage.setScene(menuScene);
            primaryStage.setTitle("Menu de Panadería");
            primaryStage.sizeToScene();
        });

        pasteles.setOnAction(e -> {
            List<ProductoModel> productosPasteles = List.of(
                    new ProductoModel("Pastel Chocolate", "https://revistasociosams.com/wp-content/uploads/2022/08/portadas-mm.png", 3, 15.0),
                    new ProductoModel("Pastel de Fresa", "https://png.pngtree.com/png-clipart/20241114/original/pngtree-a-strawberry-and-cream-cake-png-image_17051440.png", 4, 16.50)
            );

            MenuView menu = new MenuView(productosPasteles);
            new ProductoController(menu);

            // Botón para volver
            Button volver = new Button("Volver");
            volver.setOnAction(ev -> mostrar(primaryStage));
            menu.getLayout().getChildren().add(0, volver);

            Scene menuPastelesScene = new Scene(menu.getLayout());
            primaryStage.setScene(menuPastelesScene);
            primaryStage.setTitle("Menu Pastelería");
            primaryStage.sizeToScene();
        });

        layout.getChildren().addAll(titulo, irProductos, pasteles);


        Scene escena = new Scene(layout, 300, 150);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Menú de Categorías");
        primaryStage.show();

    }
}
