package main.java.helloworld;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

    public static int kthGrammar(int n, int k) {

        if (n==1 && k==1) return 0;

        String prev = "0";
        String curr = "";
        for (int i=2;i<=n; i++)
        {
            curr = "";
            for (int j=0; j<prev.length(); j++)
            {
                curr = curr + transform(prev.charAt(j));
            }
            System.out.println(i+" : "+curr);
            prev=curr;
        }

        return Character.getNumericValue(curr.charAt(k-1));

    }

    public static String transform(char c)
    {
        return Character.getNumericValue(c)==0 ? "01" : "10";
    }
    public static void main(String[] args)
    {
        kthGrammar(10,3);
    }
}

