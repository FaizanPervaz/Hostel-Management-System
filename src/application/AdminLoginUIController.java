package application;
import application.cd_classes.hostelm3;
import java.io.IOException;
import java.util.ResourceBundle;
import javax.print.DocFlavor.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.*; 
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class AdminLoginUIController {
Main m=new Main();
	
	//@FXML
	 // The reference of show button will be injected by the FXML loader
	 public Button goBtn;
	 public TextField email;
	 public TextField password;
	
	// location and resources will be automatically injected by the FXML loader
	 //@FXML
	// public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
//	 @FXML
//	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public AdminLoginUIController()
	 {
		 
		 
		 
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 
	 public void goToAdminRoles(ActionEvent event) throws IOException { 
		 try {
	
			//System.out.println("this is text");
		 String a1=email.getText();
		 int i=Integer.parseInt(a1);  
		 String b1=password.getText();
		 System.out.println(i);
	          System.out.println(b1);
			System.out.println("button clicked");
			goBtn.setText("you just clicked me!");
		   hostelm3 d1 = new hostelm3();
		   boolean tr=d1.manageusers(i,b1);
		   if(tr==true) {
			   Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
			   m.changeScene(s);
		   }
		   else {
			   
		   }
		 }
		 catch(Exception exception){
			 
		 }
			 
		 }
	 
	 
}
