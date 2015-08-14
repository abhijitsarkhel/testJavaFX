package in.indigenous.javafx.view;

import java.io.IOException;

import in.indigenous.javafx.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Label usernameLabel;

	@FXML
	private Label passwordLabel;

	@FXML
	private TextField usernameField;

	@FXML
	private PasswordField passwordField;

	@FXML
	private Button loginButton;

	@SuppressWarnings("unused")
	private MainApp mainApp;

	private Stage prevStage;

	public LoginController() {

	}

	@FXML
	private void initialize() {

	}

	@FXML
	private void handleLoginAction(ActionEvent event) {
		String userName = usernameField.getText();
		String password = passwordField.getText();

		// TODO - Move the code to some service.
		if(!"sarkhel.a@gmail.com".equals(userName)) {
			Alert alert = new Alert(AlertType.ERROR, "User does not exist!", ButtonType.OK);
			alert.showAndWait();
		} else {
			if(!"@s@rkhel1".equals(password)) {
				Alert alert = new Alert(AlertType.ERROR, "Password does not match!", ButtonType.OK);
				alert.showAndWait();
			} else {
				Stage stage = new Stage();
				stage.setTitle("MyApp");
				try {
					Pane pane = FXMLLoader.load(getClass().getResource("MyApp.fxml"));
					Scene scene = new Scene(pane);
					stage.setScene(scene);
					prevStage.close();
					stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void setPrevStage(Stage stage) {
		this.prevStage = stage;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public Label getUsernameLabel() {
		return usernameLabel;
	}

	public void setUsernameLabel(Label usernameLabel) {
		this.usernameLabel = usernameLabel;
	}

	public Label getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(Label passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public TextField getUsernameField() {
		return usernameField;
	}

	public void setUsernameField(TextField usernameField) {
		this.usernameField = usernameField;
	}

	public PasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(PasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public Button getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(Button loginButton) {
		this.loginButton = loginButton;
	}

}
