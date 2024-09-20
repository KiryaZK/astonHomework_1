package homework;

public class Mage extends Hero {
    public Mage(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг " + getName() + " атакует врага, кастуя сокрушительное заклинание!");
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");
    }
}
