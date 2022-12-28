package application.cd_classes;
import application.hm1;
import application.cd_classes.*;
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
import javafx.scene.control.Label;;

public class Hostels {
	   private  int id;
	    private String name;
	    private String Address;
	    private String city;
	    private Integer postalcode;
	    private String phone;
	    private Integer no_of_students;
	    private Integer no_of_rooms;

	    void accesshostel(int a){

	    }
	     void showallhostels(){

	     }
	     public boolean  accesshostels(int a){
			   DBhandler h1 = new DBhandler();
	           return h1.accessuser(a);
		   }
	     
	   public Integer bookroom() {
		   DBhandler h1 = new DBhandler();
		   return h1.bookroom();
	   }

	    public boolean deletehostel(int a){
	    DBhandler h1 = new DBhandler();
	    return h1.deletehostel1(a);
	    }
	    
	    public boolean bookmess(){
		    DBhandler h1 = new DBhandler();
		    return h1.bookmess();
		    }
	    
	    public boolean booktransport(){
		    DBhandler h1 = new DBhandler();
		    return h1.booktransport();
		    }
	    
	    
	    public boolean updatehostel(int a){
		    DBhandler h1 = new DBhandler();
		    return h1.updatehostel(a);
		    }

	    void paybill(){

	    }

	    void cashpayment(){

	    }

	    void isp_options(){

	    }
	    
	    void selectisp(String a){

	    }

	    void booksubscription(user u1,String s1){
	        
	    }

	 String  getmess(String a, String b ){
	        return "";
	}

	String  getroom(String a, String b ){
	    return "";
	}

	void gettransport(String a){

	}
}
