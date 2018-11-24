package main.java.datastructures.recursiondp;

/**
 * Created by Kannan on 11/24/2018.
 */
public class Nstep {
    public static void main(String[] args) {
        Nstep nstep = new Nstep();
        int n=5;
        System.out.println(nstep.countWaysRecursion(n));

        int[] mem = new int[n+1];
        System.out.println(nstep.countWaysRecursionMemoized(n, mem));
    }

    private int countWaysRecursionMemoized(int i, int[] mem) {
        if(i<=0)
        {
            return 0;
        }
        else if(i==1 || i==2)
        {
            mem[i]=i;
        }
        else if(i==3)
        {
            mem[i]=4;
        }
        else if(mem[i]==0)
        {
            mem[i]= countWaysRecursionMemoized(i - 1, mem) + countWaysRecursionMemoized(i - 2, mem) + countWaysRecursionMemoized(i - 3, mem);
        }
        return mem[i];
    }

    private int countWaysRecursion(int i) {
        if(i<=0)
        {
            return 0;
        }
        if(i==1 || i==2)
        {
            return i;
        }
        if(i==3)
        {
            return 4;
        }
        return countWaysRecursion(i-1) + countWaysRecursion(i-2) + countWaysRecursion(i-3);
    }
}
