package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Froilan;
import com.zipcodewilmington.froilansfarm.Animal.Froilanda;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter {
    List<Farmer> farmHouse = new ArrayList<>();
    Froilan froilan = new Froilan();
    Froilanda froilanda = new Froilanda();

    public FarmHouse() {
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
    }

    public Boolean isEmpty() {
        return farmHouse.isEmpty();
    }

    public void add(Farmer farmer) {
        farmHouse.add(farmer);
    }

    public void remove(Farmer farmer) {
        farmHouse.remove(farmer);
    }

    public Integer itemCount() {

        return farmHouse.size();
    }

    public Froilan getFroilan() {
        return froilan;
    }

    public Froilanda getFroilanda() {
        return froilanda;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}
