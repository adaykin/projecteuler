package com.andydaykin.projecteuler;


public class P35
{
    public static void main(String [] args)
    {
        for(int i = 0; i < 1000000; i++) {

        }
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

    public static int[] getRotations(int number)
    {
        int [] rotations = new int[5];

        return rotations;
    }
}

