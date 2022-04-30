package EmployeeManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Employees extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees frame = new Employees();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTextField textField_3;
	private JTable table;
	/**
	 * Create the frame.
	 */
	public Employees() {
		
		connection=SqlLiteConnection.dbconnector();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee management system");
		lblEmployee.setFont(new Font("Dialog", Font.BOLD, 31));
		lblEmployee.setBounds(147, 12, 553, 42);
		contentPane.add(lblEmployee);
		
		JLabel lblNewLabel = new JLabel("EmpId");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(55, 89, 98, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EmployeeName");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 153, 162, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_2.setBounds(54, 219, 99, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_3.setBounds(72, 265, 53, 23);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(185, 89, 147, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 151, 147, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 212, 147, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					 String selectcommand="Insert Into Employees(Empid,EmpName,Gender,Age) values(?,?,?,?)";
					 PreparedStatement cmd=connection.prepareStatement(selectcommand);//PreparedStatement is getting a object from a class which has implements PreparedStatement interface
				     cmd.setString(1,textField.getText());
				     cmd.setString(2,textField_1.getText());
				     cmd.setString(3,textField_2.getText());
				     cmd.setString(4,textField_3.getText());
				     cmd.execute();//execute() methods is exist in an (interface PreparedStatement).
					 cmd.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setBounds(49, 345, 151, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String selectcommand="Select * from Employees";
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
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_1.setBounds(260, 345, 147, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_2.setBounds(468, 345, 137, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_3.setBounds(645, 345, 137, 32);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(390, 89, 384, 210);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(185, 262, 147, 32);
		contentPane.add(textField_3);
	}
}
