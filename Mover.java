public class Mover extends Actor {
    private int x;
    private int y;

    public Mover(int totalHealth) {
        super(totalHealth);
        int x = 0;
        int y = 0;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}