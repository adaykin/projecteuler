package com.andydaykin.projecteuler;

/**

 The following iterative sequence is defined for the set of positive integers:

 n -> n/2 (n is even)
 n -> 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:
 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers
 finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.

 */

public class P14
{
    public static void main(String [] args)
    {
        int longestChain = 0;
        int n = 999168;
        int longestStartingNum = 0;

        while(n > 0) {
            long i = n;

            int chains = 0;
            while(i != 1) {
                if(i % 2 == 0) {
                    i = i / 2;
                    chains++;
                }
                else {
                    i = i * 3 + 1;
                    chains++;
                }
            }

            if(chains > longestChain) {
                longestChain = chains;
                longestStartingNum = n;
            }

            n--;
        }

        System.out.println("The longest starting number is: " + longestStartingNum);
    }
}
