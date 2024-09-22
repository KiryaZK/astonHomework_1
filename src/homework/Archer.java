package homework;

public class Archer extends Hero {
    public Archer(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isDead()) {
            System.out.println("Он умер");
            return;
        }
        System.out.print("Лучник " + getName() + " атакует врага, выпуская поток стрел!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");
        checkDamage();

        if (randomSecondPunch()) {
            System.out.println("Вторая атака!");
            enemy.takeDamage(getStartDamage());
        }

        checkDamage();
        checkAlive();
    }

    private boolean randomSecondPunch() {
        return (int) (Math.random() * 2) != 0;
    }
}
