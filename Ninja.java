import java.util.*;

class Ninja extends Human{
    int stealth = 10;

    public void steal(Human human){
        human.health -= human.stealth;
        System.out.println("Stole from another human, decreased their health to:" + human.stealth);
    } 

    public void runAway(){
        health -= 10;
        System.out.println("Ran away, decreased your health to:" + health);
    }


}