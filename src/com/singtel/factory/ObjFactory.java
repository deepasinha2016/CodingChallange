package com.singtel.factory;

import com.singtel.model.*;

public class ObjFactory {
        public Bird getInstanceForBird(String str){

            if(str.equalsIgnoreCase("Duck"))
                return new Duck();
            else if(str.equalsIgnoreCase("Chicken"))
                return new Chicken();
            else if(str.equalsIgnoreCase("Rooster"))
                return new Rooster();
            else
                return new Bird(false,false,false);

        }

        public Fish getInstanceForFish(String str){
            if(str.equalsIgnoreCase("Shark"))
                return new Shark();
            else if(str.equalsIgnoreCase("ClownFish"))
                return new ClownFish();
            else
                return new Fish();
        }

        public Animal getInstanceForAnimal(String str){
            if(str.equalsIgnoreCase("Butterfly"))
                return new Butterfly();
            else if(str.equalsIgnoreCase("Caterpillar"))
                return new Caterpillar();
            else if(str.equalsIgnoreCase("Dog"))
                return new Dog();
            else if(str.equalsIgnoreCase("Cat"))
                return new Cat();
            else
                return new Animal();
        }

}
