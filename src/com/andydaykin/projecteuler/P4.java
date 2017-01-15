package com.andydaykin.projecteuler;

import java.util.Stack;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ◊ 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P4
{
    public static void main(String [] args)
    {
        int highest = 0;
        for(int i = 100; i <= 999; i++) {
            for(int j = 100; j <= 999; j++) {
                if(isPalindrome(i * j)) {
                    System.out.println("i: " + i + "\tj: " + j);
                    if(i * j > highest) {
                        highest = i * j;
                    }
                }
            }
        }

        System.out.println("The highest palindrome made from the product of two 3-digit numbers is: " + highest);
    }

    public static boolean isPalindrome(int num)
    {
        String strNum = String.valueOf(num);
        Stack<Character> chars = new Stack<Character>();
        int start = (strNum.length() % 2 == 0) ? strNum.length() / 2 : strNum.length() / 2 + 1;
        for(int i = 0; i <= strNum.length() / 2 - 1; i++) {
            chars.push(strNum.charAt(i));
        }
        for(int i = start; i < strNum.length(); i++) {
            char temp = chars.pop();
            if(temp != strNum.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}