package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					Deposit window = new Deposit();
					
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
	public Deposit() {
		   connection=SequelConnection.dbConnector();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 104, 184, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterAmount = new JLabel("Enter amount");
		lblEnterAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterAmount.setBounds(137, 78, 126, 14);
		contentPane.add(lblEnterAmount);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("restriction")
			public void actionPerformed(ActionEvent arg0) {
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
						int c=aa+bb;
						String cc=Integer.toString(c);
						
						Login obj=new Login();
						obj.d(bb);
						
						
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
					  JOptionPane.showMessageDialog(null,"Successfully deposit");
					  cmds.close();
						connection.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0){
				
			}
		});
		btnNewButton.setBounds(153, 162, 89, 23);
		contentPane.add(btnNewButton);
	}
}
