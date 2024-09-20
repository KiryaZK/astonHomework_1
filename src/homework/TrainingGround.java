package homework;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(3000);
        Warrior warrior = new Warrior("Горн", 200);
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Мильтен", 180);
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Диего", 140);
        archer.attackEnemy(enemy);
    }
}
