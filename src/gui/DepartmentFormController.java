package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtname;
	@FXML
	private Label labelErrorName;

	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void obBtSaveAction() {
		System.out.println("onBtSAveAction");
	}
	@FXML
	public void onBtCancelAction() {
		System.out.println("obBTcancelAction");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();	
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtname, 30); // permite que apenas 30 caracteres sejam escritos
	}

}