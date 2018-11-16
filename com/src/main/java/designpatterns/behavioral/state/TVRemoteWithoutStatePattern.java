package main.java.designpatterns.behavioral.state;

/**
 * Created by Kannan on 11/15/2018.
 */

//states tightly coupled with client - can't be scaled to add more states.
public class TVRemoteWithoutStatePattern {
    private String state="";

    public void setState(String state){
        this.state=state;
    }

    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String args[]){
        TVRemoteWithoutStatePattern remote = new TVRemoteWithoutStatePattern();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
}
