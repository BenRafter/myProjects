//Created by Benjamin Rafter, github link: https://github.com/BenRafter/BenjaminRafterProjects
package passwordGenerator;

import java.util.Random;

public class genSpecial implements charGenerator{

	/**
	 * This class's genChar method returns a random special char
	 */
	
	@Override
	public char genChar() {
		String alphabet = "!@#$%^&*()_+";
		Random r = new Random();
		int x = r.nextInt(12);
		return alphabet.charAt(x);
	}

}
