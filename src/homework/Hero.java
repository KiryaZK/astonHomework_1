package homework;

public abstract class Hero implements Mortal {
    private int health;
    private String name;
    private int startDamage;

    private int damage;

    private int healthStarter;

    private boolean isDead = false;

    public boolean isDead() {
        return isDead;
    }

    public int getHealthStarter() {
        return healthStarter;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Hero(String name, int health, int startDamage) {
        this.name = name;
        this.startDamage = startDamage;
        this.health = health;
        this.damage = startDamage;
        this.healthStarter = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStartDamage() {
        return startDamage;
    }

    public void setStartDamage(int startDamage) {
        this.startDamage = startDamage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (getHealth() - damage <= 0) {
            setHealth(0);
            System.out.println(getName() + " YOU DIED!");
            return;
        }

        setHealth(getHealth() - damage);
    }

    public void checkDamage() {
        if (getStartDamage() == 0) setStartDamage(damage);
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) return true;

        return false;
    }

    public void checkAlive() {
        if (!isAlive()) {
            System.out.println(getName() + " YOU DIED!");
            setDead(true);
        }
    }

}
