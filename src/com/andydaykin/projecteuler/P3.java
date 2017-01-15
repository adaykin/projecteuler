package com.andydaykin.projecteuler;

/**
 * What is the largest prime factor of the number 600851475143?
 */
public class P3
{
    public static void main(String [] args)
    {
        long highest = 0;
        for(long i = 2; i <= 600851475143.0 / Math.sqrt(600851475143.0); i++) {
            if(isPrime(i)) {
                if(Math.ceil(600851475143.0 / i) == 600851475143.0 / (double)i) {
                    highest = i;
                }
            }
        }

        System.out.println("The largest prime factor of the number 600851475143 is: " + highest);
    }

    public static boolean isPrime(long num)
    {
        long limit = (long)Math.sqrt(num);

        for(long i = 2; i <= limit; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}