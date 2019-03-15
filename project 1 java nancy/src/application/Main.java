package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
public class Main extends Application implements EventHandler<ActionEvent>  {
	
	public static void main(String[] args) {
		
		
		launch(args);
	}
	Button button1,button2 ,button3,button4,button5;
	TextArea text1;
	user user1;
	@Override
	
	public void start(Stage primaryStage) throws Exception {
		 { 	
			 user1 = new user();
			 primaryStage.setTitle("    ATM  ");
			 primaryStage.setMinHeight(100 );
			 primaryStage.setMinWidth(400);
			 Label firstname=new Label("name");
			 Label password=new Label("password");
			 Label validationlabel=new Label();
			 GridPane grid=new GridPane();
			 Scene scene1=new Scene(grid,600,200);
			 Button logout=new Button("LOGOUT");
			 TextField text7=new TextField();
			 Button deposit=new Button("deposit");
			 Button withdraw=new Button("withdraw");
			 Button balance=new Button("balance");
			 Button nextH=new Button("next transaction");
			 Button previous=new Button("previous transaction");


			 Label welcome=new Label("                     WELCOME");
			 VBox layout=new VBox(20);
			 
			 layout.getChildren().addAll(welcome,deposit,withdraw,balance,nextH,previous,text7,logout);
			
			logout.setOnAction(e->primaryStage.setScene(scene1));
			 Scene scene2=new Scene(layout,400,400);
			 Button next=new Button("Next");
		     next.setOnAction(e->primaryStage.setScene(scene2));
			 TextField text2=new TextField();
			 PasswordField text3=new PasswordField();
			 Button submit=new Button("submit");
			 grid.add(firstname, 0, 0);
			 grid.add(text2, 1, 0);
			 grid.add(password, 0, 1);
			 grid.add(text3, 1, 1);
			 grid.add(submit, 0, 2);
			 grid.add(validationlabel, 0, 3);
		
			 submit.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String name=text2.getText();
				String password=text3.getText();
				 Boolean valid=user1.validate(name, password);
						 if(valid==false)
						 {errorwindow.error("you entered a wrong password or name,RETRY!"); 
						validationlabel.setFont(new Font("vernada",20));}
						 else
							 {validationlabel.setText("WELCOME TO NANCY'S ATM");
							 grid.add(next, 3, 8);
							 }
							 
				 }
			 });
			 deposit.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String value=alertwindow.display("diposit", "how much do you want to deposit");
				user1.deposit(value);
							 
				 }
			 });
			 balance.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String value=user1.get2Balance();
				balancewindow.display(value);
							 
				 }
			 });
			 withdraw.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String value=alertwindow.display("withdraw", "how much do you want to withdraw");
				String s=user1.getBalance();
				int n1=Integer.parseInt(s);
				int n2=Integer.parseInt(value);
				if(n1<n2){
					errorwindow.error("you can't withdraw this value your balance:"+n1);
					
				}else
				user1.withdraw(value);
							 
				 }
			 });
			 previous.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String prev=user1.previous();
				if (prev.compareTo("error")==0)
				{
					errorwindow.error("No more history stored");
				}else
				text7.setText(prev);
		 
				 }
			 });
			 nextH.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
				 public void handle(ActionEvent event)
				 {
				String prev=user1.next();
				if (prev.compareTo("error")==0)
				{
					errorwindow.error("No more history stored");
				}else
				text7.setText(prev);
		 
				 }
			 });
			 primaryStage.setScene(scene1);
			 primaryStage.show();
			 
		
		 }
	}
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}}
		