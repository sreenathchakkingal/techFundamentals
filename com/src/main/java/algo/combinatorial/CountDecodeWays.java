package main.java.algo.combinatorial;

import main.java.helloworld.Solution;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDecodeWays {
    private static final List<String> LETTERS = IntStream.range(1, 27).mapToObj(Integer::toString).collect(Collectors.toList());
    public static int count=0;
    public static int countDecodeWays(String digits) {
        int count=0;
        return dfs(digits, new StringBuilder(), count);
    }
    public static int dfs(String digits, StringBuilder track, int count)
    {
       if(track.toString().equals(digits))
        {
            count++;
            return count;
        }
        for (int i=0;i<LETTERS.size(); i++)
        {
            if(digits.length()<track.length())
            {
               continue;
            }
            track.append(LETTERS.get(i));
            count = dfs(digits,  track, count);
            track.delete(track.length()-LETTERS.get(i).length(), track.length());
        }
        return count;
    }


    public static void main(String[] args) {
        String[] inputs = {"12", "123", "11223"};
        for (int i = 0; i<inputs.length; i++) {
            System.out.println("Decode ways : " + CountDecodeWays.countDecodeWays(inputs[i]));
        }

    }
}
