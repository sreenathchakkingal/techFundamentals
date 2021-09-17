package main.java.algo.combinatorial;

import main.java.helloworld.Solution;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Character>> permute(char[] letters) {
        List<List<Character>> res = new ArrayList<>();
        boolean[] visited = new boolean[letters.length];
        dfs(new ArrayList<>(), res, letters, visited);
        return res;
    }

    private static void dfs(List<Character> path, List<List<Character>> res, char[] letters, boolean[] visited) {
        if (path.size() == letters.length) {
            // make a deep copy since otherwise we'd be append the same list over and over
            res.add(new ArrayList<Character>(path));
            return;
        }

        for (int i = 0; i < letters.length; i++) {
            // skip used letters
            if(visited[i]) continue;
            path.add(letters[i]);
            visited[i]=true;
            dfs(path, res, letters, visited);
            path.remove(path.size() - 1);
            visited[i]=false;
        }
    }

    public static void main(String[] args) {
        String input = "aa";
        System.out.println("Permutations : " + Permutation.permute(input.toCharArray()));
    }
}
