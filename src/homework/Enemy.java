package homework;

public abstract class Enemy implements Mortal {
    private int health;

    private int damage;
    private boolean isDead = false;

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDead() {
        return isDead;
    }

    public int getDamage() {
        return damage;
    }

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
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
            if (this instanceof Zombie) {
                ((Zombie) this).getRandomReinc();

            }
            setDead(true);
            if (isDead()) System.out.println("УПАВ((УМЭР");
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
