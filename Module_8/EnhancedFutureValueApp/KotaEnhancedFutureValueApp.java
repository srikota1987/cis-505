import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - KotaEnhancedFutureValueApp class.
    Created by Srilakshmi Kota
*/
public class KotaEnhancedFutureValueApp extends Application {

	private Label lblMonthlyPayment = new Label("Monthly Payment:");
	private Label lblInterestRate = new Label("Interest Rate:");
	private Label lblYears = new Label("Years:");
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
	private Label lblFutureValueDate = new Label();
	private TextField monthlyPaymentFld = new TextField();
	private TextField interestRateFld = new TextField();
	private TextArea txtResults = new TextArea();
	private Button clearBtn = new Button("Clear");
	private Button calculateBtn = new Button("Calculate");
	private Integer years[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	private ComboBox<Integer> yearsFld = new ComboBox<Integer>(FXCollections.observableArrayList(years));

	
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
		
		lblInterestRateFormat.setTextFill(Color.RED);
		
		
		grid.add(lblMonthlyPayment, 0, 0);
		grid.add(lblInterestRate, 0, 1);
		grid.add(lblYears, 0, 3);
		grid.add(monthlyPaymentFld, 1, 0);
		grid.add(interestRateFld, 1, 1);
		grid.add(lblInterestRateFormat, 1, 2);
		grid.setHalignment(lblInterestRateFormat, HPos.RIGHT);
		grid.add(yearsFld, 1, 3);
		
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(clearBtn);
		actionBtnContainer.getChildren().add(calculateBtn);
		grid.add(actionBtnContainer, 1, 4);
		
		
		grid.add(lblFutureValueDate, 0, 5);
		grid.add(txtResults, 0, 6);
		
		clearBtn.setOnAction(e -> clearFormFields());
		calculateBtn.setOnAction(e -> calculateResults	());
		
		Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Kota Future Value App");
        stage.sizeToScene();
        stage.show();

	}
	
	private void clearFormFields() {
		
		monthlyPaymentFld.setText("");
		interestRateFld.setText("");
		lblFutureValueDate.setText("");
		txtResults.setText("");
		yearsFld.setValue(0);
	}
	
	private void calculateResults() {
		
		double monthlyPayment = Double.valueOf(monthlyPaymentFld.getText());
		double interestRate = Double.valueOf(interestRateFld.getText());
		int years = yearsFld.getValue();
		double results = FinanceCalculator.calculateFutureValue(monthlyPayment, interestRate, years);
		lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
		
		txtResults.setText("The future value is $" + String.format("%.2f", results));
		
	}
	
	// Returns the current Date with MM/dd/yyyy format
	public String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		return sdf.format(date);
		
	}
}	
