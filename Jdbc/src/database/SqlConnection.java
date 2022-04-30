package database;
import java.sql.*;
import javax.swing.*;
public class SqlConnection {
     Connection conn=null;
     public static Connection dbConnector()
     {
    	 try
    	 {
    		    Class.forName("org.sqlite.JDBC");
    		   
    			Connection conn=DriverManager.getConnection("jdbc:sqlite://home//nishant//Videos//Java & Sql//Java//Jdbc//Employs.db");
    			
    		 return conn;
    	 }
    	 catch(Exception e)
    	 {
    		 JOptionPane.showMessageDialog(null,e);
    		 return null;
    	 }
     }
}
