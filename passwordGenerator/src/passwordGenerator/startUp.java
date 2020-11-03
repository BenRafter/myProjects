package passwordGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class startUp {

	public static void startGen() {
		/**
		 * Setting up the JFrame here
		 */
		JFrame f = new JFrame();
		
		JLabel messageLabel = new JLabel("Your password will display here");
		messageLabel.setBounds(50, 50, 400, 50);
		f.add(messageLabel);
		
		JLabel instructLabel = new JLabel("Select buttons that fit your password criteria");
		instructLabel.setBounds(50, 100, 400, 50);
		f.add(instructLabel);
		
		JRadioButton incLowercase = new JRadioButton("Include lower case letters");
		incLowercase.setBounds(50, 150, 400, 50);
		incLowercase.setSelected(true);
		f.add(incLowercase);
		
		JRadioButton incNums = new JRadioButton("Include numbers");
		incNums.setBounds(50,200,400,50);
		f.add(incNums);
		
		JRadioButton incCapital = new JRadioButton("Include capital letters");
		incCapital.setBounds(50, 250, 400, 50);
		f.add(incCapital);
		
		JRadioButton incSpecials = new JRadioButton("Include special characters (!@#$%^&*()_+)");
		incSpecials.setBounds(50, 300, 400, 50);
		f.add(incSpecials);
		
		JLabel lengthLabel = new JLabel("Password length (1 - 20)");
		lengthLabel.setBounds(150, 309, 200, 100);
		f.add(lengthLabel);
		
		JFormattedTextField length = new JFormattedTextField(NumberFormat.getIntegerInstance());
		length.setBounds(50, 350, 100, 50);
		f.add(length);
		
		JButton genButton = new JButton("Generate password");
		genButton.setBounds(50, 400, 150, 50);
		f.add(genButton);
		genButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Checks are done in here to make sure that length is between 1 and 20
				 */
				try {
					int temp = Integer.parseInt(length.getText());
					if(temp > 0 && temp < 21) {
						passwordGenClass gen = new passwordGenClass(incLowercase.isSelected(), incCapital.isSelected(), incNums.isSelected(), incSpecials.isSelected(), temp);
						messageLabel.setText("Your password is " + gen.genPassword());
					}else {
						messageLabel.setText("Password length must be between 0 and 20");
					}
				}catch(Exception exception0) {
					//This is called if the button to generate a password is pressed while empty 
					messageLabel.setText("Enter a number");
				}
			}
		});
		f.setSize(400, 500);
		f.setLayout(null); 
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startGen();
	}

}
