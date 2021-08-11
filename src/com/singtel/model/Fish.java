package com.singtel.model;

public class Fish implements  IFish{

    private String color,size;

    public Fish(){

    }
    public Fish(String color, String size){
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
