package Skills;
import Hero.Hero;
import java.util.Random;

public class ShieldBash extends Skills {
    Random rand = new Random();
    public ShieldBash(){
        super("ShieldBash");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt(hero.defense + hero.power / 2 + 1) + 10;
        System.out.println(hero.name + " uses ShieldBash skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}
