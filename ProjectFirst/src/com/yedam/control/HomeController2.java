/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yedam.control;

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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author oXCToo
 */
public class HomeController2 implements Initializable {

	@FXML
	private TextField txtFirstname;
	@FXML
	private TextField txtLastname;
	@FXML
	private TextField txtEmail;
	@FXML
	private DatePicker txtDOB;
	@FXML
	private Button btnSave, btnSearch;
	@FXML
	private ComboBox<String> txtGender;
	@FXML
	Label lblStatus, lblId;

	@FXML
	TableView tblData;

	/**
	 * Initializes the controller class.
	 */
	PreparedStatement preparedStatement;
	Connection connection;

	public HomeController2() {
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

		tblData.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {

			@Override
			public void changed(ObservableValue observable, Object oldValue, Object newValue) {
				System.out.println((ObservableList) newValue);
				if (newValue != null) {
					lblId.setText(((ObservableList) newValue).get(0).toString());
					txtFirstname.setText(((ObservableList) newValue).get(1).toString());
					txtLastname.setText(((ObservableList) newValue).get(2).toString());
					txtEmail.setText(((ObservableList) newValue).get(3).toString());
					txtGender.setValue(((ObservableList) newValue).get(4).toString());
					txtDOB.setValue(LocalDate.now());
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

	private ObservableList<ObservableList> datas;
	String SQL = "SELECT * from users ORDER  BY to_number(id)";

	// only fetch columns
	private void fetColumnList() {

		try {
			ResultSet rs = connection.createStatement().executeQuery(SQL);

			// SQL FOR SELECTING ALL OF CUSTOMER
			for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
				// We are using non property style for making dynamic table
				final int j = i;
				TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
				System.out.println(rs.getMetaData().getColumnName(i + 1).toUpperCase());
				col.setCellValueFactory(
						new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
							public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
//								System.out.println(param.getValue() + " : lch>>> " + param.getValue().get(j).toString() + " > " + j);
								return new SimpleStringProperty(param.getValue().get(j).toString());
							}
						});

				tblData.getColumns().removeAll(col);
				tblData.getColumns().addAll(col);

				System.out.println("Column [" + i + "] ");

			} // end of tableColumn

		} catch (Exception e) {
//			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}
	}

	// fetches rows and data from the list
	private void fetRowList() {
		datas = FXCollections.observableArrayList();
		ResultSet rs;
		try {
			rs = connection.createStatement().executeQuery(SQL);

			while (rs.next()) {
				// Iterate Row
				ObservableList row = FXCollections.observableArrayList();
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					// Iterate Column
					row.add(rs.getString(i));
				}
				System.out.println("Row [1] added " + row);
				datas.add(row);

			}
			System.out.println("end of row added.");

			tblData.setItems(datas);

		} catch (SQLException ex) {
//			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
