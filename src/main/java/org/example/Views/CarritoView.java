package org.example.Views;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Models.ProductoModel;

import java.lang.foreign.StructLayout;
import java.util.List;

public class CarritoView {
    public void mostrar(List<ProductoModel> productos, Stage stagePrincipal, Scene Inicio) {
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));

        Label titulo = new Label("Carrito de compras 🛒");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        layout.getChildren().add(titulo);

        if (productos.isEmpty()) {
            layout.getChildren().add(new Label("El carrito está vacío."));
        } else {
            TilePane productosPane = new TilePane();
            productosPane.setHgap(15);
            productosPane.setVgap(10);
            productosPane.setPrefColumns(3);

            for (ProductoModel prod : productos)
            {
                VBox tarjeta = new VBox(10);
                tarjeta.setStyle("-fx-border-color: gray; -fx-padding: 10px; -fx-alignment: center");

                ImageView imageView = new ImageView(new Image(prod.getImg(), 120, 120, true, true));
                Label nombre = new Label(prod.getNombre());
                Label precio = new Label("Q" + prod.getPrecio());

                Button eliminar = new Button("Eliminar");
                eliminar.setOnAction(e -> {
                    productos.remove(prod);
                });
                tarjeta.getChildren().addAll(imageView, nombre, precio, eliminar);
                productosPane.getChildren().add(tarjeta);

            }
            layout.getChildren().add(productosPane);
        }

        Button regresarBtn = new Button("Regresar al menú");
        regresarBtn.setOnAction(e -> {
            stagePrincipal.setScene(Inicio);


        });

        layout.getChildren().add(regresarBtn);

        ScrollPane scrollPane = new ScrollPane(layout);
        scrollPane.setFitToWidth(true);

        Scene nuevaEscena = new Scene(scrollPane, 550, 400);
        stagePrincipal.setScene(nuevaEscena);

    }
}
