package homework;

public class Warrior extends Hero {
    private int up = 100;

    private boolean isUlti = false;
    public Warrior(String name, int health, int startDamage) {
        super(name, health, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isDead()) {
            System.out.println("Он умер");
            return;
        }
        System.out.print("Воин " + getName() + " атакует врага, занося свой клинок над его головой!");
        enemy.takeDamage(getStartDamage());
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");

        checkDamage();
        checkAlive();
    }


    public void castUlti() {
        if (!isUlti) {
            isUlti = true;
            upDamage();
        }
    }

    private void upDamage() {
        setStartDamage(getDamage() + up);
    }

    public void downDamage() {
        setStartDamage(getDamage());
    }
}
