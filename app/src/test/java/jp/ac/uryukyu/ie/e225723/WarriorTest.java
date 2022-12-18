package jp.ac.uryukyu.ie.e225723;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 450, 10);
        demoHero.attackWithWeponSkill(slime);
        demoHero.attackWithWeponSkill(slime);
        demoHero.attackWithWeponSkill(slime);
        slime.attack(demoHero);
        assertEquals(150,demoHero.attack*1.5 );
    }
}
