package com.singtel;

import com.singtel.factory.ObjFactory;
import com.singtel.model.Bird;

public class Solution {

    public static void main(String[] args) {
        ObjFactory obj = new ObjFactory();
        Bird bird = obj.getInstance("Duck");
        bird.sing();
        bird.fly();
        bird.swim();
        bird = obj.getInstance("chicken");
        bird.sing();
        bird.fly();
        bird.swim();
        bird = obj.getInstance("rooster");
        bird.sing();
        bird.fly();
        bird.swim();

    }

}
