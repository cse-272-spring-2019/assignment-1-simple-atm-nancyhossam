package application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import java.awt.color.*;
import java.awt.Frame;

public class alertwindow {
public static String display(String tiltle,String label)
{
	Stage window=new Stage();
	window.setTitle(tiltle);
	window.setMinWidth(500);
	window.setMinHeight(300);
	Label label1=new Label();
	label1.setText(label);
	Label text1=new Label();
	Button button=new Button("close");
	Button button1=new Button("1");
	Button button2=new Button("2");
	Button button3=new Button("3");
	Button button4=new Button("4");
	Button button5=new Button("5");
	Button button6=new Button("6");
	Button button7=new Button("7");
	Button button8=new Button("8");
	Button button9=new Button("9");
	Button button0=new Button("0");
	Button buttonc=new Button("clear");
	button.setOnAction(e->window.close());
	button1.setOnAction(e->text1.setText(text1.getText()+"1"));
	button2.setOnAction(e->text1.setText(text1.getText()+"2"));
	button3.setOnAction(e->text1.setText(text1.getText()+"3"));
	button4.setOnAction(e->text1.setText(text1.getText()+"4"));
	button5.setOnAction(e->text1.setText(text1.getText()+"5"));
	button6.setOnAction(e->text1.setText(text1.getText()+"6"));
	button7.setOnAction(e->text1.setText(text1.getText()+"7"));
	button8.setOnAction(e->text1.setText(text1.getText()+"8"));
	button9.setOnAction(e->text1.setText(text1.getText()+"9"));
	button0.setOnAction(e->text1.setText(text1.getText()+"0"));
	buttonc.setOnAction(e->text1.setText(""));
	GridPane grid=new GridPane();
	grid.add(label1, 0, 0);
	grid.add(text1, 0, 1);
	grid.add(button1, 1, 2);
	grid.add(button2, 2, 2);
	grid.add(button3, 3, 2);
	grid.add(button4, 1, 3);
	grid.add(button5, 2, 3);
	grid.add(button6, 3, 3);
	grid.add(button7, 1, 4);
	grid.add(button8, 2, 4);
	grid.add(button9, 3, 4);
	grid.add(button0, 2, 5);
	grid.add(button, 4, 2);
	grid.add(buttonc, 3, 5);
	Scene scene=new Scene(grid);
	window.setScene(scene);
	window.showAndWait();
	String x=text1.getText();
	return x;

}
}
