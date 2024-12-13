package com.qapitol.designpatterns;

public class Controller {

    public static void main(String[] args) {

        SingletonDesignPatterns design = SingletonDesignPatterns.getInterface();

        SingletonDesignPatterns sdp1 = new SingletonDesignPatterns();
        SingletonDesignPatterns sdp2 = new SingletonDesignPatterns();

        if (sdp1.equals(sdp2)){
            System.out.println("Objects are same");
        }
        else {
            System.out.println("Objects are different");
        }
    }
}
