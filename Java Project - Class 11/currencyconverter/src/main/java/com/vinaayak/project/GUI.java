package com.vinaayak.project;

import java.io.IOException;
import atlantafx.base.theme.*;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.stage.*;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws IOException {
    /*    String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Stage newStage = new Stage();
		Scene scene = new Scene(l, 640, 480);
		scene.setCursor(Cursor.WAIT);
		newStage.initOwner(stage);
		stage.initStyle(StageStyle.DECORATED);
		newStage.initModality(Modality.WINDOW_MODAL);
	    stage.setScene(scene);
		stage.setFullScreen(false);
        stage.show();
		stage.setOnCloseRequest(event -> System.out.println("Closing Stage"));
		stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
			switch(event.getCode())
			{
				case ESCAPE: { // 27 = ESC key
					stage.setHeight(stage.getHeight() * 2);
					break;
				}
				case ENTER: { // 10 = Return
					stage.setWidth(stage.getWidth() * 2);
					break;
				}
				case A: {
					stage.initStyle(StageStyle.UNDECORATED);
					break;
				}
				default:  {
					System.out.println("Unrecognized key");
				}
			}
		});
		//newStage.showAndWait(); */
		FXMLLoader loader = new FXMLLoader();
        FXMLControl controller = new FXMLControl();
		loader.setLocation(controller.getClass().getResource("/GUI.fxml"));
		loader.setController(controller);
		TitledPane titlepane = loader.<TitledPane>load();
		stage.setScene(new Scene(titlepane, 800, 450));
		stage.setTitle("Currency Converter");
		stage.show();
    }

    public static void main(String[] args) {
        Application.setUserAgentStylesheet(new NordDark().getUserAgentStylesheet());
		Application.launch(args);
    }

}
