package main.java.algo.combinatorial;

import main.java.helloworld.Solution;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Character>> permute(char[] letters) {
        List<List<Character>> res = new ArrayList<>();
        dfs(new ArrayList<>(), res, letters);
        return res;
    }

    private static void dfs(List<Character> path, List<List<Character>> res, char[] letters) {
        if (path.size() == letters.length) {
            // make a deep copy since otherwise we'd be append the same list over and over
            res.add(new ArrayList<Character>(path));
            return;
        }

        for (int i = 0; i < letters.length; i++) {
            // skip used letters
            if (path.contains(letters[i])) continue;
            path.add(letters[i]);
            dfs(path, res, letters);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations : " + Permutation.permute(input.toCharArray()));
    }
}
