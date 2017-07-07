import java.util.*;

class Wizard extends Human{
    int health = 50;
    int intelligence = 8;

    public void healHuman(Human human){
        human.health += this.intelligence;
        System.out.println("Healed another human, increased their health to:" + this.intelligence);
    }

    public void useFireball(Human human){
        int fire = this.intelligence * 3;
        human.health -= fire;
        System.out.println("Used fireball, decreased their health to:" + fire);
    }

}
