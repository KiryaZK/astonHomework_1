package homework;

public class Necromancer extends Enemy {
    public Necromancer(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isDead()) {
            System.out.println("Он умер");
            return;
        }
        System.out.println("Некромант атакует героя!");
        hero.takeDamage(getDamage());
        System.out.println("Нанесено " + getDamage() + " урона!");
    }

    public void callUlt(Hero hero) {
        System.out.println("Некромант ослабил " + hero.getName());
        damageReduction(hero);
    }

    private void damageReduction(Hero hero) {
        hero.setStartDamage(0);
    }
}
