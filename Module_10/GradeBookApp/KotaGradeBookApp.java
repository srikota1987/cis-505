import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
	private TextField firstNameFld = new TextField();
	private TextField lastNameFld = new TextField();
	private TextField courseFld = new TextField();
	private Button clearBtn = new Button("Clear");
	private Button saveBtn = new Button("Save");
	private Button viewBtn = new Button("View");
	private String grades[] = { "A", "B", "C", "D", "F"};
	private ComboBox<String> gradesFld = new ComboBox<String>(FXCollections.observableArrayList(grades));

	
	 public static void main(String[] args) {
	       Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
	//	Label lblFutureValueDate = new Label();

		GridPane grid = new GridPane();
		grid.setHgap(5.5);
		grid.setVgap(5.5);
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
				
		
		grid.add(lblFirstName, 0, 0);
		grid.add(lblLastName, 0, 1);
		grid.add(lblCourse, 0, 2);
		grid.add(lblGrade, 0, 3);
		grid.add(firstNameFld, 1, 0);
		grid.add(lastNameFld, 1, 1);
		grid.add(courseFld, 1, 2);
		grid.add(gradesFld, 1, 3);
		
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(clearBtn);
		actionBtnContainer.getChildren().add(saveBtn);
		actionBtnContainer.getChildren().add(viewBtn);
		grid.add(actionBtnContainer, 1, 4);
		
		
		
		clearBtn.setOnAction(e -> clearFormFields());
		
		
		Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Kota Grade Book App");
        stage.sizeToScene();
        stage.show();
        
        
        
        viewBtn.setOnAction(e->{
                        // create the structure again for the View Grades UI
        	showTable();
        });

	}
	
	private void clearFormFields() {
		
		firstNameFld.setText("");
		lastNameFld.setText("");
		courseFld.setText("");
		gradesFld.setValue("");
	}
	
	private void showTable() {
		
		TableView table = new TableView();
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
        
        table.getColumns().addAll(firstNameCol, lastNameCol, courseCol, gradeCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(15, 0, 15, 30));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
		
	}
	


}	
