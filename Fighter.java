/**
 * A Fighter is a type of Mover that is able to attack.
 */
public class Fighter extends Mover{

    /**
     * The die rolled to determine the amount of damage the Fighter gives
     */
    private final Die attackDie;

    /**
     * The constructor for Fighter.
     * Calls the Mover constructor and creates a new Die object with attackDieSides sides.
     * 
     * @param totalHealth the total amount of health for the FightingActor
     * @param attackDieSides number of sides for the attackDie
     */
    public Fighter(int totalHealth, int attackDieSides) {
        super(totalHealth);
        attackDie = new Die(attackDieSides);
    }

    /**
     * Simulates the Fighter making an attack.
     * Rolls the Fighter's attackDie
     * @return the amount of damage the Fighter's attack does
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
