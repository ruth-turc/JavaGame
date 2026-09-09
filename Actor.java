/**
 * Represents some attackable object that has health.
 */
public class Actor {
	/**
	 * represents the Actor's health at the current moment
	 */
	private int currentHealth;

	/**
	 * represents the total amount of health the Actor can hold
	 */
    private int totalHealth;
	
	/**
	 * Constructor for Actor class.
	 * Creates an Actor and sets their current health to the maximum.
	 * 
	 * @param totalHealth the total amount of health for the Actor
	 */
	public Actor(int totalHealth) {
		this.totalHealth = totalHealth;
		currentHealth = totalHealth;
	}
	
	/**
	 * Getter method for the Actor's total health.
	 * @return The Actor's total health
	 */
	public int getTotalHealth() {
		return totalHealth;
	}
	
	/**
	 * Getter method for the Actor's current health.
	 * @return The Actor's current health.
	 */
	public int getHealth() {
		return currentHealth;
	}
	
	/**
	 * Simulates the Actor taking damage.
	 * The Actor's currentHealth decreases by a specific amount.
	 * @param amount the amount of damage the Actor is taking
	 */
	public void takeDamage(int amount) {
		currentHealth -= amount;
	}
}
