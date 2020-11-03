package passwordGenerator;

import java.util.Random;

public class passwordGenClass {
	Boolean hasLowercase;
	Boolean hasUppercase;
	Boolean hasNumbers;
	Boolean hasSpecials;
	int pwordLength;
	
	public passwordGenClass(Boolean lower, Boolean upper, Boolean numbers, Boolean specials, int len) {
		
		hasLowercase = lower; 
		hasUppercase = upper;
		hasNumbers = numbers;
		hasSpecials = specials;
		pwordLength = len;
	}
	
	public String toString() {
		String ret = "lower = " + hasLowercase + " upper = " + hasUppercase + " nums = " + hasNumbers + " specials = " + hasSpecials + " length = " + pwordLength;
		return ret;
	}
	
	public char getRandomLower() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}
	
	public char getRandomUpper() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return Character.toUpperCase(c);
	}
	
	public char getRandomNumber() {
		Random r = new Random();
		int x = r.nextInt(11);
		return (char)(x+'0');
	}
	
	public char getRandomSpecial() {
		String alphabet = "!@#$%^&*()_+";
		Random r = new Random();
		int x = r.nextInt(13);
		return alphabet.charAt(x);
	}
	
	public String genPassword() {
		String ret = "";
		System.out.println(getRandomLower());
		System.out.println(getRandomUpper());
		System.out.println(getRandomNumber());
		System.out.println(getRandomSpecial());
		return ret;
	}
}
