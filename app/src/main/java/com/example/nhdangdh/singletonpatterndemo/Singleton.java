package com.example.nhdangdh.singletonpatterndemo;

/**
 * Created by nhdangdh on 7/14/2017.
 */

public class Singleton {

    private static Singleton instance;
    private String name;

    private Singleton(){

    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
