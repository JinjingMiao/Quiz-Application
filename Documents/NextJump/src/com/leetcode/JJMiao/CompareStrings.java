package com.leetcode.JJMiao;

public class CompareStrings {
    public static void main(String[] args) {
        String a[] = {"one", "two", "three"};
        int n = 3;

        System.out.println(concatenateString(a,n));

    }
    static void sort(String a[], int n)
    {


        for(int i = 0;i < n;i++)
        {
            for(int j = i + 1;j < n;j++)
            {


                if((a[i] + a[j]).compareTo(a[j] + a[i]) > 0)
                {
                    String s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
    }

    static String concatenateString(String a[], int n)
    {


        sort(a,n);


        String answer = "";
        for (int i = 0; i < n; i++)
            answer += a[i];

        return answer;
    }


}
