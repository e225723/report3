package jp.ac.uryukyu.ie.e225723;

import jp.ac.uryukyu.Livingthing;

public class Warrior extends Livingthing{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(Livingthing opponent2){
        if(!getdead()){
            int damage = (int)(getattack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getname(), opponent2.getname(), damage);
            opponent2.wounded(damage);
        }
    }
}
