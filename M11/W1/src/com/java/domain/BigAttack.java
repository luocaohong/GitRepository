package com.java.domain;

public enum BigAttack {
    A(10),B(20),C(30),D(40),E(50);

    public final  int value;

    BigAttack(int value) {
        this.value = value;
    }
}
