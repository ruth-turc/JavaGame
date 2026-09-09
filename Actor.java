/**
 * Represents some attackable object that has health.
 */
public class Actor {
	
	private int currentHealth;
    private int totalHealth;
	
	public Actor(int totalHealth) {
		this.totalHealth = totalHealth;
		currentHealth = totalHealth;
	}
	
	public int getTotalHealth() {
		return totalHealth;
	}
	
	public int getHealth() {
		return currentHealth;
	}
	
	public void takeDamage(int amount) {
		currentHealth -= amount;
	}
}
