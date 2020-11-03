//Created by Benjamin Rafter, github link: https://github.com/BenRafter/BenjaminRafterProjects
package passwordGenerator;

import java.util.Random;

public class genLower implements charGenerator{

	/**
	 * This class's genChar method returns a random lower case letter
	 */
	@Override
	public char genChar() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}

}
