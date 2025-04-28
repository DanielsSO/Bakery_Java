package org.example.Views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.example.Models.ProductoModel;

public class ProductoView extends VBox {
    private Button agregarCarritoBtn;
    private ImageView imagenProducto;
    private ProductoModel productoModel;


    public ProductoView(ProductoModel producto) {
        this.productoModel = producto;

        imagenProducto = new ImageView(new Image(producto.getImg(), 120, 120, true, true));
        Label nombreLabel = new Label(producto.getNombre() + " - Q" + producto.getPrecio());
        Label cantidadLabel = new Label("Cantidad: " + producto.getCantidad());
        nombreLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");
        agregarCarritoBtn = new Button("Agregar al carrito");

        this.setPrefWidth(200);
        this.getChildren().addAll(imagenProducto, nombreLabel, cantidadLabel,agregarCarritoBtn);
        this.setSpacing(15);
        this.setStyle("-fx-padding: 10px; -fx-alignment: center; -fx-border-color: lightgray; -fx-border-radius: 8px;");
    }

    public Button getAgregarCarritoBtn() {
        return agregarCarritoBtn;
    }

    public ProductoModel getProductoModel() {
        return productoModel;
    }

}
