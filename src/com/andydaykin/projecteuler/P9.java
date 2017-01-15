package com.andydaykin.projecteuler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^(2) + b^(2) = c^(2)
 * For example, 3^(2) + 4^(2) = 9 + 16 = 25 = 5^(2).
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class P9
{
    public static void main(String [] args)
    {
        for(int i = 1; i < 333; i++) {
            int ii = i * i;

            for(int j = i + 1; j < 498; j++) {
                int jj = j * j;

                for(int k = j + 1; k < 998; k++) {
                    int kk = k * k;

                    if(ii + jj == kk) {
                        if(i + j + k == 1000) {
                            int product = i * j * k;
                            System.out.println("Winner for i: " + i + " j: " + j + " k: " + k + " with a product of: " + product);
                        }
                    }
                }
            }
        }
    }
}
