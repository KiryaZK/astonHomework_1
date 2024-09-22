package homework;

public class Warrior extends Hero {
    public Warrior(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Воин " + getName() + " атакует врага, занося свой клинок над его головой!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");

        checkDamage();
    }
}
