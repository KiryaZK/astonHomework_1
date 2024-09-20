package homework;

public class Warrior extends Hero {
    public Warrior(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Воин " + getName() + " атакует врага, занося свой клинок над его головой!");
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");
    }
}
