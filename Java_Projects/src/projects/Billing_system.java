package projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Billing_system {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing_system window = new Billing_system();
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
	public Billing_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				
				textField.setText("0");	
				textField_1.setText("0");	
				textField_2.setText("0");
				textField_3.setText("0");	
				textField_4.setText("0");	
				
			
				
			}
			
		});
		frame.setBounds(900, 700, 1050, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 1002, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Billing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(333, 31, 347, 40);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(359, 120, 301, 238);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of labour:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 24, 138, 28);
		panel_2.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(192, 32, 86, 20);
		panel_2.add(textField_5);
		
		JLabel label = new JLabel("Cost of labour:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(20, 71, 138, 28);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Cost of labour:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(20, 114, 138, 28);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Cost of labour:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(20, 153, 138, 28);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Cost of labour:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(20, 192, 138, 28);
		panel_2.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(192, 79, 86, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(192, 122, 86, 20);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(192, 161, 86, 20);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(192, 200, 86, 20);
		panel_2.add(textField_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 565, 1002, 72);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Total Cost");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_5.getText()!="" && textField_6.getText()!="" && textField_7.getText()!="" && textField_8.getText()!="" && textField_9.getText()!="")
				{
				double i=Double.parseDouble(textField_5.getText()) + Double.parseDouble(textField_6.getText()) + Double.parseDouble(textField_7.getText())+ Double.parseDouble(textField_8.getText())+Double.parseDouble(textField_9.getText());
				textField_10.setText(String.format("$ %.2f", i));
				
				double tax=(i*0.75)/100;
				textField_11.setText(String.format("$ %f", tax));
				
				double total=i+tax;
				textField_12.setText(String.format("$ %f", total));
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(69, 15, 105, 38);
		panel_3.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(690, 120, 322, 422);
		frame.getContentPane().add(textArea);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cLabour=String.format(textField.getText());
				String cTravel=String.format(textField_1.getText());
				String cPlastic=String.format(textField_2.getText());
				
				String cCopper=String.format(textField_3.getText());
				String cChrome=String.format(textField_4.getText());
				
				String costLabour=String.format(textField_5.getText());
				String costTravel=String.format(textField_6.getText());
				String costPlastic=String.format(textField_7.getText());
				
				String costCopper=String.format(textField_8.getText());
				String costChrome=String.format(textField_9.getText());
				
				String SubTotal=String.format(textField_10.getText());
				String Tax=String.format(textField_11.getText());
				String Total=String.format(textField_12.getText());
				
				int refs=1325+(int)(Math.random()*4238);
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat Ttime=new SimpleDateFormat("HH:mm:ss");
				Ttime.format(timer.getTime());
				SimpleDateFormat Tdate=new SimpleDateFormat("dd-MMM-yyyy");
				Tdate.format(timer.getTime());
				
				
				textArea.append("\tOnline Billing System\n" + "Reference:\t\t\t"
						+ refs + "\n=======================================\t" +
						"\nLabour: "+ cLabour + ""+"\tCost of labour:"+ costLabour+ 
						"\nTravel: "+ cTravel + ""+"\tCost of Travel:"+costTravel+
						"\nPlastic: "+ cPlastic+ ""+"\tCost of Plastic:" + costPlastic+
						"\nCopper: "+ cCopper + ""+ "\tCost of Copper:"+ costCopper+
						"\nChrome: "+ cChrome + ""+ "\tCost of cChrome:"+costChrome+
			             "\n===============================================\t" +
						"\nTax : \t......" + Tax +
						"\nSubTotal: ....."+ SubTotal +
						"\n Total:......."+ Total+
						"\n=================================================\t"+
						"\nDate:" + Tdate.format(timer.getTime())+
						"\tTime:"+ Ttime.format(timer.getTime())+
						"\n\n\t\tThank you\n");
						 
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReceipt.setBounds(528, 15, 89, 38);
		panel_3.add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(761, 15, 89, 38);
		panel_3.add(btnExit);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 379, 650, 163);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblSubTotal = new JLabel("Sub Total:");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubTotal.setBounds(10, 21, 138, 28);
		panel_4.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(10, 72, 138, 28);
		panel_4.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(10, 122, 138, 28);
		panel_4.add(lblTotal);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(203, 21, 414, 28);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(203, 72, 414, 28);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(203, 122, 414, 28);
		panel_4.add(textField_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 120, 301, 238);
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Labour");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setEnabled(true);
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		chckbxNewCheckBox.setBounds(17, 29, 131, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTravels = new JCheckBox("Travels");
		chckbxTravels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setEnabled(true);
			}
		});
		chckbxTravels.setFont(new Font("Tahoma", Font.PLAIN, 23));
		chckbxTravels.setBounds(17, 70, 131, 23);
		panel_1.add(chckbxTravels);
		
		JCheckBox chckbxPlastic = new JCheckBox("Plastic");
		chckbxPlastic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setEnabled(true);
			}
		});
		chckbxPlastic.setFont(new Font("Tahoma", Font.PLAIN, 23));
		chckbxPlastic.setBounds(17, 112, 97, 23);
		panel_1.add(chckbxPlastic);
		
		JCheckBox chckbxCopper = new JCheckBox("Copper");
		chckbxCopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_3.setEnabled(true);
			}
		});
		chckbxCopper.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbxCopper.setBounds(17, 150, 97, 23);
		panel_1.add(chckbxCopper);
		
		JCheckBox chckbxChrome = new JCheckBox("Chrome");
		chckbxChrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_4.setEnabled(true);
			}
		});
		chckbxChrome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbxChrome.setBounds(17, 195, 108, 23);
		panel_1.add(chckbxChrome);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				chckbxNewCheckBox.setSelected(false);
				chckbxTravels.setSelected(false);
				chckbxPlastic.setSelected(false);
				chckbxCopper.setSelected(false);
				chckbxChrome.setSelected(false);
				
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				
				textArea.setText(null);
				
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
			}   
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(301, 15, 89, 38);
		panel_3.add(btnReset);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(168, 36, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(168, 76, 86, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(168, 118, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(168, 156, 86, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(168, 201, 86, 20);
		panel_1.add(textField_4);
	}
}
