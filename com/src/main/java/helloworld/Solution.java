package main.java.helloworld;

import java.lang.reflect.Array;
import java.util.*;
public class Solution {

    public static boolean wordBreak(String s, String[] words) {
        return dfs(s, words, new StringBuilder());
    }

    public static boolean dfs(String s, String[] words, StringBuilder track)
    {
        if(track.toString().equals(s))
        {
//            result.add(track.toString());
            return true;
        }
        boolean flag=false;
        for (String word: words)
        {
            if(track.length()+word.length()>s.length() || !s.startsWith(track.toString()))
            {
                continue;
            }
            track.append(word);
            flag = flag || dfs(s, words, track);

            track.delete(track.length()-word.length(), track.length());
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(Solution.wordBreak("blaheducativeio", new String[]{"educative", "io"}));

    }



}
