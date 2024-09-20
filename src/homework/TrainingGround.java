package homework;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Безымянный герой", 100);
        Enemy enemy = new Enemy(3000);
        hero.attackEnemy(enemy);

        Warrior warrior = new Warrior("Горн", 200);
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Мильтен", 180);
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Диего", 140);
        archer.attackEnemy(enemy);
    }
}
