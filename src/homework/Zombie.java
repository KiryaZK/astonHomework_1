package homework;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби подбирается к герою!");
        hero.takeDamage(getDamage());
        System.out.println("Нанесено " + getDamage() + " урона!");
    }
}
