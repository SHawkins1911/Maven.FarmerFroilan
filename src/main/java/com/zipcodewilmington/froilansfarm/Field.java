package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class Field {

    private List<CropRow> cropRows;
    private Map<Chicken, ChickenCoop> chickenChickenCoopMap = new HashMap<Chicken, ChickenCoop>();
    private Map<Horse, Stable> horseStableMap = new HashMap<Horse, Stable>();
    private List<FarmVehicle> farmVehicles;
    private List<Aircraft> aircraft;
    private Pilot pilot;

    public Field(List<CropRow> cropRows, Map<Chicken, ChickenCoop> chickenChickenCoopMap, Map<Horse, Stable> horseStableMap, List<FarmVehicle> farmVehicles, List<Aircraft> aircraft, Pilot pilot) {
        this.cropRows = cropRows;
        this.chickenChickenCoopMap = chickenChickenCoopMap;
        this.horseStableMap = horseStableMap;
        this.farmVehicles = farmVehicles;
        this.aircraft = aircraft;
        this.pilot = pilot;
    }

    public Field() {

    }
}
