package com.andydaykin.projecteuler;

/**
 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 */

import java.math.*;

public class P16
{
    public static void main(String [] args)
    {
        BigInteger x = new BigInteger("2");
        String str = String.valueOf(x.pow(1000));
        int total = 0;
        for(int i = 0; i < str.length(); i++) {
            total += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println("The total of all the digits is: " + total);
    }
}
