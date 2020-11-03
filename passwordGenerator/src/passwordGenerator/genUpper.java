package passwordGenerator;

import java.util.Random;

public class genUpper implements charGenerator{

	@Override
	public char genChar() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return Character.toUpperCase(c);
	}

}
