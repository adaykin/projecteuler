package com.andydaykin.projecteuler;

/**
 * Find the sum of all even fibonacci numbers below 4000000
 */
public class P2
{
    public static void main(String [] args)
    {
        int total = 0;
        int fibNum = 0;
        int temp = 0;
        while(temp < 4000000) {
            temp = comp(fibNum);
            if(temp % 2 == 0) {
                total += temp;
            }
            System.out.println("Total now: " + temp);
            fibNum++;
        }

        System.out.println("Total of all fib's below 4000000: " + total);
    }

    public static int comp(int i)
    {
        if(i <= 1)
            return i;
        else
            return comp(i - 1) + comp(i - 2);
    }
}
