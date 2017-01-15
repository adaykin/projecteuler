package com.andydaykin.projecteuler;

/**
 * What is the 10001(st) prime number?
 */
public class P7
{
    public static void main(String [] args)
    {
        int i = 2;
        int primesFound = 0;
        while(true) {
            if(isPrime(i)) {
                //System.out.println(i);
                primesFound++;
            }

            if(primesFound == 10001) {
                break;
            }

            i++;
        }

        System.out.println("The " + primesFound + " prime number is: " + i);
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

