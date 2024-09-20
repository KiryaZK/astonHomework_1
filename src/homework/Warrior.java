package homework;

public class Warrior extends Hero {
    public Warrior(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        System.out.print("занося свой клинок над его головой!");
    }
}
