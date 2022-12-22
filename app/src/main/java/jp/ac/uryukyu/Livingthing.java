package jp.ac.uryukyu;

public class Livingthing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public Livingthing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean getdead(){
        return dead;
    }
    public String getname(){
        return name;
    }
    public int gethitPoint(){
        return hitPoint;
    }
    public void sethitPoint(int x){
        hitPoint = x;
    }
    public void setdead(boolean y){
        dead = y;
    }
    public int getattack(){
        return attack;
    }
    
    public void attack(Livingthing opponent){
        if(!dead){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getname(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
