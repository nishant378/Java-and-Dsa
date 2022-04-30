package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class NewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textAccount;
	private JTextField textPassword;
	private JTextField textCPassword;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount frame = new NewAccount();
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
	public NewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 680, 1430, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//connection to the connection class
		connection=SequelConnection.dbConnector();
		
		textAccount = new JTextField();
		textAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textAccount.setBounds(477, 296, 359, 41);
		contentPane.add(textAccount);
		textAccount.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPassword.setColumns(10);
		textPassword.setBounds(477, 426, 359, 41);
		contentPane.add(textPassword);
		
		textCPassword = new JTextField();
		textCPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCPassword.setColumns(10);
		textCPassword.setBounds(477, 530, 359, 41);
		contentPane.add(textCPassword);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textName.setColumns(10);
		textName.setBounds(477, 182, 359, 41);
		contentPane.add(textName);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblName.setBounds(630, 147, 74, 24);
		contentPane.add(lblName);
		
		JLabel lblAccountNo = new JLabel("AccountNo");
		lblAccountNo.setForeground(Color.WHITE);
		lblAccountNo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAccountNo.setBounds(615, 261, 136, 24);
		contentPane.add(lblAccountNo);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPassword.setBounds(615, 398, 136, 24);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password\r\n");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblConfirmPassword.setBounds(580, 495, 221, 24);
		contentPane.add(lblConfirmPassword);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 if(!textName.getText().equals("") && !textAccount.getText().equals("") && !textPassword.getText().equals("") && !textCPassword.getText().equals(""))
				 {
				 if(textPassword.getText().equals(textCPassword.getText()))
				 {
			     try
				 {
			    	
					 String selectcommand="Insert Into bank(Name,AccountNo,Password,Balance) values(?,?,?,?)";
					 PreparedStatement cmd=connection.prepareStatement(selectcommand);
				     cmd.setString(1,textName.getText());
				     cmd.setString(2,textAccount.getText());
				     cmd.setString(3,textPassword.getText());
				     cmd.setString(4,"0");
					 JOptionPane.showMessageDialog(null,"Congratulation! Now you have an account on Axis");
				     cmd.execute();
					
					 cmd.close();
				
						connection.close();
						NewAccount frame = new NewAccount();
						frame.dispose();
					BankingApplication window = new BankingApplication();
					window.frame.setVisible(true);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				 }
				 }
				
			}
		});
		btnSignUp.setBounds(615, 603, 136, 41);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("/home/nishant/Videos/Java & Sql/Java/Jdbc/Img/mesdefault.jpg"));
		lblNewLabel.setBounds(0, 0, 1380, 720);
		contentPane.add(lblNewLabel);
	}

}
