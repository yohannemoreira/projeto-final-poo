/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fx_gui.fx_registration;

import account.Account;
import account.exceptions.RegisteredAccountException;
import account.facade.FacadeAccount;
import fx_gui.fx_login.LoginFXMLController;
import fx_gui.fx_login.LoginFXMain;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yohanne
 */
public class RegistrationFXMLController implements Initializable {

    @FXML
    private ComboBox<String> comboItens;
    @FXML
    private TextField txtEmail = new TextField();

    @FXML
    private TextField txtName = new TextField();

    @FXML
    private TextField txtUser = new TextField();

    @FXML
    private TextField txtCourse = new TextField();

    @FXML
    private PasswordField txtPassword = new PasswordField();

    @FXML//se for public, não precisa da anotação
    private void ComboSemester() {
	comboItens.setPromptText("Selecione um semestre");
	for (int i = 0; i <= 11; i++) {
	    comboItens.getItems().add((i + 1) + "° semestre");

	}
	comboItens.getItems().add("Outro");
    }

    @FXML
    private Button buttonRegistration;

    @FXML
    void addAction(ActionEvent event) {
	String name = txtName.getText();
	String email = txtEmail.getText();
	String user = txtUser.getText();
	String course = txtCourse.getText();
	String password = txtPassword.getText();
	String semester = comboItens.getSelectionModel().getSelectedItem();

	try {
	    FacadeAccount.getInstance().addAccount(new Account(name, user, password, email, course, semester));
	     LoginFXMain newLogin = new LoginFXMain();
	    try {
		newLogin.start(new Stage());
	    } catch (Exception ex) {
		Logger.getLogger(RegistrationFXMLController.class.getName()).log(Level.SEVERE, null, ex);
	    }

	} catch (RegisteredAccountException ex) {
	    Alert alert_registration = new Alert(Alert.AlertType.ERROR);
	    alert_registration.setTitle("Conta Já cadastrada");
	    alert_registration.setContentText("Esse E-mail já está sendo utilizado!");
	    alert_registration.showAndWait();
	}

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
	ComboSemester();
	buttonRegistration.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
		addAction(event);
		Stage stageAux = (Stage) buttonRegistration.getScene().getWindow();
		stageAux.close();
	    }
	    
	});
    }

}