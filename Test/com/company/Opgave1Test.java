package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave1Test {

    @Test
    public void f() {
        Opgave1 op1 = new Opgave1();
        int res = op1.f(1);
        assertEquals(1,res);
    }

    @Test
    public void udskriv() {
        Opgave1 op1 = new Opgave1();
        boolean res = op1.udskriv(69,"nej");
        assertEquals(false,res);
    }
}