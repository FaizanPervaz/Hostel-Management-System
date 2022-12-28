package application.cd_classes;
import application.hm1;
import application.AdminRolesUIController;
import application.cd_classes.user;
import application.cd_classes.hostelm1;
import application.cd_classes.DBhandler;
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

public class hostelm3 {
int fd;	
public boolean confirmadmin(int a,String s){
	DBhandler f1 = new DBhandler();
	
	boolean tr=	f1.confirmadmin( a, s);	
	return tr;
   }
	
	public  boolean manageusers(int a,String s){
           return confirmadmin(a,s);
	    }

	    

	    public boolean accessuser(int a){
          user u1 = new user();
          return u1.accessuser(a);
	    }

	  void viewallusers(){

	  } 
	  void changeuserinfo(user u1){

	  }

	  public boolean updateuser(int a){
		    admin h1 = new admin();
		    return h1.updateuser(a);
			}

	public boolean deleteuser(int a){
    admin h1 = new admin();
    return h1.deleteuser(a);
	}
}
