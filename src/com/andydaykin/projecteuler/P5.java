package com.andydaykin.projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class P5
{
    public static void main(String [] args)
    {
        int i = 20;
        while(true) {
            int remZero = 0;
            for(int j = 1; j <= 20; j++) {
                if(i % j == 0) {
                    remZero++;
                }
            }

            if(remZero == 20) {
                break;
            }

            i++;
        }

        System.out.println("The smallest positive number evenly divisible by 1-20 is: " + i);
    }
}
