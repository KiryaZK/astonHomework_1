package homework;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Безымянный герой");
        hero.attackEnemy();

        Warrior warrior = new Warrior("Горн");
        warrior.attackEnemy();
        Mage mage = new Mage("Мильтен");
        mage.attackEnemy();
        Archer archer = new Archer("Диего");
        archer.attackEnemy();
    }
}
