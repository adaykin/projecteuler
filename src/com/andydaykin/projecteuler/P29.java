package com.andydaykin.projecteuler;

import java.util.HashSet;

public class P29
{
    public static void main(String [] args)
    {
        HashSet<Double> combos = new HashSet<Double>();
        for(int a = 2; a <= 100; a++) {
            for(int b = 2; b <= 100; b++) {
                double combo = Math.pow(a, b);
                System.out.println(combo);
                combos.add(combo);
            }
        }

        System.out.println("Terms: " + combos.size());
    }
}

