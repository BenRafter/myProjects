package passwordGenerator;

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
	
	public String genPassword() {
		String ret = "";
		
		
		
		return ret;
	}
}
