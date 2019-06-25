package com.zipcodewilmington.froilansfarm.DailyTasks;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Garage;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;

import java.util.LinkedList;
import java.util.List;


public class FarmFactory {

    public static Farm createFarm() {
        return new Farm(
                createFarmHouse(),
                createField(),
                createStables(),
                createChickenCoops(),
                createGarage()
        );
    }

    protected static FarmHouse createFarmHouse() {
        return null;
    }

    protected static Field createField() {
        Field field = new Field();
        field.add(createCropRow("CornStalk"));
        field.add(createCropRow("TomatoPlant"));
        field.add(createCropRow("StringBeanPlant"));
        field.add(createCropRow("CucumberPlant"));
        field.add(createCropRow("CornStalk"));
        return field;
    }

    protected static CropRow createCropRow(String plant) {
        return new CropRow();
    }

    protected static List<ChickenCoop> createChickenCoops() {
        List<ChickenCoop> chickenCoops = new LinkedList<>();
        chickenCoops.add(createChickenCoop(4));
        chickenCoops.add(createChickenCoop(4));
        chickenCoops.add(createChickenCoop(4));
        chickenCoops.add(createChickenCoop(3));
        return chickenCoops;
    }

    protected static ChickenCoop createChickenCoop(Integer numOfChikens) {
        return null;
    }

    protected static List<Stable> createStables() {
        List<Stable> stables = new LinkedList<>();
        stables.add(createStable(4));
        stables.add(createStable(3));
        stables.add(createStable(3));
        return stables;
    }

    protected static Stable createStable(Integer numOfHorses) {
        return null;
    }

    protected static Garage createGarage() {
        return null;
    }
}
