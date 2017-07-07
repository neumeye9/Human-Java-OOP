class HumanTest{
    public static void main(String[] args){
        Human a = new Human();
        Human b = new Human();
        a.attack(b); 
        Wizard c = new Wizard();
        c.healHuman(b);
        c.useFireball(a);
        Ninja d = new Ninja();
        d.steal(b);
        d.runAway();
        Samurai e = new Samurai();
        e.deathBlow(a);
        e.meditate();
        Samurai f = new Samurai();
        f.howMany();
        Samurai.howMany();
    }
}