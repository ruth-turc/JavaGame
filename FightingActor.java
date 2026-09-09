/**
 * A FightingActor is a type of Actor that is able to attack.
 */
public class FightingActor extends Actor{
    private final Die attackDie;

    public FightingActor(int totalHealth, int attackDieSides) {
        super(totalHealth);
        attackDie = new Die(attackDieSides);
    }

    public int attack() {
        return attackDie.rollDie();
    }

    public Die getAttackDie() {
        return attackDie;
    }
}
