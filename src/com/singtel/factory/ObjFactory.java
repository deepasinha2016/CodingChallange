package com.singtel.factory;

import com.singtel.model.*;

public class ObjFactory {
        public Bird getInstanceForBird(String str){

            if(str.equalsIgnoreCase("Duck"))
                return new Duck(true,false);
            else if(str.equalsIgnoreCase("Chicken"))
                return new Chicken(false,false);
            else if(str.equalsIgnoreCase("Rooster"))
                return new Rooster(false,false);
            else
                return new Bird(false,false);

        }

        public Fish getInstanceForFish(String str){
            if(str.equalsIgnoreCase("Shark"))
                return new Shark();
            else if(str.equalsIgnoreCase("ClownFish"))
                return new ClownFish();
            else
                return new Fish();
        }

}
