package com.andydaykin.projecteuler;


public class P31
{
    private static int factors [] = {1, 2, 5, 10, 20, 50, 100, 200};
    private static int sum = 4;

    public static void main(String [] args)
    {
        System.out.println(findCombinationsCount(sum, 0));
    }

    public static int findCombinationsCount(int amount, int checkFromIndex) {
        if (amount == 0)
            return 1;
        else if (amount < 0 || factors.length == checkFromIndex)
            return 0;
        else {
            System.out.println("Check 1 " + amount);
            int withFirstCoin = findCombinationsCount(amount - factors[checkFromIndex], checkFromIndex);
            System.out.println("Check 2 " + amount);
            int withoutFirstCoin = findCombinationsCount(amount, checkFromIndex + 1);
            return withFirstCoin + withoutFirstCoin;
        }
    }
}

