package homework;

public class Archer extends Hero {
    public Archer(String name, int startDamage) {
        super(name, startDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Лучник " + getName() + " атакует врага, выпуская поток стрел!");
        System.out.println("Нанесено " + getStartDamage() + " ед. урона!");
    }
}
