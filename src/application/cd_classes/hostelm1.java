package application.cd_classes;
import application.hm1;
import application.cd_classes.Hostels;
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

public class hostelm1 {

	  String  getmess(String a, String b ){
          return "";
  }

  String  selectmess(Hostels hostelid){
      return "";
}

String  getroom(String a, String b ){
  return "";
}

String  selectroom(Hostels hostelid){
  return "";
}

String  gettransport(String a){
  return "";
}

String  selecttransport(Hostels hostelid){
  return "";
}

public Integer cleaningservice(){
	admin h1 =new admin();
	return h1.cleaningservice();
}

public Integer laundryservice(){
	admin h1 =new admin();
	return h1.laundryservice();
}

public Integer bookroom(){
	admin h1 =new admin();
	return h1.bookroom();
}

public boolean bookmess(){
	admin h1 =new admin();
	return h1.bookmess();
}

public boolean booktransport(){
	admin h1 =new admin();
	return h1.booktransport();
}

}
