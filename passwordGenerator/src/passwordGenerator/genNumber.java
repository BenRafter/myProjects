package passwordGenerator;

import java.util.Random;

public class genNumber implements charGenerator{

	@Override
	public char genChar() {
		Random r = new Random();
		int x = r.nextInt(11);
		return (char)(x+'0');
	}

}
