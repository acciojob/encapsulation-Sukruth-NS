package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setName("Bokuto");
        System.out.println(obj.getName());
    }
}