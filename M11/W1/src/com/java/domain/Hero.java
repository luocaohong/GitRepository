package com.java.domain;

public class Hero implements Arms{
    private String name;
    private Integer HP = 100;
    private Integer grade = 1;

    public Hero(String name,Integer grade) {
        this.name = name;
        if(grade == 2){
            this.HP = 200;
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getGrade() {
        if(this.HP < 0){
            this.HP = 0;
        }
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void battle(Hero hero){
        hero.setHP(hero.getHP() - 10);
        System.out.print(this.name + "打了" + hero.getName() + "10HP");
        System.out.println(hero.getName() + "还剩余" + hero.getHP() + "HP");
    }

    public void battle(Hero hero,BigAttack attack ){
        hero.setHP(hero.getHP() - 10);
        hero.setHP(hero.getHP() - attack.value);
        System.out.print(this.name + "打了" + hero.getName() + (10+attack.value) + "HP,");
        System.out.println(hero.getName() + "还剩余" + hero.getHP() + "HP");
    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void arms() {
        System.out.println(this.name + "装备了一把屠龙剑");
    }
}
