package passwordGenerator;

import java.util.ArrayList;
import java.util.Random;


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
		if(len <= 0) {
			throw new IllegalArgumentException("Must be greater than 0");
		}
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
		StringBuilder obj = new StringBuilder();
		int temp = genList.size();
		Random r = new Random();
		while(pwordLength != 0) {
			int x = r.nextInt(temp);
			obj.append(genList.get(x).genChar());
			pwordLength = pwordLength - 1;
		}
		return obj.toString();
	}
}
