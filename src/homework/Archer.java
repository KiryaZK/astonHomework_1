package homework;

public class Archer extends Hero {
    public Archer(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        System.out.print("выпуская поток стрел!");
    }
}
