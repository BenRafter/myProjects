//Created by Benjamin Rafter, github link: https://github.com/BenRafter/BenjaminRafterProjects
package passwordGenerator;

import java.util.ArrayList;
import java.util.Random;


public class passwordGenClass {
	/**
	 * genList is a list that will hold the charGenerator classes for each true boolean
	 */
	Boolean hasLowercase;
	Boolean hasUppercase;
	Boolean hasNumbers;
	Boolean hasSpecials;
	int pwordLength;
	ArrayList<charGenerator> genList = new ArrayList<charGenerator>();
	
	/**
	 * 
	 * @param lower If the password has lower case letters
	 * @param upper If the password has upper case letters
	 * @param numbers If the password has numbers 
	 * @param specials If the password has special characters 
	 * @param len The length of the password
	 */
	public passwordGenClass(Boolean lower, Boolean upper, Boolean numbers, Boolean specials, int len) {
		hasLowercase = lower; 
		hasUppercase = upper;
		hasNumbers = numbers;
		hasSpecials = specials;
		//Length of the password should be between 1 and 20
		if(len <= 0 || len > 20) {
			throw new IllegalArgumentException("Must be between 1 and 21");
		}
		pwordLength = len;
		setgenList();//Set up gen list
	}
	
	/**
	 * This function sets up genList. For each boolean that is true, adds that boolean charGenerator class to genList.
	 */
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
	
	/**
	 * Returns the passwordGenClass as a string 
	 */
	public String toString() {
		String ret = "lower = " + hasLowercase + " upper = " + hasUppercase + " nums = " + hasNumbers + " specials = " + hasSpecials + " length = " + pwordLength;
		return ret;
	}
	
	/**
	 * This class actually makes the password. Creates a stringbuilder, then randomly selects an item from genList and uses
	 * its genChar method X times, where X = pwordLength 
	 * @return The password as a string
	 */
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
