package com.company;

public class Main {
    public static void main(String[] args) {

     for (Elements item: Elements.values()) {
            System.out.println(item.getName());
         System.out.println(item.getSeries());
         System.out.println();
        }
    }
} 
