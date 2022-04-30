package projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class TravellingSystem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravellingSystem window = new TravellingSystem();
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
	
	public TravellingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		frame = new JFrame();
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	 
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(390, 130, 617, 100);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		textField_3.setColumns(10);
		textField_3.setBounds(25, 36, 86, 30);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(174, 36, 86, 30);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(315, 36, 86, 30);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(472, 36, 86, 30);
		panel_2.add(textField_6);
		

		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblClass.setBounds(403, 87, 85, 38);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblTicket.setBounds(553, 87, 85, 38);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblAdult.setBounds(714, 87, 85, 38);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblChild.setBounds(874, 91, 85, 38);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(389, 254, 311, 296);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(184, 28, 86, 30);
		panel_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(184, 95, 86, 30);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(184, 162, 86, 30);
		panel_5.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(184, 226, 86, 30);
		panel_5.add(textField_10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblFrom.setBounds(29, 20, 85, 38);
		panel_5.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblTo.setBounds(29, 87, 85, 38);
		panel_5.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblDate.setBounds(29, 154, 85, 38);
		panel_5.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblTime.setBounds(29, 218, 85, 38);
		panel_5.add(lblTime);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(734, 254, 273, 296);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setBounds(74, 60, 86, 30);
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(74, 151, 86, 30);
		panel_6.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(74, 235, 86, 30);
		panel_6.add(textField_13);
		
		JLabel lblTicketno = new JLabel("TicketNo");
		lblTicketno.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblTicketno.setBounds(74, 11, 131, 38);
		panel_6.add(lblTicketno);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblPrice.setBounds(74, 101, 85, 38);
		panel_6.add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblRoute.setBounds(75, 192, 85, 38);
		panel_6.add(lblRoute);
		frame.getContentPane().add(lblChild);
	
		frame.addWindowListener(new WindowAdapter() {
			@Override			
			public void windowActivated(WindowEvent arg0) {
			
			}
		});
		frame.setBounds(700, 700, 1050, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(22, 24, 985, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticket System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(308, 11, 374, 38);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(22, 130, 336, 167);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "killburn", "Preston", "Oxford ", "Leed"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(106, 105, 109, 34);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Standard", "Economy", "FirstClass"}));
		comboBox_1.setBounds(21, 36, 109, 33);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Old age", "Child", "Adult"}));
		comboBox_2.setBounds(187, 35, 109, 34);
		panel_1.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(22, 313, 336, 113);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTax.setBounds(21, 11, 55, 38);
		panel_3.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSubtotal.setBounds(21, 41, 74, 38);
		panel_3.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTotal.setBounds(21, 75, 55, 38);
		panel_3.add(lblTotal);
		
		textField = new JTextField();
		textField.setBounds(206, 54, 86, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 24, 86, 20);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 88, 86, 20);
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(22, 437, 336, 113);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
	
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ticket=1000;
				textField_3.setText("First");
				textField_4.setText("Return");
				textField_5.setText("One");
				textField_6.setText("NIL");
				
			textField_7.setText("London*");
			textField_8.setText(comboBox.getSelectedItem().toString()+ "*");
			
			Calendar timer=Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat Ttime=new SimpleDateFormat("HH:mm:ss");
			   textField_10.setText( Ttime.format(timer.getTime())); 
			SimpleDateFormat Tdate=new SimpleDateFormat("dd-MMM-yyyy");
			
			 textField_9.setText(Tdate.format(timer.getTime()));
			 
				int refs=1325+(int)(Math.random()*4238);
			
				textField_11.setText(Integer.toString(refs));
				
				textField_13.setText("Any");
				double tax=ticket*0.75/100;
				textField_1.setText(Double.toString(tax));
				
				
				if(comboBox_1.getSelectedItem().toString()=="Standard" && comboBox_2.getSelectedItem().toString() =="Old age")
				{					
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="Standard" && comboBox_2.getSelectedItem().toString() =="Child")
				{
					ticket=ticket-300;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="Standard" && comboBox_2.getSelectedItem().toString() =="Adult")
				{					
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="Economy" && comboBox_2.getSelectedItem().toString() =="Old age")
				{
					ticket=ticket-500;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="Economy" && comboBox_2.getSelectedItem().toString() =="Child")
				{
					ticket=ticket-800;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="Economy" && comboBox_2.getSelectedItem().toString() =="Adult")
				{
					ticket=ticket-500;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="FirstClass" && comboBox_2.getSelectedItem().toString() =="Old age")
				{
					ticket=ticket-200;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="FirstClass" && comboBox_2.getSelectedItem().toString() =="Child")
				{
					ticket=ticket-400;
					textField.setText(Integer.toString(ticket));
				}
				else if(comboBox_1.getSelectedItem().toString()=="FirstClass" && comboBox_2.getSelectedItem().toString() =="Adult")
				{
					ticket=ticket-200;
					textField.setText(Integer.toString(ticket));
				}
				
				double total=tax+ticket;
				textField_2.setText(Double.toString(total));
				textField_12.setText(Double.toString(total));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(10, 43, 89, 35);
		panel_4.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_1.setSelectedItem("Standard");
				comboBox_2.setSelectedItem("Old age");
				comboBox.setSelectedItem("Destination");
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(124, 43, 89, 35);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(237, 43, 89, 35);
		panel_4.add(btnExit);
		
		
		

		
	
		
		JLabel lblTicketType = new JLabel("Ticket Type");
		lblTicketType.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTicketType.setBounds(32, 87, 193, 43);
		frame.getContentPane().add(lblTicketType);
		
	}
}
