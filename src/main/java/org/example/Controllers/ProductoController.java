package org.example.Controllers;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.example.Models.ProductoModel;
import org.example.Views.CarritoView;
import org.example.Views.MenuView;
import org.example.Views.ProductoView;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class ProductoController {

    private List<ProductoModel> carrito = new ArrayList<>();

    public ProductoController(MenuView vista) {
        TilePane productosPane = vista.getProductosPane();

        for (Node node : productosPane.getChildren()) {
            if (node instanceof ProductoView productoView) {
                Button boton = productoView.getAgregarCarritoBtn();
                boton.setOnAction(e -> {
                    ProductoModel producto = productoView.getProductoModel();
                    carrito.add(producto);
                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Carrito");
                    alerta.setHeaderText(null);
                    alerta.setContentText("Producto agregado al carrito 🛒");
                    alerta.showAndWait();
                });
            }
        }
        vista.getCarrito().setOnAction(actionEvent -> {
            CarritoView carritoView = new CarritoView();

            productosPane.setPrefColumns(3);
            Stage stage = (Stage) vista.getLayout().getScene().getWindow();
            Scene Inicio = vista.getLayout().getScene();
            carritoView.mostrar(carrito, stage, Inicio);
        });
    }
}