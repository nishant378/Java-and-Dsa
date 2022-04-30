package project;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class BankingApplication {
	
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankingApplication window = new BankingApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	 Connection connection=null;
	public BankingApplication() {
		initialize();
		connection=SequelConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
			}
		});
		frame.setBounds(900, 680, 1430, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/DEEPIKA_1.png"));
		lblNewLabel.setBounds(971, 455, 399, 244);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AXIS BANK");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/download.png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNewLabel_1.setBounds(477, 11, 342, 106);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/DdtFByxVwAEOf9M.jpg"));
		label.setBounds(971, 184, 399, 270);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(261, 274, 257, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(261, 415, 257, 39);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(329, 379, 105, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AccountNo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(329, 238, 125, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblCreateNewAccount = new JLabel("Create new account");
		lblCreateNewAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCreateNewAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				NewAccount frame1 = new NewAccount();
				frame1.setVisible(true);
			}
		});
		lblCreateNewAccount.setBounds(303, 577, 194, 14);
		frame.getContentPane().add(lblCreateNewAccount);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("restriction")
			public void actionPerformed(ActionEvent arg0) {
			
		       if(!textField.getText().equals("") && !textField_1.getText().equals(""))
		       {
		    	   try
					{
		    		   
		    		    String selectcommand="Select name from bank where AccountNo='"+textField.getText()+"' and Password ='"+textField_1.getText()+"'";
						PreparedStatement cmd=connection.prepareStatement(selectcommand);
						
						ResultSet rs=cmd.executeQuery();
						
						
	            	String s="select Balance from bank where name=(Select name from bank where AccountNo='"+textField.getText()+"' and Password ='"+textField_1.getText()+"')";						
	             	
	            	Login obj=new Login();
	             	obj.some(s);
			          obj.lome(selectcommand);
			          
			          obj.zome(selectcommand);
	             	
			          
			         
		              
				     obj.setLocationRelativeTo(null);
				     obj.setVisible(true);
				     
				 cmd.close();
					connection.close();	
		    		    }
					
		    	  
					catch(Exception e)
					{
						e.printStackTrace();
						
					}
		       }
		       else
		       {
		    	   JOptionPane.showMessageDialog(null,"Fill the values");
		       }
				
			  
			}
		});
		btnNewButton.setBounds(329, 492, 105, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
