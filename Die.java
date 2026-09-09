import java.util.Random;

public class Die {
	/**
	 * The number of sides the die has
	 */
	final private int numSides;

	final private Random rand;
	
	/**
	 * Constructor class for Die
	 * 
	 * @param dieSides number of sides the die has
	 */
	public Die(int dieSides) {
		numSides = dieSides;
		rand = new Random();
	}

	/**
	 * Simulates rolling a Die with numSides number of sides
	 * 
	 * @return a random number between 1 and numSides
	 */
	public int rollDie() {
		int roll = (rand.nextInt(numSides)) + 1;
		
		return roll;
	}
}
