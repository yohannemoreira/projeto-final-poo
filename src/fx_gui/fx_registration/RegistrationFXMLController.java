/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fx_gui.fx_registration;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Yohanne
 */
public class RegistrationFXMLController implements Initializable {

    @FXML
    private ComboBox<String> comboItens;

    @FXML//se for public, não precisa da anotação
    private void ComboSemester() {
	comboItens.setPromptText("Selecione um semestre");
	for (int i = 0; i <= 11; i++) {
	    comboItens.getItems().add((i + 1) + "° semestre");

	}
	comboItens.getItems().add("Outro");
    }

 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
	ComboSemester();
        
    }

}
