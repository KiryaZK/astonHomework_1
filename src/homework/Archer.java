package homework;

public class Archer extends Hero {
    public Archer(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        System.out.print("Лучник " + getName() + " атакует врага, выпуская поток стрел!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");

        checkDamage();
    }
}
