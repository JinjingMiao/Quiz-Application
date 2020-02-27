package com.leetcode.JJMiao;

public class BreakAPalindrome {
    public static String breakPalindrome(String palindrome) {
        char[] s = palindrome.toCharArray();
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            if (s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        s[n - 1] = 'b'; //if all 'a'
        return n < 2 ? "" : String.valueOf(s);
    }
    public static void main(String[] args) {

        String palindrome = "abccba";

        System.out.println(breakPalindrome(palindrome));

    }
}
