package database;

import java.awt.EventQueue;
import java.sql.*;


import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class EmployeeMangementSystem {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMangementSystem window = new EmployeeMangementSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
      Connection connection=null;
      private JTextField textEmployeeID;
      private JTextField textNiNumber;
      private JTextField textFirstname;
      private JTextField textSurname;
      private JTextField textGender;
      private JTextField textDob;
      private JTextField textAge;
      private JTextField textSalary;
     
    JTable table = new JTable();
	/**
	 * Create the application.
	 */
	public EmployeeMangementSystem() {
		
		initialize();
		connection=SqlConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowActivated(WindowEvent arg0) {
			
			
			}
		});
		frame.setBounds(900, 700, 1050, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmployeeDatabaseMangement = new JLabel("Employee Database Mangement System");
		lblEmployeeDatabaseMangement.setBackground(Color.WHITE);
		lblEmployeeDatabaseMangement.setForeground(Color.BLACK);
		lblEmployeeDatabaseMangement.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEmployeeDatabaseMangement.setBounds(49, 12, 966, 84);
		frame.getContentPane().add(lblEmployeeDatabaseMangement);
		
		JLabel lblNewLabel = new JLabel("EmployeeId:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(37, 106, 196, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNiNumber = new JLabel("NI Number:");
		lblNiNumber.setForeground(Color.BLACK);
		lblNiNumber.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNiNumber.setBounds(37, 167, 180, 31);
		frame.getContentPane().add(lblNiNumber);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setForeground(Color.BLACK);
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFirstname.setBounds(37, 226, 180, 31);
		frame.getContentPane().add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setForeground(Color.BLACK);
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSurname.setBounds(37, 281, 151, 31);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGender.setBounds(37, 343, 131, 31);
		frame.getContentPane().add(lblGender);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDob.setBounds(37, 401, 131, 31);
		frame.getContentPane().add(lblDob);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAge.setBounds(37, 456, 131, 31);
		frame.getContentPane().add(lblAge);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setForeground(Color.BLACK);
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSalary.setBounds(37, 517, 131, 31);
		frame.getContentPane().add(lblSalary);
		
		textEmployeeID = new JTextField();
		textEmployeeID.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textEmployeeID.setForeground(SystemColor.textHighlight);
		textEmployeeID.setBackground(Color.WHITE);
		textEmployeeID.setBounds(270, 106, 131, 31);
		frame.getContentPane().add(textEmployeeID);
		textEmployeeID.setColumns(10);
		
		textNiNumber = new JTextField();
		textNiNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textNiNumber.setForeground(SystemColor.textHighlight);
		textNiNumber.setColumns(10);
		textNiNumber.setBounds(270, 167, 131, 31);
		frame.getContentPane().add(textNiNumber);
		
		textFirstname = new JTextField();
		textFirstname.setForeground(SystemColor.textHighlight);
		textFirstname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textFirstname.setColumns(10);
		textFirstname.setBounds(270, 226, 131, 31);
		frame.getContentPane().add(textFirstname);
		
		textSurname = new JTextField();
		textSurname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textSurname.setForeground(SystemColor.textHighlight);
		textSurname.setColumns(10);
		textSurname.setBounds(270, 287, 131, 31);
		frame.getContentPane().add(textSurname);
		
		textGender = new JTextField();
		textGender.setForeground(SystemColor.textHighlight);
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textGender.setColumns(10);
		textGender.setBounds(270, 343, 131, 31);
		frame.getContentPane().add(textGender);
		
		textDob = new JTextField();
		textDob.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textDob.setForeground(SystemColor.textHighlight);
		textDob.setColumns(10);
		textDob.setBounds(270, 401, 131, 31);
		frame.getContentPane().add(textDob);
		
		textAge = new JTextField();
		textAge.setForeground(SystemColor.textHighlight);
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textAge.setColumns(10);
		textAge.setBounds(270, 456, 131, 31);
		frame.getContentPane().add(textAge);
		
		textSalary = new JTextField();
		textSalary.setForeground(SystemColor.textHighlight);
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textSalary.setColumns(10);
		textSalary.setBounds(270, 517, 131, 31);
		frame.getContentPane().add(textSalary);
		
		JButton btnAddData = new JButton("Add Data");
		btnAddData.setBackground(SystemColor.activeCaptionBorder);
		btnAddData.setForeground(Color.BLACK);
		btnAddData.addActionListener(new ActionListener() {
			
			@SuppressWarnings("restriction")
			public void actionPerformed(ActionEvent arg0) {
					
				
				try
				{
					  String selectcommand="Insert Into Employs(EmpId,NI,Firstname,Surname,Gender,DOB,Age,Salary) values(?,?,?,?,?,?,?,?)";
					  PreparedStatement cmd=connection.prepareStatement(selectcommand);
				     cmd.setString(1,textEmployeeID.getText());
				     cmd.setString(2,textNiNumber.getText());
				     cmd.setString(3,textFirstname.getText());
				     cmd.setString(4,textSurname.getText());
				     cmd.setString(5,textGender.getText());
				     cmd.setString(6,textDob.getText());
				     cmd.setString(7,textAge.getText());
				     cmd.setString(8,textSalary.getText());
				     cmd.execute();
					 JOptionPane.showMessageDialog(null,textEmployeeID.getText());
					 cmd.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				
			}
		});
		btnAddData.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnAddData.setBounds(71, 590, 180, 50);
		frame.getContentPane().add(btnAddData);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(SystemColor.activeCaptionBorder);
		btnPrint.setForeground(SystemColor.windowText);
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("restriction")
			public void actionPerformed(ActionEvent arg0) {				
				try
				{
					String selectcommand="Select * from Employs";
					PreparedStatement cmd=connection.prepareStatement(selectcommand);
					ResultSet rs=cmd.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));

					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnPrint.setBounds(313, 590, 180, 50);
		frame.getContentPane().add(btnPrint);
		
		JButton btnClearData = new JButton("Clear");
		btnClearData.setBackground(SystemColor.activeCaptionBorder);
		btnClearData.setForeground(Color.BLACK);
		btnClearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textEmployeeID.setText(null);
				textNiNumber.setText(null);
				textFirstname.setText(null);
				textSurname.setText(null);
				textGender.setText(null);
				textDob.setText(null);
				textAge.setText(null);
				textSalary.setText(null);
			}
		});
		btnClearData.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnClearData.setBounds(557, 590, 180, 50);
		frame.getContentPane().add(btnClearData);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(SystemColor.activeCaptionBorder);
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			            System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnExit.setBounds(814, 590, 180, 50);
		frame.getContentPane().add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(472, 108, 522, 440);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
	}
}
