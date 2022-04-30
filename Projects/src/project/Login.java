package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Login extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	 JLabel label_5 = new JLabel("");
	 String b;
	 String n;
	
int previousTransaction;
	
	void d(int a)
	{				 
		previousTransaction=a;
	}
	void w(int a)
	{
		previousTransaction=-a;		
	}
	void some(String a)
	{
	    b=a;
	}
	void zome(String a)
	{
	    n=a;
	}
	public Login() {
		 initialize() ;
		 
	}
	void lome(String para)
	{		
		 try
		 {
			 connection=SequelConnection.dbConnector();
	
		 PreparedStatement cmd=connection.prepareStatement(para);
		 ResultSet rs=cmd.executeQuery();	
		
		 rs.next();
		 label_5.setText( rs.getString(1));
		 cmd.close();
			connection.close();
		 }
		    catch(Exception e)
	        {
				e.printStackTrace();
			}
	}

	private void initialize() {
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowActivated(WindowEvent arg0) {
		
		
		    
		}
	});
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(900, 680, 1430, 738);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	
	
	
	
	
		
	 
	
	
	
	JLabel label = new JLabel("AXIS BANK");
	label.setIcon(new ImageIcon("H:\\Java\\Jdbc\\Img\\download.png"));
	label.setForeground(Color.BLACK);
	label.setFont(new Font("Tahoma", Font.BOLD, 44));
	label.setBackground(Color.WHITE);
	label.setBounds(515, 0, 301, 106);
	contentPane.add(label);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			System.exit(0);
		}
	});
	lblNewLabel_1.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/cancel-1294426_960_720.png"));
	lblNewLabel_1.setBounds(820, 465, 262, 157);
	contentPane.add(lblNewLabel_1);
	
	JLabel label_2 = new JLabel("");
	label_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Deposit obj=new Deposit();
			obj.setLocationRelativeTo(null);
			obj.setVisible(true);
			
			
			obj.some(b);
			obj.zome(n);
		}
	});
	label_2.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/money-banks-spain-euro-notes.jpg"));
	label_2.setBounds(552, 196, 262, 157);
	contentPane.add(label_2);
	
	JLabel label_3 = new JLabel("");
	label_3.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			Withdrawl obj=new Withdrawl();
			obj.setLocationRelativeTo(null);
			obj.setVisible(true);
			
			
			obj.some(b);
			obj.zome(n);
		}
	});
	label_3.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/euro-atvaizdo-naudojimas.jpg"));
	label_3.setBounds(1011, 196, 262, 157);
	contentPane.add(label_3);
	
	JLabel label_1 = new JLabel("");
	label_1.addMouseListener(new MouseAdapter() {
		@SuppressWarnings("restriction")
		@Override
		public void mouseClicked(MouseEvent arg0) {
			try
			{
				 connection=SequelConnection.dbConnector();
		
			
				
			 PreparedStatement cmd=connection.prepareStatement(b);
			 ResultSet rs=cmd.executeQuery();
			
			rs.next();
			String x=rs.getString(1);
			String a=x;
			 JOptionPane.showMessageDialog(null,a,"Your balance is",JOptionPane.INFORMATION_MESSAGE);
			 cmd.close();
				connection.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
	});
	label_1.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/new-series.jpg"));
	label_1.setBounds(82, 196, 262, 157);
	contentPane.add(label_1);
	
	JLabel lblNewLabel = new JLabel("Check balance");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblNewLabel.setBounds(134, 160, 155, 21);
	contentPane.add(lblNewLabel);
	
	JLabel lblDeposit = new JLabel("Deposit");
	lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblDeposit.setBounds(643, 164, 108, 21);
	contentPane.add(lblDeposit);
	
	JLabel lblWithdrawl = new JLabel("Withdrawl");
	lblWithdrawl.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblWithdrawl.setBounds(1095, 164, 108, 21);
	contentPane.add(lblWithdrawl);
	
	JLabel lblExit = new JLabel("Exit");
	lblExit.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblExit.setBounds(908, 433, 108, 21);
	contentPane.add(lblExit);
	
	JLabel lblWelcome = new JLabel("Welcome:");
	lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblWelcome.setBounds(401, 98, 119, 26);
	contentPane.add(lblWelcome);
	
	label_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
	label_5.setBounds(525, 98, 336, 26);
	contentPane.add(label_5);
	
	JLabel label_4 = new JLabel("");
	label_4.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(previousTransaction>0)
	    	{
				  JOptionPane.showMessageDialog(null,previousTransaction,"Deposit",JOptionPane.INFORMATION_MESSAGE);
	    	}
	    	else if(previousTransaction<0)
	    	{	    	 
				  JOptionPane.showMessageDialog(null,Math.abs(previousTransaction),"Withdrawl",JOptionPane.INFORMATION_MESSAGE);
	    		
	    	}
	    	else
	    	{
	    		
	    		 JOptionPane.showMessageDialog(null,"No tranaction occurred");
	    	}
			
		}
	});
	label_4.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/euro-1024x640.jpg"));
	label_4.setBounds(318, 475, 262, 157);
	contentPane.add(label_4);
	
	JLabel lblLastTransaction = new JLabel("Last transaction");
	lblLastTransaction.setFont(new Font("Tahoma", Font.PLAIN, 21));
	lblLastTransaction.setBounds(365, 440, 187, 21);
	contentPane.add(lblLastTransaction);
}
}
	


	
