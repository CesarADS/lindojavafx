package com.example.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    protected void onCadastrarProduto() {

    }

    @FXML
    protected void onVoltarLogin(ActionEvent event) {

        try {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/demofx/hello-view.fxml"));
                Scene menuScene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(menuScene);


        } catch (Exception e) {
            mostrarMsg(e.getMessage());
        }

    }

    private void mostrarMsg(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alerta");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

}
