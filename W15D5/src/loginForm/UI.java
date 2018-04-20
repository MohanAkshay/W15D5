package loginForm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UI extends Application{
	TextField txtFirst = new TextField();
	PasswordField txtPW = new PasswordField();
	@Override 
	   public void start(Stage stage) {
		
		stage.setTitle("Login Form");			// Label the stage (a window)
		
		Pane theRoot = new Pane();
		
        Label lblHead = new Label("Login Form");
		Label lblFirst = new Label("User Name");
		Label lblSecond = new Label("Password");
		Button btnOk = new Button("Submit");
		Button btnExit = new Button("Cancel");
		
		lblHead.setLayoutX(150); lblHead.setLayoutY(50);
		lblHead.setFont(Font.font("Georgia",24));
		lblFirst.setLayoutX(50); lblFirst.setLayoutY(100);
		lblFirst.setFont(Font.font("Calibria",12));
		lblSecond.setLayoutX(50); lblSecond.setLayoutY(150);
		lblSecond.setFont(Font.font("Calibria",12));
		
		txtFirst.setLayoutX(200); txtFirst.setLayoutY(100);
		txtPW.setLayoutX(200); txtPW.setLayoutY(150);
		
		btnOk.setLayoutX(50); btnOk.setLayoutY(230);
		btnOk.setOnAction((event) -> { PressSubmit(); });
		btnExit.setLayoutX(300); btnExit.setLayoutY(230);
		btnExit.setOnAction((event) -> { PressCancel(); });

		theRoot.getChildren().addAll(lblHead, lblFirst,lblSecond,
                txtFirst,txtPW,btnOk,btnExit);
		
	
		Scene scene = new Scene(theRoot,400,300); //Creating a scene object
	     
		stage.setScene(scene);    //Adding scene to the stage 
	      
	     stage.show();            //Displaying the contents of the stage
	}
	
	
	
	 private void PressSubmit() {
		
	}



	private void PressCancel() {
		 System.exit(0);
			return;			
	}



	public static void main(String args[]){ 
	      launch(args); 
	   } 
}
