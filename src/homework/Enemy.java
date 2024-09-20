package homework;

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (getHealth() - damage <= 0) {
            setHealth(0);
            return;
        }

        setHealth(getHealth() - damage);
    }
}
