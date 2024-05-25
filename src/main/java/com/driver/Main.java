package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        RWOnly obj = new RWOnly(s);
        System.out.println(obj.getName());
        obj.setName("srinu1");
        System.out.println(obj.getName());
    }
  
}