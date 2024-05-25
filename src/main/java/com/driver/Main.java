package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("srinu");
        System.out.println(obj.getName());
        obj.setName("srinu1");
        System.out.println(obj.getName());
    }
  
}