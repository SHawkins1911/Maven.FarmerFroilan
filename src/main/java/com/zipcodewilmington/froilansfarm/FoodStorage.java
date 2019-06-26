package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.Produce.Edible;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class FoodStorage<T extends Edible>  {
    private Stack<T> foodStorage;

    public FoodStorage(Stack<T> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public FoodStorage() {
    this.foodStorage=new Stack<>();
    }
//    public FoodStorage() {
//        this.foodStorage=new T[100];
//    }

    public void add(T edible) {
        foodStorage.add(edible);

    }

    public void add(T[] edibles) {
        for (T edible : edibles) {
            add(edible);
        }
    }

    public T retrieve() {
        return foodStorage.pop();
    }

    public List<T> getT() {
        return foodStorage;
    }

    public void setT(List<T> t) {
        this.foodStorage = foodStorage;
    }


    public Boolean isEmpty() {
        return foodStorage.isEmpty();
    }


    public Integer itemCount() { return foodStorage.size(); }
}




