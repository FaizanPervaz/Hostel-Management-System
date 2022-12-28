package application.cd_classes;
import application.cd_classes.*;
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

public class admin {
	private  int id;
    private  int password;
    private String name;
    private String Address;
    private String phone;
    private String cnic;
    
    public boolean deleteuser(int a) {
    	user u1 = new user();
    return	u1.deleteuser(a);
    
    }
    
    public boolean updateuser(int a) {
    	user u1 = new user();
    return	u1.updateuser(a);
    
    }
    
    public boolean accesshostels(int a) {
    	Hostels u1 = new Hostels();
    return	u1.accesshostels(a);
    
    }
    
    public boolean deletehostels(int a) {
    	Hostels u1 = new Hostels();
    return	u1.deletehostel(a);
    
    }
    
    public boolean updatehostels(int a) {
    	Hostels u1 = new Hostels();
    return	u1.updatehostel(a);
    
    }
    
    public Integer cleaningservice() {
    	hostelowner h1 = new hostelowner();
    	return h1.cleaningservcie();
    	
    }
    public Integer laundryservice() {
    	hostelowner h1 = new hostelowner();
    	return h1.laundryservcie();
    	
    }
    
    public boolean payment() {
    	hostelowner h1 = new hostelowner();
    	return h1.givepayment();
    }
    public Integer bookroom() {
    	Hostels h1 = new Hostels();
    	return h1.bookroom();
    	
    }
    
    public boolean bookmess() {
    	Hostels h1 = new Hostels();
    	return h1.bookmess();
    	
    }
    public boolean booktransport() {
    	Hostels h1 = new Hostels();
    	return h1.booktransport();
    	
    }
    
    
    
    }


