package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class Context {

    public String convertIntToBinary(int i)
    {
        return Integer.toBinaryString(i);
    }

    public String convertIntToHex(int i)
    {
        return Integer.toHexString(i);
    }

}
