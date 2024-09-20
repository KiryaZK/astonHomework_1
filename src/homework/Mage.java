package homework;

public class Mage extends Hero {
    public Mage(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг " + getName() + " атакует врага, кастуя сокрушительное заклинание!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");
    }
}
