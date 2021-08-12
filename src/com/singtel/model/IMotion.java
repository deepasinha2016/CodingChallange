package com.singtel.model;

public interface IMotion {

   default void fly(){
     System.out.println("I can fly");
    }

     default void walk(){
        System.out.println("I can fly");
    }


    default  void swim(){
        System.out.println("I can swim");
    }

}
