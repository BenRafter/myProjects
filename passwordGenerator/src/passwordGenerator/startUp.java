package passwordGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class startUp {

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
		
		JTextField length = new JTextField("Length");
		length.setBounds(50, 350, 100, 50);
		f.add(length);
		
		JButton genButton = new JButton("Generate password");
		genButton.setBounds(50, 400, 150, 50);
		f.add(genButton);
		genButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp = Integer.parseInt(length.getText());
				passwordGenClass gen = new passwordGenClass(incLowercase.isSelected(), incCapital.isSelected(), incNums.isSelected(), incSpecials.isSelected(), temp);
				System.out.println(gen.toString());
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
