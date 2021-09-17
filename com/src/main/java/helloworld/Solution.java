package main.java.helloworld;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public int numTilePossibilities(String tiles) {
        char[] letters = tiles.toCharArray();
        boolean[] visited = new boolean[letters.length];
        List<String> result = new ArrayList<>();
        for (int k = 1; k <= tiles.length(); k++) {
            dfs(letters, new LinkedList<>(), result, k, 0);
        }
        return result.size();
    }

    private void dfs(char[] letters, LinkedList<Character> path, List<String> result, int k, int start) {

        if (path.size() ==k && !result.contains(path.toString())) {
            result.add(path.toString());
            System.out.println(path.toString());
            return;
        }

        for (int i = start; i < letters.length; i++) {
            path.add(letters[i]);
            dfs(letters, path, result, k, i+1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTilePossibilities("AAB"));
        /*
        Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
         */

    }


}
