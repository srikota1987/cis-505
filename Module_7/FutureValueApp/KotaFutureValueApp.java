import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - KotaFutureValueApp class.
    Created by Srilakshmi Kota
*/
public class KotaFutureValueApp extends Application {

	private Label lblMonthlyPayment = new Label("Monthly Payment:");
	private Label lblInterestRate = new Label("Interest Rate:");
	private Label lblYears = new Label("Years:");
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
	private TextField monthlyPaymentFld = new TextField();
	private TextField interestRateFld = new TextField();
	private TextArea dataFld = new TextArea();
	private Button clearBtn = new Button("Clear");
	private Button calculateBtn = new Button("Calculate");
	private ChoiceBox<Integer> yearsFld = new ChoiceBox<>();

	
	 public static void main(String[] args) {
	       Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {

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
		
		grid.add(dataFld, 0, 5);
		
		Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Kota Future Value App");
        stage.sizeToScene();
        stage.show();

	}
}
