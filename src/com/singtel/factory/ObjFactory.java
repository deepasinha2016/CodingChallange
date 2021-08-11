package com.singtel.factory;

import com.singtel.model.Bird;
import com.singtel.model.Chicken;
import com.singtel.model.Duck;
import com.singtel.model.Rooster;

public class ObjFactory {
        public Bird getInstance(String str){

            if(str.equalsIgnoreCase("Duck"))
                return new Duck(true,false);
            else if(str.equalsIgnoreCase("Chicken"))
                return new Chicken(false,false);
            else if(str.equalsIgnoreCase("Rooster"))
                return new Rooster(false,false);
            else
                return new Bird(false,false);

        }

}
