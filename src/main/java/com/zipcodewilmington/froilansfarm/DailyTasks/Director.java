package com.zipcodewilmington.froilansfarm.DailyTasks;


import com.zipcodewilmington.froilansfarm.Animal.*;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Eggs;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;

import java.util.List;


public class Director {

    private DaysOfWeek day;
    private Farm farm;

    public Director(Farm farm) {
        day = DaysOfWeek.SUNDAY;
        this.farm = farm;
    }

    protected void doDailyActivites() {
        //TODO
        //Froilan and Foilanda:
        Froilan froilan = farm.getFarmHouse().getFroilan();
        Froilanda froilanda = farm.getFarmHouse().getFroilanda();

        //Ride each Horse in the Stable
        List<Stable> stables = farm.getStables();
        for(int i = 0; i < stables.size(); i++) {

            List<Horse> horses = stables.get(i).getStable();

            for(int j = 0; j < horses.size(); j++) {

                Horse horse = horses.get(j);
                froilan.mount(horse);
                froilan.dismount(horse);
                froilanda.mount(horse);
                froilanda.dismount(horse);

            }
        }

        //Feed each Horse 3 ear of Corn
        for(int i = 0; i < stables.size(); i++) {

            List<Horse> horses = stables.get(i).getStable();

            for(int j = 0; j < horses.size(); j++) {

                Horse horse = horses.get(j);
                for(int k = 0; k < 3; k++) {
                    froilan.feedFarmAnimals(horse, farm.getEarOfCornFoodStorage().retrieve());
                    froilanda.feedFarmAnimals(horse, farm.getEarOfCornFoodStorage().retrieve());
                }
            }
        }

        //Froilan eats 1 EarOfCorn 2 Tomato and 5 Egg
        froilan.eatEdible(farm.getEarOfCornFoodStorage().retrieve());
        for(int i = 0; i < 2; i++) {
            froilan.eatEdible(farm.getTomatoFoodStorage().retrieve());
        }
        for(int i = 0; i < 5; i++) {
            froilan.eatEdible(farm.getEggFoodStorage().retrieve());
        }

        //Froilanda eats 2 EarOfCorn 1 Tomato and 2 Egg
        froilanda.eatEdible(farm.getTomatoFoodStorage().retrieve());
        for(int i = 0; i < 2; i++) {
            froilanda.eatEdible(farm.getEarOfCornFoodStorage().retrieve());
            froilanda.eatEdible(farm.getEggFoodStorage().retrieve());
        }

        //Collect Eggs
        List<ChickenCoop> chickenCoops = farm.getChickenCoops();
        for(int i = 0; i < chickenCoops.size(); i++) {
            List<Chicken> chickens = chickenCoops.get(i).getChickenCoop();

            for(int j = 0; j < chickens.size(); j++) {
                farm.getEggFoodStorage().add(chickens.get(j).yield().store());
            }
        }
    }

    protected void doSundayActivites() {
        //TODO
        //Froilan plants 4 different type of Crops in the first, second, third, and fourth row
    }

    protected void doMondayActivites() {
        //TODO
        //Froilanda fertilizes the fields with the CropDuster
    }

    protected void doTuesdayActivites() {
        //TODO
        //Froilan uses the tractor to harvest each Crop in each CropRow
    }

    protected void doWednesdayActivites() {
        //TODO
        //Froilan plants 4 different type of Crops in the first, second, third, and fourth row
    }

    protected void doThursdayActivites() {
        //TODO
        //Froilanda fertilizes the fields with the CropDuster
    }

    protected void doFridayActivites() {
        //TODO
        //Froilan uses the tractor to harvest each Crop in each CropRow
    }

    protected void doSaturdayActivites() {
        //TODO
        //Take excess to market
    }

    protected void nextDay() {

    }


}
