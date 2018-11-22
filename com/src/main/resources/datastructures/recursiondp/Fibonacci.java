package main.resources.datastructures.recursiondp;

/**
 * Created by Kannan on 11/22/2018.
 */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n=6;

        int[] mem = new int[n+1];

        System.out.println(fibonacci.recursion(n));
        System.out.println(fibonacci.dpTopDown(n, mem));
        System.out.println(fibonacci.dpBottomUp(n));
    }

    private int dpBottomUp(int n) {
        int mem[] = new int[n+1];
        mem[0]=0;
        mem[1]=1;
        for (int i=2;i<=n;i++)
        {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }

    private int dpTopDown(int i, int[] mem) {
        if(i==0 || i ==1)
        {
            return i;
        }
        if(mem[i]==0)
        {
            return dpTopDown(i - 1, mem)+ dpTopDown(i - 2, mem);
        }
        return mem[i];
    }

    private int recursion(int i) {
        if(i==0 || i ==1)
        {
            return i;
        }
        return recursion(i-1)+recursion(i-2);
    }
}
