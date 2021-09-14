package main.java.helloworld;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Kannan on 10/11/2018.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String[] words = sentence.split("\\s");
        String eachWord="";


        for (int i=0;i<words.length; i++)
        {
            if(i%2==0)
            {
                eachWord=words[i];
                String eachWordRev="";
                for (int j=eachWord.length()-1;j>=0;j--)
                {
                    eachWordRev = eachWordRev+eachWord.charAt(j);
                }
                words[i]=eachWordRev;
            }
        }
        for(String each: words)
        {
            System.out.print(each+" ");
        }


    }
}
