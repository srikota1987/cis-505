import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Popup;
import javafx.stage.Stage;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - KotaGradeBookApp class.
    Created by Srilakshmi Kota
*/
public class KotaGradeBookApp extends Application {

	private Label lblFirstName = new Label("First Name:");
	private Label lblLastName = new Label("Last Name:");
	private Label lblCourse = new Label("Course:");
	private Label lblGrade = new Label("Grade:");
	private Label lblAddStudent = new Label();
	private TextField firstNameFld = new TextField();
	private TextField lastNameFld = new TextField();
	private TextField courseFld = new TextField();
	private Button clearBtn = new Button("Clear");
	private Button saveBtn = new Button("Save");
	private Button viewBtn = new Button("View");
	private String grades[] = { "A", "B", "C", "D", "F" };
	private ComboBox<String> gradesFld = new ComboBox<String>(FXCollections.observableArrayList(grades));

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Label lblFutureValueDate = new Label();

		GridPane grid = new GridPane();
		grid.setHgap(5.5);
		grid.setVgap(5.5);
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

		grid.add(lblAddStudent, 0, 0);
		grid.add(lblFirstName, 0, 1);
		grid.add(lblLastName, 0, 2);
		grid.add(lblCourse, 0, 3);
		grid.add(lblGrade, 0, 4);
		grid.add(firstNameFld, 1, 1);
		grid.add(lastNameFld, 1, 2);
		grid.add(courseFld, 1, 3);
		grid.add(gradesFld, 1, 4);

		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(clearBtn);
		actionBtnContainer.getChildren().add(saveBtn);
		actionBtnContainer.getChildren().add(viewBtn);
		grid.add(actionBtnContainer, 1, 5);

		clearBtn.setOnAction(e -> clearFormFields());

			
		Scene scene = new Scene(grid);
		stage.setScene(scene);
		stage.setTitle("Kota Grade Book App");
		stage.setWidth(500);
		//stage.sizeToScene();
		stage.show();
		
		viewBtn.setOnAction(e -> showTable());		

		clearBtn.setOnAction(e -> clearFormFields());
		
		saveBtn.setOnAction(e -> saveData());


	}

	private void clearFormFields() {

		firstNameFld.setText("");
		lastNameFld.setText("");
		courseFld.setText("");
		gradesFld.setValue("");
		lblAddStudent.setText("");
	}

	private void showTable()  {

		TableView<Student> table = new TableView<Student>();
		Stage stage = new Stage();

		Scene scene = new Scene(new Group());
		stage.setTitle("Grade Data");
		stage.setWidth(500);
		stage.setHeight(500);

		final Label label = new Label("Grades Data");

		TableColumn firstNameCol = new TableColumn("First Name");
		TableColumn lastNameCol = new TableColumn("Last Name");
		TableColumn courseCol = new TableColumn("Course");
		TableColumn gradeCol = new TableColumn("Grade");
		
		 firstNameCol.setCellValueFactory(
	                new PropertyValueFactory<Student, String>("firstName"));
		 lastNameCol.setCellValueFactory(
	                new PropertyValueFactory<Student, String>("lastName"));
		 courseCol.setCellValueFactory(
	                new PropertyValueFactory<Student, String>("course"));
		 gradeCol.setCellValueFactory(
	                new PropertyValueFactory<Student, String>("grade"));

		
		 try {
			table.setItems(CSVHelper.readData());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 table.getColumns().addAll(firstNameCol, lastNameCol, courseCol, gradeCol);

		final VBox vbox = new VBox();
		vbox.setSpacing(4);
		vbox.setPadding(new Insets(15, 0, 15, 30));
		vbox.getChildren().addAll(label, table);

		((Group) scene.getRoot()).getChildren().addAll(vbox);

		stage.setScene(scene);
		stage.show();

	}

	private void saveData() {

		String firstName = firstNameFld.getText();
		String lastName = lastNameFld.getText();
		String course = courseFld.getText();
		String grade = gradesFld.getValue();

		String studentData[] = { firstName, lastName, course, grade };

		try {
			CSVHelper.writeData(studentData);
		} catch (CsvValidationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lblAddStudent.setTextFill(Color.RED);
		lblAddStudent.setAlignment(Pos.CENTER);
		lblAddStudent.setText("Student Grade Added Successfully");
		
		
		firstNameFld.setText("");
		lastNameFld.setText("");
		courseFld.setText("");
		gradesFld.setValue("");
		

	}
	
	

}
