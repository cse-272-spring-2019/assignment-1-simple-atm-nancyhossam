package application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
public class errorwindow {
	public static void error(String label3){
		Stage window=new Stage();
		window.setTitle("error");
		window.setMinWidth(400);
		window.setMinHeight(100);
	    Label label=new Label();
	    window.initModality(Modality.APPLICATION_MODAL);
		label.setText(label3);
		Button button=new Button("ok");
		button.setOnAction(e->window.close());
		GridPane grid=new GridPane();
		grid.add(button, 6, 8);
		grid.add(label, 0, 0);
		Scene scene=new Scene(grid);
		window.setScene(scene);
		window.show();
	}
}
