package EmployeeManagementSystem;
import java.sql.*;
import javax.swing.*;
public class SqlLiteConnection {
//Connection is an interface
       Connection conn=null;
       public static Connection dbconnector()
       {
    	   try
    	   {
    	   Class.forName("org.sqlite.JDBC");//DriverManager is an interface
    	   Connection conn=DriverManager.getConnection("jdbc:sqlite://home//nishant//Videos//Java & Sql//Java//Jdbc//Employees.db");
    	   return conn;
    	   }
    	   catch(Exception e)
    	   {
    		   JOptionPane.showMessageDialog(null,e);
      		   return null;
    	   }
       }

	

}
