package passwordGenerator;

import java.util.ArrayList;


public class passwordGenClass {
	Boolean hasLowercase;
	Boolean hasUppercase;
	Boolean hasNumbers;
	Boolean hasSpecials;
	int pwordLength;
	ArrayList<charGenerator> genList = new ArrayList<charGenerator>();
	
	public passwordGenClass(Boolean lower, Boolean upper, Boolean numbers, Boolean specials, int len) {
		
		hasLowercase = lower; 
		hasUppercase = upper;
		hasNumbers = numbers;
		hasSpecials = specials;
		pwordLength = len;
		setgenList();
	}
	
	private void setgenList() {
		if(hasLowercase == true) {
			genLower temp0 = new genLower();
			genList.add(temp0);
		}
		if(hasUppercase == true) {
			genUpper temp1 = new genUpper();
			genList.add(temp1);
		}
		if(hasNumbers == true) {
			genNumber temp2 = new genNumber();
			genList.add(temp2);
		}
		if(hasSpecials == true) {
			genSpecial temp3 = new genSpecial();
			genList.add(temp3);
		}
	}
	
	public String toString() {
		String ret = "lower = " + hasLowercase + " upper = " + hasUppercase + " nums = " + hasNumbers + " specials = " + hasSpecials + " length = " + pwordLength;
		return ret;
	}
	
	
	public String genPassword() {
		String ret = "";
		for(int i = 0; i < genList.size(); i++) {
			System.out.println(genList.get(i).genChar());
		}
		return ret;
	}
}
