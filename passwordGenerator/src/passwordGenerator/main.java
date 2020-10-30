package passwordGenerator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class main {

	public static void startGen() {
		JFrame f = new JFrame();
		
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
		
		JRadioButton incSpecials = new JRadioButton("Include special characters");
		incSpecials.setBounds(50, 300, 400, 50);
		f.add(incSpecials);
		
		JButton genButton = new JButton("Generate password");
		genButton.setBounds(50, 350, 150, 50);
		f.add(genButton);
		
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
