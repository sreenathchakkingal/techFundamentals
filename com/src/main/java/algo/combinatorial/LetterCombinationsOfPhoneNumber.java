package main.java.algo.combinatorial;

import main.java.helloworld.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    private static final Map<Character, char[]> KEYBOARD = new HashMap<>();
    static {
        KEYBOARD.put('2', "abc".toCharArray());
        KEYBOARD.put('3', "def".toCharArray());
        KEYBOARD.put('4', "ghi".toCharArray());
        KEYBOARD.put('5', "jkl".toCharArray());
        KEYBOARD.put('6', "mno".toCharArray());
        KEYBOARD.put('7', "pqrs".toCharArray());
        KEYBOARD.put('8', "tuv".toCharArray());
        KEYBOARD.put('9', "wxyz".toCharArray());
    }
    public static List<String> letterCombinationsOfPhoneNumber(String digits) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<String> result = new ArrayList<String>();
        char[] digitsArray = digits.toCharArray();
        dfs(digitsArray, result, new StringBuilder());
        return result;
    }

    public static void dfs(char[] digitsArray, List<String> result, StringBuilder track)
    {
        if (track.length()==digitsArray.length)
        {
            result.add(track.toString());
            return;
        }

        char digit = digitsArray[track.length()];
        for (char letter : KEYBOARD.get(digit))
        {
            track.append(letter);
            dfs(digitsArray, result, track);
            track.deleteCharAt(track.length()-1);
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"56"};//, "23", "235"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Letter combinations of phone number : " + LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(inputs[i]));
        }
    }
}
