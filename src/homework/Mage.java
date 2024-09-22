package homework;

public class Mage extends Hero {
    private int plusHealth = 50;
    public Mage(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isDead()) {
            System.out.println("Он умер");
            return;
        }
        System.out.print("Маг " + getName() + " атакует врага, кастуя сокрушительное заклинание!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");

        checkDamage();
        checkAlive();
    }

    public void healFriend(Hero hero) {
        System.out.println("Отхилил " + hero.getName());
        if (getHealth() + plusHealth > getHealthStarter()) {
            setHealth(getHealthStarter());
            return;
        }

        setHealth(getHealth() + plusHealth);
    }
}
