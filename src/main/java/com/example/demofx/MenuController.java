package com.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MenuController {

    @FXML
    protected void onCadastrarProduto() {

    }

    @FXML
    protected void onSair() {
        System.exit(0);
    }

    private void mostrarMsg(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alerta");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

}
