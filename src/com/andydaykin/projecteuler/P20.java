package com.andydaykin.projecteuler;

/**
 n! means n x (n - 1) x ... x 3 x 2 x 1

 For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
 and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

 Find the sum of the digits in the number 100!

 */

import java.math.*;

public class P20
{
    public static void main(String [] args)
    {
        BigInteger x = new BigInteger("100");
        x = fact(x);
        System.out.println(x);
        String res = String.valueOf(x);
        int total = 0;
        for(int i = 0; i < res.length(); i++) {
            total += Integer.parseInt(String.valueOf(res.charAt(i)));
        }

        System.out.println("total: " + total);

    }

    public static BigInteger fact(BigInteger x)
    {
        if(x.longValue() <= 1) {
            return new BigInteger("1");
        }
        else {
            return x.multiply(fact(x.subtract(new BigInteger("1"))));
        }
    }
}

