package homework;

public abstract class Enemy implements Mortal {
    private int health;

    private int damage;

    public int getDamage() {
        return damage;
    }

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

    public abstract void attackHero(Hero hero);


    @Override
    public boolean isAlive() {
        if (getHealth() > 0) return true;

        return false;
    }
}
