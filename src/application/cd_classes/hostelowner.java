package application.cd_classes;
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

public class hostelowner {

	private  int id;
    private String name;
    private String Address;
    private String phone;
    private String cnic;
    private Integer hostelid;
    
    void login(){

    }

    void paybilloptions(){

    }
    void cashpayment(){

    }
    void paybycash(){

    }
public boolean givepayment() {
	payment h1 = new payment();
	return h1.givepayment();
}
    public Integer cleaningservcie(){
    	hostelemployees h1 = new hostelemployees();
    	return h1.cleaningservcie();
    }
    public Integer laundryservcie(){
    	hostelemployees h1 = new hostelemployees();
    	return h1.laundryservice();
    }
}
