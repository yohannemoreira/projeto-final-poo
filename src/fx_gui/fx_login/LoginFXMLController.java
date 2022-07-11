///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
// */
//package fx_gui.fx_login;
//
//import fx_gui.fx_registration.RegistrationFXMLController;
//import fx_gui.fx_registration.RegistrationFXMain;
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.event.EventType;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//
///**
// * FXML Controller class
// *
// * @author Yohanne
// */
//public class LoginFXMLController implements Initializable {
//
//      @FXML
//    private Button buttonSceneReg = new Button();
//
//    @FXML
//    void sceneRegAction(ActionEvent event) {
//	Stage stageAux = (Stage) buttonSceneReg.getScene().getWindow();
//	stageAux.close();
//	RegistrationFXMain newAccount = new RegistrationFXMain();
//	    try {
//		newAccount.start(stageAux);
//	    } catch (Exception ex) {
//
//	    }
//
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//	buttonSceneReg.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
//	    sceneRegAction(event);
//	});
//    }    
//    
//}
package fx_gui.fx_login;

import fx_gui.fx_registration.RegistrationFXMLController;
import fx_gui.fx_registration.RegistrationFXMain;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
	@@ -17,14 +24,32 @@
 */
public class LoginFXMLController implements Initializable {


    @FXML
    private Button buttonSceneReg;

    @FXML
    void sceneRegAction(ActionEvent event) {
	Stage stageAux = (Stage)buttonSceneReg.getScene().getWindow();
	stageAux.close();
	RegistrationFXMain newAccount = new RegistrationFXMain();
	    try {
		newAccount.start(stageAux);
	    } catch (Exception ex) {

	    }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
	buttonSceneReg.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
		sceneRegAction(event);	
	    }

	});
    }    

}