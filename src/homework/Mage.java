package homework;

public class Mage extends Hero {
    public Mage(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        System.out.print("кастуя сокрушительное заклинание!");
    }
}
