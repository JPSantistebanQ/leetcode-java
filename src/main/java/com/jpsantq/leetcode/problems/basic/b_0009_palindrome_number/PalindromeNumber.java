package com.jpsantq.leetcode.problems.basic.b_0009_palindrome_number;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        String text = String.valueOf(x);
        int length = text.length();
        int mitad = (int) length / 2;
        int par = length % 2 == 0 ? 0 : 1;
        String a = text.substring(0, mitad);
        String b = text.substring(mitad+par, length);
        b = new StringBuilder(b).reverse().toString();
        //System.out.println(a);
        //System.out.println(b);
        return a.equals(b);
    }
}
