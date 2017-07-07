import java.util.*;

class Samurai extends Human{
    int health = 200;
    protected static int counter;

    public Samurai(){
        counter ++;
    }
    
    public void deathBlow(Human human){
        human.health = 0;
        this.health = health/2;
        System.out.println("Used death blow, the other human's health is:" + human.health + "This human's health is now:" + this.health);
    }

    public void meditate(){
        health = 200;
        System.out.println("Successfully meditated, health is back to:" + health);
    }

    public static int howMany(){
        System.out.println("There are " + counter + " samurai.");
        return counter;
    }


}