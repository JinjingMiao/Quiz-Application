package com.leetcode.JJMiao;

public class DeleteSubStrings {
    public static void main(String[] args) {
        String s = "aabb";
        String t = "ab";


        System.out.println(removeSubstring(s, t));

    }
    public static int removeSubstring(String s, String t) {
        return dfs(s, t, 0);
    }

    private static int dfs(String s, String t, int count) {
        if (!s.contains(t)) {
            return count;
        }

        int maxCount = 0, n=t.length();
        for(int i=0; i<s.length(); i++){
            if(s.substring(i).contains(t)){
                maxCount = Math.max(maxCount, dfs(s.substring(0, i)+s.substring(i+n), t, count+1));
            }
        }
        return maxCount;
    }

}
