package com.example.networking;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;

    public String getInfo() {
        return "Mountain" +
                ", Name= " + name +
                ", Type= " + type +
                ", Location= " + location;
    }

    @Override
    public String toString() {
        return name;
    }


}
