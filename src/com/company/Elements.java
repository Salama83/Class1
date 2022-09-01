package com.company;

public enum Elements {
    H("Водород",1 ),
    Li ("Литий", 3),
    B ("Бор", 5),
    C ("Угрелод", 6);

    private String name;
    private  int series;

    public  String getName(){
        return name;
    }
    public int getSeries(){
        return series;
    }
    Elements( String name, int series){
        this.series = series;
        this.name = name;
    }
    }

