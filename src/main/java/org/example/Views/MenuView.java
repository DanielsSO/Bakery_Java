package org.example.Views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import org.example.Models.ProductoModel;

import java.util.List;

public class MenuView {
    private VBox layout;
    private TilePane productosPane;
    private Button carrito;


    public MenuView(List<ProductoModel> productos) {
        productosPane = new TilePane();
        productosPane.setHgap(20);
        productosPane.setVgap(10);
        productosPane.setPrefColumns(3);



        for (ProductoModel producto : productos) {
            ProductoView view = new ProductoView(producto);
            productosPane.getChildren().add(view);
        }

        carrito = new Button("Ver carrito");
        layout = new VBox(carrito,productosPane);
        layout.setStyle("-fx-padding: 20px;");

    }

    public VBox getLayout() {
        return layout;
    }

    public TilePane getProductosPane() {
        return productosPane;
    }

    public Button getCarrito() {
        return carrito;
    }
}
