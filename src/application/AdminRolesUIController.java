package application;
import application.hm1;
import application.cd_classes.hostelm1;
import  application.Main;
import java.io.IOException;
import java.util.ResourceBundle;
import javax.print.DocFlavor.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
import javafx.scene.control.Label;

public class AdminRolesUIController {
	public int fd;
Main m=new Main();
FXMLLoader loader = new FXMLLoader();
    @FXML
  public Label lb1;
    public Label lb2;
	 public AdminRolesUIController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 //hostelm dani = new hostelm();
//	 public void hello() {
//		 System.out.println("cdscd");
//	 }
	 public void funct(int a,String s) {
		 String str1 = Integer.toString(a);
		 lb1.setText(str1);
		 lb2.setText(s);
	 }
	 public void gotouser(ActionEvent event) throws IOException {
		 Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
//		 hostelm1 dani = new hostelm1();
//			dani.hello();;
		m.userchangeoperations(s);;
	 }
	 
	 public void gotomh(ActionEvent event) throws IOException {
		 Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.managehostels(s);;
	 }

	 
}
