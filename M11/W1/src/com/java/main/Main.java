package com.java.main;

import com.java.domain.BigAttack;
import com.java.domain.Hero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero tom = new Hero("Tom",1);
        Hero bob = new Hero("Bob", 2);
        bob.arms();
        tom.battle(bob,BigAttack.B);
        bob.battle(tom, BigAttack.A);

    }
}
