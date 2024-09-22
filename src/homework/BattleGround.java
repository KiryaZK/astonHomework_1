package homework;

public class BattleGround {
    public static void main(String[] args) {
        Warrior w = new Warrior("Drago", 300, 100);
        Necromancer z = new Necromancer(300, 100);
        z.callUlt(w);
        w.attackEnemy(z);
        w.castUlti();
        w.attackEnemy(z);
        w.downDamage();
        z.attackHero(w);

    }
}
