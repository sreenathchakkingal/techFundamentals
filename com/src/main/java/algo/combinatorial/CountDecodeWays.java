package main.java.algo.combinatorial;

import main.java.helloworld.Solution;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDecodeWays {
    private static final List<String> LETTERS = IntStream.range(1, 27).mapToObj(Integer::toString).collect(Collectors.toList());

    public static int countDecodeWays(String digits) {
//        return dfs(0, digits);
        return 0;
    }

//    public stati

    public static void main(String[] args) {
        String[] inputs = {"12", "123", "11223"};
        for (int i = 0; i<inputs.length; i++) {
            System.out.println("Decode ways : " + CountDecodeWays.countDecodeWays(inputs[i]));
        }

    }
}
