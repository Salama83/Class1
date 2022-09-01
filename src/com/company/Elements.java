package com.company;

public enum Elements {
    H("Водород",1 ),
    Li ("Литий", 3),
    B ("Бор", 5),
    C ("Угрелод", 6);

    private final String name;
    private final int series;

    public  String getName(){
        return name;
    }
    public int getSeries(){
        return series;
    }
    Elements( String name, int series){
        this.series = series;
        this.name = name;
        System.out.println();
    }
    }

