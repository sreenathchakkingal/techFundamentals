package main.java.helloworld;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public int numTilePossibilities(String tiles) {
        char[] letters = tiles.toCharArray();
        boolean[] visited = new boolean[letters.length];
        Set<String> result = new HashSet<>();
        for (int k = 1; k <= tiles.length(); k++) {
            dfs(letters, new LinkedList<>(), result, k, visited);
        }
//        dfs(letters, new LinkedList<>(), result, 2, visited);
        return result.size();
    }

    private void dfs(char[] letters, LinkedList<Character> path, Set<String> result, int k, boolean[] visited) {

        if (path.size() ==k ) {
            result.add(path.toString());
            return;
        }

        for (int i = 0; i<letters.length; i++) {
            if(visited[i]) continue;
            path.add(letters[i]);
            visited[i]=true;
            dfs(letters, path, result, k, visited);
            path.removeLast();
            visited[i]=false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTilePossibilities("AAB"));
        /*
        Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
         */

    }


}
