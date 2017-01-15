package com.andydaykin.projecteuler;

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class P6
{
    public static void main(String [] args)
    {
        int total = 0;
        int sqTotal = 0;
        for(int i = 1; i <= 100; i++) {
            total += i;
            sqTotal += (int)Math.pow(i, 2);
        }

        int difference = (int)Math.pow(total, 2) - sqTotal;

        System.out.println("The difference between the squres and the square of the sum is: " + difference);
    }
}
