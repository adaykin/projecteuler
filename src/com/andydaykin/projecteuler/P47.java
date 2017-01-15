package com.andydaykin.projecteuler;


public class P47
{
    public static void main(String [] args)
    {
        boolean found = false;
        int countFactors = 0;
        int i = 650;
        while(!found) {
            if(hasFourUniqPrimeFactors(i)) {
                countFactors++;
            }
            else {

            }


            if(countFactors == 4) {
                found = true;
            }

            i++;
        }

        System.out.println(i - 4);
    }

    public static boolean hasFourUniqPrimeFactors(int i)
    {

        return false;
    }
}
