package com.leetcode.JJMiao;

public class PasswordCreation {
    public static void main(String[] args) {
        String s1 = "hackerrank";
        String s2 = "mountain";


        System.out.println(mergeString(s1, s2));

    }
    public static String mergeString (String s1, String s2){
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < s1.length() || i < s2.length(); i++) {


            if (i < s1.length())
                result.append(s1.charAt(i));


            if (i < s2.length())
                result.append(s2.charAt(i));
        }

        return result.toString();

    }
}
