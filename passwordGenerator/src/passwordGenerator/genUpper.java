package passwordGenerator;

import java.util.Random;

public class genUpper implements charGenerator{
	
	/**
	 * This class's genChar method returns a random upper case letter
	 */
	
	@Override
	public char genChar() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return Character.toUpperCase(c);
	}

}
