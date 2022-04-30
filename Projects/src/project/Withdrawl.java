package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdrawl extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdrawl frame = new Withdrawl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection connection=null;
	 String b;
	 String n;
	 void some(String a)
	 {
		 b=a;
	 }
	 void zome(String a)
	 {
		 n=a;
	 }
	public Withdrawl() {
		connection=SequelConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Enter amount");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(138, 72, 126, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(102, 102, 184, 33);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Withdrawl");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals(""))
				{
					   try
						{						
					       connection=SequelConnection.dbConnector();
						   PreparedStatement cmd=connection.prepareStatement(b);
							
							
							
							 ResultSet rs=cmd.executeQuery();
						
							rs.next();
							String x=rs.getString(1);
							String a=x;
						    String b=textField.getText();
							int aa=Integer.parseInt(a);
							int bb=Integer.parseInt(b);
							if(aa>=bb)
							{
							int c=aa-bb;
							String cc=Integer.toString(c);
							
							Login obj=new Login();
							obj.w(bb);
							
							cmd.close();
							connection.close();
					
						connection=SequelConnection.dbConnector();
						
						 PreparedStatement cmdd=connection.prepareStatement(n);
						 ResultSet rss=cmdd.executeQuery();	
						
						 rss.next();
						 String ssss=rss.getString(1);
						
						
			            				
						  
						   String s="UPDATE bank set Balance='"+cc+"' WHERE name='"+ssss+"'";	
						   PreparedStatement cmds=connection.prepareStatement(s);
					
						   cmds.execute();
						  JOptionPane.showMessageDialog(null,"Successfully Withdrawl ");
						  cmds.close();
							connection.close();
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Withdrawl balance is greater than your current balance");
							}
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
				}
				
			}
		});
		btnNewButton.setBounds(138, 157, 117, 23);
		contentPane.add(btnNewButton);
	}
}
