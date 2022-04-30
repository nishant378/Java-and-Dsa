package projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class TicTacToe {


	private JFrame frame;
     private String startgame="X";
     private int aCount=0;
    private int bCount=0;  
	
	
	private JTextField txtCountX;
	private JTextField txtCountO;
	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	JButton btn5 = new JButton("");
	JButton btn6 = new JButton("");
	JButton btn7 = new JButton("");
	JButton btn8 = new JButton("");
	JButton btn9 = new JButton("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void choosePlayer()
	{
		if(startgame.equalsIgnoreCase("X"))
		{
			startgame="0";
		}
		else
		{
			startgame="X";
		}
	}
	void gameover()
	{
		txtCountX.setText(String.valueOf(aCount));
		txtCountO.setText(String.valueOf(bCount));
	}
   void winningGame()
   {
	
	  
	   
	    String b1=btn1.getText();
	    String b2=btn2.getText();
	   String b3=btn3.getText();
	   String b4=btn4.getText();
	   String b5=btn5.getText();
	   String b6=btn6.getText();
	   String b7=btn7.getText();
	   String b8=btn8.getText();
	   String b9=btn9.getText();
	 
	  if(b1==("X") && b2==("X") && b3==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		   aCount++;
           gameover();
	   }

	   if(b4==("X") && b5==("X") && b6==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b7==("X") && b8==("X") && b9==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b1==("X") && b4==("X") && b7==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b2==("X") && b5==("X") && b8==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b3==("X") && b6==("X") && b9==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b1==("X") && b5==("X") && b9==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   if(b3==("X") && b5==("X") && b7==("X"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		aCount++;
        gameover();
	   }
	   ////////////////////////////*******************player b
	   if(b1==("0") && b2==("0") && b3==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b4==("0") && b5==("0") && b6==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b7==("0") && b8==("0") && b9==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b1==("0") && b4==("0") && b7==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b2==("0") && b5==("0") && b8==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b3==("0") && b6==("0") && b9==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b1==("0") && b5==("0") && b9==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
	   if(b3==("0") && b5==("0") && b7==("0"))
	   {		  
		   JOptionPane.showMessageDialog(frame, "Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		bCount++;
        gameover();
	   }
   }
	
	
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(500, 500, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			btn1.setText(startgame);
		
			if(startgame.equalsIgnoreCase("X"))
			{
				btn1.setForeground(Color.RED);
			}
			else
			{
				btn1.setForeground(Color.BLUE);
			}
			
				choosePlayer();//change the player
				winningGame();
			
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
		btn2.setFont(new Font("Tahoma", Font.BOLD, 98));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
				}
				else
				{
					btn2.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
					
			}
		});
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn3.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
				}
				else
				{
					btn3.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerA = new JLabel("Player: A");
		lblPlayerA.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_4.add(lblPlayerA, BorderLayout.CENTER);
		
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setFont(new Font("Tahoma", Font.BOLD, 50));
		txtCountX.setText("0");
		panel_5.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn4.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
				}
				else
				{
					btn4.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn5.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
				}
				else
				{
					btn5.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn6.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
				}
				else
				{
					btn6.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerB = new JLabel("Player: B");
		lblPlayerB.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_9.add(lblPlayerB, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		txtCountO = new JTextField();
		txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountO.setFont(new Font("Tahoma", Font.BOLD, 50));
		txtCountO.setText("0");
		panel_10.add(txtCountO, BorderLayout.CENTER);
		txtCountO.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn7.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
				}
				else
				{
					btn7.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn8.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
				}
				else
				{
					btn8.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn9.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
				}
				else
				{
					btn9.setForeground(Color.BLUE);
				}
					choosePlayer();
					winningGame();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 98));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(null); 
				btn2.setText(null);
				btn3.setText(null);
				
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				
				btn8.setText(null);
				btn9.setText(null);
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
