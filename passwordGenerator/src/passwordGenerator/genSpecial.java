package passwordGenerator;

import java.util.Random;

public class genSpecial implements charGenerator{

	@Override
	public char genChar() {
		String alphabet = "!@#$%^&*()_+";
		Random r = new Random();
		int x = r.nextInt(12);
		return alphabet.charAt(x);
	}

}
