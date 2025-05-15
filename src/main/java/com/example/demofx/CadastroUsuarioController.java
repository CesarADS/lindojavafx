package com.example.demofx;

import com.example.demofx.model.DAO.UsuarioDAO;
import com.example.demofx.model.Usuario;
import com.example.demofx.utils.JPAUtils;
import jakarta.persistence.EntityManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroUsuarioController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private PasswordField txtConfirmarSenha;

    @FXML
    protected void onCadastrarUsuario() {

        try {

            if (txtSenha.getText().equals(txtConfirmarSenha.getText())) {

                EntityManager em = JPAUtils.getEntityManager();

                UsuarioDAO dao = new UsuarioDAO(em);
                Usuario usuario = new Usuario();

                usuario.setUsuario(txtUser.getText());
                usuario.setSenha(txtSenha.getText());

                dao.salvar(usuario);

                mostrarMsg("Usuário " + txtUser.getText() + " cadastrado com sucesso com ID " + usuario.getId() + "!");

                txtCodigo.setText(usuario.getId().toString());

            } else {
                mostrarMsg("As senhas não coincidem!");
            }

        } catch (Exception e) {
            mostrarMsg(e.getMessage());
        }

    }

    @FXML
    protected void onVoltarMenu(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/demofx/menu-view.fxml"));
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
