/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yedam;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author oXCToo
 */
public class Main extends Application {

	// define your offsets here
	private double xOffset = 0;
	private double yOffset = 0;

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));

		// we gonna remove the borderless thingie.
		stage.initStyle(StageStyle.DECORATED);
		stage.setMaximized(false);

		// grab your root here
		root.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("setOnMousePressed");
				xOffset = event.getSceneX();
				yOffset = event.getSceneY() + 35;
				System.out.println(xOffset + ", " + yOffset);
			}
		});

		// sorry about that - Windows defender issue.
		// move around here
		root.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("setOnMouseDragged");
				stage.setX(event.getScreenX() - xOffset);
				stage.setY(event.getScreenY() - yOffset);
				System.out.println(event.getScreenX() + ", " + event.getScreenY());
			}
		});

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
