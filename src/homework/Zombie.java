package homework;

public class Zombie extends Enemy {

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isDead()) {
            System.out.println("Он мертв!");
            return;
        }
        System.out.println("Зомби подбирается к герою!");
        hero.takeDamage(getDamage());
        System.out.println("Нанесено " + getDamage() + " урона!");
    }

    private void reincarnation() {
        if (!isAlive())
            setHealth(100);
        System.out.println("*Зомби снова ожил*");
    }

    public boolean getRandomReinc() {
        int i = (int) (Math.random() * 2);
        if (i != 0) return false;

        reincarnation();
        return true;
    }


}
