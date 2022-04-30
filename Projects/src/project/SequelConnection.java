package project;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SequelConnection {
	Connection conn=null;
    public static Connection dbConnector()
    {
   	 try
   	 {
   		 Class.forName("org.sqlite.JDBC");
   		 Connection conn=DriverManager.getConnection("jdbc:sqlite://home//nishant//Videos//Java & Sql//Java//Jdbc//bank.db");  
   	
   		 return conn;
   	 }
   	 catch(Exception e)
   	 {
   		 JOptionPane.showMessageDialog(null,e);
   		 return null;
   	 }
}
}
