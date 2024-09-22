package homework;

public class Zombie extends Enemy {

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби подбирается к герою!");
        hero.takeDamage(getDamage());
        System.out.println("Нанесено " + getDamage() + " урона!");
    }

    private void reincarnation() {
        System.out.println("Я снова живу!");
        if (!isAlive())
            setHealth(100);
        System.out.println("*Зомби снова ожил*");
    }

    public void getRandomReinc() {
        int i = (int) (Math.random() * 2);
        if (i != 1) return;

        reincarnation();
    }

}
