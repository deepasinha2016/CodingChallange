package com.singtel.model;

public class Fish {

    private String color,size;

    public Fish(){

    }
    public Fish(String color, String size){
        this.color = color;
        this.size = size;
    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
