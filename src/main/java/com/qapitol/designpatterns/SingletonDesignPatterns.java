package com.qapitol.designpatterns;

public class SingletonDesignPatterns {

    private static SingletonDesignPatterns singletonDesignPatterns;

    SingletonDesignPatterns() {
    }

    public static SingletonDesignPatterns getInterface() {

        if (singletonDesignPatterns == null){
            SingletonDesignPatterns singletonDesignPatterns = new SingletonDesignPatterns();
            return singletonDesignPatterns;
        }
        return singletonDesignPatterns;
    }
}
