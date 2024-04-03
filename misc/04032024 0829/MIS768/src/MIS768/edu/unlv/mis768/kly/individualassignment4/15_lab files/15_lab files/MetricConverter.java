package edu.unlv.mis768.labwork15;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MetricConverter extends Application {

	@Override
	public void start(Stage primaryStage) {		
		try {
			// load the fxml file to define the UI
			Parent parent = FXMLLoader.load(getClass().getResource("MetricConverter.fxml"));
			// establish the scene
			Scene scene = new Scene(parent);
			// set the scene to stage
			primaryStage.setScene(scene);
			
		} catch (IOException e) {
			// Print the error message to console
			System.out.print(e.getMessage());
		}
		
		// set the title of the window
		primaryStage.setTitle(" Metric Converter");
		
		// show the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
