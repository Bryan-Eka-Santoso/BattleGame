package Skills;
import Hero.Hero;
import java.util.Random;

public class LightningStrike extends Skills {
    Random rand = new Random();
    public LightningStrike(){
        super("LightningStrike");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt((hero.power + hero.agility) - enemy.defense + 1) + 45;
        System.out.println(hero.name + " uses LightningStrike skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}
