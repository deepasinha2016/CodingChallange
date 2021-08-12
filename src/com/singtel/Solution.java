package com.singtel;

import com.singtel.factory.ObjFactory;
import com.singtel.model.*;

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
        System.out.println(fish.toString());
        Shark shark = new Shark();
        shark.eat();
        fish = obj.getInstanceForFish("clownfish");
        System.out.println(fish.toString());
        Animal animal = obj.getInstanceForAnimal("Butterfly");
        //count
        int flyCount =0;

        int singCount =0;
        int walkCount =0;
        Animal[] animals = new Animal[]{

                new Dog(),
                new Butterfly(),
                new Cat()
        };
        Bird[] birds = new Bird[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot()
        };
       Fish[] fishes = new Fish[]{
               new Fish(),
               new Shark(),
               new ClownFish()
       };
       int swimCount = fishes.length;

        for (Animal anm:
             animals) {
            if(anm.isCanFly()) flyCount++;
            if(anm.isCanWalk()) walkCount++;

        }
        for (Bird b:
             birds) {
            if(b.isCanFly()) flyCount++;
            if(b.isCanSwim()) swimCount++;
            if(b.isCanSing()) singCount++;
        }

    System.out.println("Number of species that can walk:" + walkCount );
        System.out.println("Number of species that can sing:" + singCount );
        System.out.println("Number of species that can swim:" + swimCount );
        System.out.println("Number of species that can fly:" + flyCount );
    }

}
