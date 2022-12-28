package application.cd_classes;
import application.hm1;
import application.cd_classes.user;
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

import java.util.random.*;
public class DBhandler {
	
	public boolean confirmadmin(int a,String s) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			      ResultSet rs=stmt.executeQuery("select * from admin");
			      while(rs.next()) {
						int a1=rs.getInt(1);
						String b=rs.getString(2);
						 System.out.println(a);
			   	          System.out.println(b);
						if(a==a1) {
							
							if(s.equals(b)) {
								
								return true;
							}
						}
					}
		}
		catch(Exception exception) {
			
		}
		return false;
		
	}
	
	public boolean accessuser(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			      ResultSet rs=stmt.executeQuery("select * from users");
			      while(rs.next()) {
						int a1=rs.getInt(1);
						//String b=rs.getString(2);
						 System.out.println(a);
			   	        
						if(a==a1) {
								return true;
						}
					}
		}
		catch(Exception exception) {
			
		}
		return false;
		
	}
	
	
	public boolean deleteuser(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			    //  stmt.executeQuery("DELETE FROM users WHERE id="+a+";");
			      String query = "delete from users where users_id="+a;
			      System.out.println(query);
			     // Statement stmt=con.createStatement();
		        	stmt.execute(query);
			      con.close();
		  return true;	       
		}
		catch(Exception exception) {
			
		}
		return false;
		
	}
	
	public boolean updateuser(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			    //  stmt.executeQuery("update users set name = Faizy WHERE id="+a+";");
			      String query = "update users set Name=? where users_id=?";
			      PreparedStatement preparedStmt = con.prepareStatement(query);
			      preparedStmt.setString(1, "Faizy");
			      preparedStmt.setInt(2, a);
			      preparedStmt.executeUpdate();
			      System.out.println(query);
			     //Statement stmt=con.createStatement();
		        //	stmt.executeUpdate(query);
			      con.close();
		  return true;	       
		}
		catch(Exception exception) {
			
		}
		return false;
	}

	public boolean accesshostels(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			      ResultSet rs=stmt.executeQuery("select * from Hostels");
			      while(rs.next()) {
						int a1=rs.getInt(1);
						//String b=rs.getString(2);
						 System.out.println(a);
			   	        
						if(a==a1) {
								return true;
						}
					}
		}
		catch(Exception exception) {
			
		}
		return false;
		
	}
	
	public boolean deletehostel1(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			    //  stmt.executeQuery("DELETE FROM users WHERE id="+a+";");
			      String query = "delete from hostels where Hostel_id="+a;
			      System.out.println(query);
			     // Statement stmt=con.createStatement();
		        	stmt.execute(query);
		        	System.out.println(query);
			      con.close();
		  return true;	       
		}
		catch(Exception exception) {
			
		}
		
		System.out.println("ptani");
		return false;
		
	}
	public Integer bookroom() {
		
		 int random_int = (int)Math.floor(Math.random()*(25-4+1)+4);
		 int random_int1 = (int)Math.floor(Math.random()*(50-2+1)+2);
		 int random_int2 = (int)Math.floor(Math.random()*(3-1+1)+1);
	  System.out.println(random_int);
	  System.out.println(random_int1);
	  System.out.println(random_int2);
	     
	     Connection connection = null;
	        String pass="sdadb";
	        try {
	        	Connection con= DriverManager.getConnection(
	          	      "jdbc:mysql://localhost:3306/sda_project","root",pass);
	        	String sql2 = "insert into room values ("+random_int+","+random_int2+","+random_int1+")";
	        	System.out.println(sql2);
	        	Statement stmt=con.createStatement();
	        	System.out.println(sql2);
	        	stmt.execute(sql2);
	        	return random_int;
	        }
	        catch(Exception exception){
        	System.out.println(exception);
	        }
	        return 0;
	        
	}
	
	public boolean bookmess() {
		
		 int random_int = (int)Math.floor(Math.random()*(25-4+1)+4);
		 int random_int1 = (int)Math.floor(Math.random()*(7-2+1)+2);
		// int random_int2 = (int)Math.floor(Math.random()*(3-1+1)+1);
	  System.out.println(random_int);
	  System.out.println(random_int1);
	 // System.out.println(random_int2);
	     
	     Connection connection = null;
	        String pass="sdadb";
	        try {
	        	Connection con= DriverManager.getConnection(
	          	      "jdbc:mysql://localhost:3306/sda_project","root",pass);
	        	String sql2 = "insert into mess values ("+random_int+","+random_int1+")";
	        	Statement stmt=con.createStatement();
	        	stmt.execute(sql2);
	        	return true;
	        }
	        catch(Exception exception){
	        	System.out.println(exception);
	        }
	        return false;
	        
	}
	
	
	public boolean booktransport() {
		
		 int random_int = (int)Math.floor(Math.random()*(25-4+1)+4);
		 int random_int1 = (int)Math.floor(Math.random()*(50-2+1)+2);
		 int random_int2 = (int)Math.floor(Math.random()*(2400-1+1)+500);
	  System.out.println(random_int);
	  System.out.println(random_int1);
	  System.out.println(random_int2);
	     
     Connection connection = null;
	        String pass="sdadb";
	        try {
	        	Connection con= DriverManager.getConnection(
	          	      "jdbc:mysql://localhost:3306/sda_project","root",pass);
	        	String dami = "h11";
	        	String dami1 = "g11";
	        	String sql2 = "insert into transport values ("+random_int+","+dami1+","+dami1+","+random_int2+","+1+")";
	        	Statement stmt=con.createStatement();
	        	System.out.println(sql2);
	        	stmt.execute(sql2);
	        	return true;
	        }
        catch(Exception exception){
	        	System.out.println(exception);
	        }
	        return false;
	        
	}
	
	public boolean payment() {
		
		 int random_int = (int)Math.floor(Math.random()*(25000-4+1)+4);
		 int random_int1 = (int)Math.floor(Math.random()*(50-2+1)+2);
		 int random_int2 = (int)Math.floor(Math.random()*(3-1+1)+1);
	  System.out.println(random_int);
	  System.out.println(random_int1);
	  System.out.println(random_int2);
	     
     Connection connection = null;
	        String pass="sdadb";
	        try {
	        	Connection con= DriverManager.getConnection(
	          	      "jdbc:mysql://localhost:3306/sda_project","root",pass);
	        	String sql2 = "insert into payment values ("+random_int+","+random_int2+","+random_int1+")";
	        	Statement stmt=con.createStatement();
	        	stmt.execute(sql2);
	        	return true;
	        }
	        catch(Exception exception){
	        	System.out.println(exception);
	        }
	        return true;
	        
	}
	
	
	public boolean updatehostel(int a) {
		try {
			 Connection connection = null; 
		     String pass="sdadb";
			      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sda_project","root",pass);    
			      Statement stmt=con.createStatement();
			    //  stmt.executeQuery("update users set name = Faizy WHERE id="+a+";");
			      String query = "update Hostels set Name=? where Hostel_id=?";
			      PreparedStatement preparedStmt = con.prepareStatement(query);
			      preparedStmt.setString(1, "Bobs");
			      preparedStmt.setInt(2, a);
			      preparedStmt.executeUpdate();
			      System.out.println(query);
			     //Statement stmt=con.createStatement();
		        //	stmt.executeUpdate(query);
			      con.close();
		  return true;	       
		}
		catch(Exception exception) {
			
		}
		return false;
	}
}
