package com.andydaykin.projecteuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class P10
{
    public static void main(String [] args)
    {
        long sum = 0;
        for(int i = 2; i < 2000000; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
    }

    public static boolean isPrime(int num)
    {
        int limit = (int)Math.sqrt(num);

        for(int i = 2; i <= limit; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

