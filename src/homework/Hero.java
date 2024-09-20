package homework;

public class Hero {
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

    public void attackEnemy(Enemy enemy) {
        int index = getClass().getName().lastIndexOf(".");
        String className = getClass().getName().substring(index + 1);
        System.out.print("\n" + className + " " + getName() + " атакует врага ");

    }

}
