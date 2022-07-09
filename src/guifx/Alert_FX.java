/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guifx;

/**
 *
 * @author Yohanne
 */
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alert_FX {

    public static void info(String message) {
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setTitle("{ INFO }");
	alert.setHeaderText(null);
	alert.setContentText(message);
	alert.showAndWait();
    }

    public static void alert(String message) {
	Alert alert = new Alert(AlertType.WARNING);
	alert.setTitle("{ WARNING }");
	alert.setHeaderText(null);
	alert.setContentText(message);
	alert.showAndWait();
    }

    public static void error(String message) {
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("{ ERROR }");
	alert.setHeaderText(null);
	alert.setContentText(message);
	alert.showAndWait();
    }

}
