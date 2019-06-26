
package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.List;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Shelter.*;

import java.util.Collections;
public class Farm {
//    private Field field = new Field();
//
//    public Farm(Field field) {

//        this.field = field;
//    }
    //Include all farm contents.
    private FarmHouse farmHouse;
    private Field field;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private Garage garage;
    private FoodStorage<Tomato> tomatoFoodStorage;
    private FoodStorage<StringBean> stringBeanFoodStorage;
    private FoodStorage<EarOfCorn> earOfCornFoodStorage;
    private FoodStorage<Cucumber> cucumberFoodStorage;
    private FoodStorage<Egg> eggFoodStorage;

    private Barn barn;
    private Market market;

    public Farm(FarmHouse farmHouse, Field field, List<Stable> stables, List<ChickenCoop> chickenCoops, Garage garage) {

        this.farmHouse = farmHouse;
        this.field = field;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.garage = garage;

        tomatoFoodStorage = new FoodStorage<>();
        stringBeanFoodStorage = new FoodStorage<>();
        earOfCornFoodStorage = new FoodStorage<>();
        cucumberFoodStorage = new FoodStorage<>();
        eggFoodStorage = new FoodStorage<>();
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public Garage getGarage() {
        return garage;
    }

    public FoodStorage<Tomato> getTomatoFoodStorage() {
        return tomatoFoodStorage;
    }

    public FoodStorage<StringBean> getStringBeanFoodStorage() {
        return stringBeanFoodStorage;
    }

    public FoodStorage<EarOfCorn> getEarOfCornFoodStorage() {
        return earOfCornFoodStorage;
    }

    public FoodStorage<Cucumber> getCucumberFoodStorage() {
        return cucumberFoodStorage;
    }

    public FoodStorage<Egg> getEggFoodStorage() {
        return eggFoodStorage;
    }

    public Barn getBarn() {
        return barn;
    }

    public Market getMarket() {
        return market;
    }
}


