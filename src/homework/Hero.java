package homework;

public abstract class Hero {
    private String name;
    private int startDamage;

    public Hero(String name, int startDamage) {
        this.name = name;
        this.startDamage = startDamage;
    }

    public String getName() {
        return name;
    }

    public int getStartDamage() {
        return startDamage;
    }

    public abstract void attackEnemy(Enemy enemy);

}
