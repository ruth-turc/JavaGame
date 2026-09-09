/**
 * A FightingActor is a type of Actor that is able to attack.
 */
public class FightingActor extends Actor{

    /**
     * The die rolled to determine the amount of damage the FightingActor gives
     */
    private final Die attackDie;

    /**
     * The constructor for FightingActor.
     * Calls the Actor constructor and creates a new Die object with attackDieSides sides.
     * 
     * @param totalHealth the total amount of health for the FightingActor
     * @param attackDieSides number of sides for the attackDie
     */
    public FightingActor(int totalHealth, int attackDieSides) {
        super(totalHealth);
        attackDie = new Die(attackDieSides);
    }

    /**
     * Simulates the FightingActor making an attack.
     * Rolls the FightingActor's attackDie
     * @return the amount of damage the FightingActor's attack does
     */
    public int attack() {
        return attackDie.rollDie();
    }

    /**
     * Getter method for the attackDie
     * @return a pointer to the attackDie
     */
    public Die getAttackDie() {
        return attackDie;
    }
}
