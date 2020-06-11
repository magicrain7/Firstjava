/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yedam.control;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.yedam.common.ConnectionUtil;
import com.yedam.model.User;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author oXCToo
 */
public class HomeController implements Initializable {

	@FXML
	private TextField txtFirstname;
	@FXML
	private TextField txtLastname;
	@FXML
	private TextField txtEmail;
	@FXML
	private DatePicker txtDOB;
	@FXML
	private Button btnSave, btnSearch, btnPrev;
	@FXML
	private ComboBox<String> txtGender;
	@FXML
	Label lblStatus, lblId;

	@FXML
	TableView<User> tblData;

	/**
	 * Initializes the controller class.
	 */
	PreparedStatement preparedStatement;
	Connection connection;

	public HomeController() {
		connection = (Connection) ConnectionUtil.conDB();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		txtGender.getItems().addAll("Male", "Female", "Other");
		txtGender.getSelectionModel().select("Male");
		fetColumnList();
//		fetRowList();
		clearFields();

		tblData.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<User>() {

			@Override
			public void changed(ObservableValue<? extends User> observable, User oldValue, User newValue) {
				if (newValue != null) {
					lblId.setText(newValue.getId());
					txtFirstname.setText(newValue.getFirstName());
					txtLastname.setText(newValue.getLastName());
					txtEmail.setText(newValue.getEmail());
					txtGender.setValue(newValue.getGender());
					txtDOB.setValue(LocalDate.now());
				}
			}

		});

		tblData.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() == 2) {
					System.out.println(tblData.getSelectionModel().selectedItemProperty().getValue().getFirstName());
					System.out.println(tblData.getSelectionModel().selectedItemProperty().getValue().getLastName());
					System.out.println(tblData.getSelectionModel().selectedItemProperty().getValue().getEmail());
				} else {
					return;
				}
			}
		});

	}

	@FXML
	private void HandleEvents(MouseEvent event) {
		// check if not empty
		Button sourceBtn = (Button) event.getSource();

		if (sourceBtn.getId().equals("btnSearch")) {
			fetRowList();
			clearFields();

		} else if (sourceBtn.getId().equals("btnSave")) {

			if (txtEmail.getText().isEmpty() || txtFirstname.getText().isEmpty() || txtLastname.getText().isEmpty()
					|| txtDOB.getValue().equals(null)) {
				lblStatus.setTextFill(Color.TOMATO);
				lblStatus.setText("Enter all details");
			} else {
				saveData(lblId.getText());
			}
		} else if (sourceBtn.getId().equals("btnPrev")) {
			Stage stage = (Stage) sourceBtn.getScene().getWindow();
			stage.close();

			try {
				Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/Login.fxml")));
				stage.setScene(scene);
				stage.show();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void clearFields() {
		lblId.setText("insert");
		txtFirstname.clear();
		txtLastname.clear();
		txtEmail.clear();
	}

	private String saveData(String arg) {

		System.out.println(arg);

		try {
			if (arg.equals("insert")) {
				String st = "INSERT INTO users ( id, first_name, last_name, email, gender, birth_date) VALUES (user_seq.nextval,?,?,?,?,?)";
				preparedStatement = (PreparedStatement) connection.prepareStatement(st);
				preparedStatement.setString(1, txtFirstname.getText());
				preparedStatement.setString(2, txtLastname.getText());
				preparedStatement.setString(3, txtEmail.getText());
				preparedStatement.setString(4, txtGender.getValue().toString());
				preparedStatement.setString(5, txtDOB.getValue().toString());

				lblStatus.setText("Added Successfully");

			} else {
				String st = "update users set first_name = ?, last_name = ?, email = ?, gender = ?, birth_date = ? where id = ? ";
				preparedStatement = (PreparedStatement) connection.prepareStatement(st);
				preparedStatement.setString(1, txtFirstname.getText());
				preparedStatement.setString(2, txtLastname.getText());
				preparedStatement.setString(3, txtEmail.getText());
				preparedStatement.setString(4, txtGender.getValue().toString());
				preparedStatement.setString(5, txtDOB.getValue().toString());
				preparedStatement.setString(6, arg);

				lblStatus.setText("Update Successfully");

			}
			preparedStatement.executeUpdate();
			lblStatus.setTextFill(Color.GREEN);

			fetRowList();
			clearFields();

			return "Success";

		} catch (SQLException ex) {
			ex.printStackTrace();
			lblStatus.setTextFill(Color.TOMATO);
			lblStatus.setText(ex.getMessage());
			return "Exception";
		}
	}

	private ObservableList<User> datas;
	String SQL = "SELECT * from users ORDER  BY to_number(id)";

	// fetches rows and data from the list
	private void fetRowList() {
		datas = FXCollections.observableArrayList();
		ResultSet rs;
		try {
			rs = connection.createStatement().executeQuery(SQL);

			while (rs.next()) {
				int i = 1;
				User user = new User(rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getString(i++),
						rs.getString(i++), rs.getString(i++));
				datas.add(user);

			}

			tblData.setItems(datas);

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// only fetch columns
	private void fetColumnList() {

		try {

			TableColumn<User, String> colId = new TableColumn<>("ID");
			colId.setCellValueFactory(new Callback<CellDataFeatures<User, String>, ObservableValue<String>>() {
				@Override
				public ObservableValue<String> call(CellDataFeatures<User, String> param) {
					return new SimpleStringProperty(param.getValue().getId());
				}
			});

			TableColumn<User, String> colfName = new TableColumn<>("FName");
			colfName.setCellValueFactory(new Callback<CellDataFeatures<User, String>, ObservableValue<String>>() {
				@Override
				public ObservableValue<String> call(CellDataFeatures<User, String> param) {
					return new SimpleStringProperty(param.getValue().getFirstName());
				}
			});

			TableColumn<User, String> collName = new TableColumn<>("LName");
			collName.setCellValueFactory(new Callback<CellDataFeatures<User, String>, ObservableValue<String>>() {
				@Override
				public ObservableValue<String> call(CellDataFeatures<User, String> param) {
					return new SimpleStringProperty(param.getValue().getLastName());
				}
			});

			TableColumn<User, String> colEmail = new TableColumn<>("Email");
			colEmail.setCellValueFactory(new Callback<CellDataFeatures<User, String>, ObservableValue<String>>() {
				@Override
				public ObservableValue<String> call(CellDataFeatures<User, String> param) {
					return new SimpleStringProperty(param.getValue().getEmail());
				}
			});

			TableColumn<User, String> colbDate = new TableColumn<>("BirthDate");
			colbDate.setCellValueFactory(new Callback<CellDataFeatures<User, String>, ObservableValue<String>>() {
				@Override
				public ObservableValue<String> call(CellDataFeatures<User, String> param) {
					return new SimpleStringProperty(param.getValue().getBirthDate());
				}
			});

//			tblData.getColumns().removeAll(col);
			tblData.getColumns().addAll(colId, colfName, collName, colEmail, colbDate);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
