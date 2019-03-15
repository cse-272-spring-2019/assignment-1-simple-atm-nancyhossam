package application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class balancewindow {
	public static void display(String balance){
		Stage window=new Stage();
		window.setMinHeight(50);
		window.setMinWidth(400);
		GridPane grid=new GridPane();
		TextField text=new TextField();
		Label label=new Label();
		label.setText("BALANCE");
		text.setText(balance);
		grid.add(label,4, 0);
		grid.add(text, 1, 3);
		Scene scene=new Scene(grid);
		window.setScene(scene);
		window.show();
	}

}
