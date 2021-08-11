package com.singtel;

import com.singtel.factory.ObjFactory;
import com.singtel.model.Bird;
import com.singtel.model.Fish;
import com.singtel.model.Shark;

public class Solution {

    public static void main(String[] args) {
        ObjFactory obj = new ObjFactory();
        Bird bird = obj.getInstanceForBird("Duck");
        bird.sing();
        bird.fly();
        bird.swim();
        bird = obj.getInstanceForBird("chicken");
        bird.sing();
        bird = obj.getInstanceForBird("rooster");
        bird.sing();
       Fish fish = obj.getInstanceForFish("Shark");
       fish.swim();
        System.out.println(fish.getColor());
        Shark shark = new Shark();
        shark.eat();

    }

}
