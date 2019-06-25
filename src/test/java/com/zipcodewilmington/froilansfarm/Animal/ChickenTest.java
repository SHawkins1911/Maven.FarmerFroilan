package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void fertilized() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = new ArrayList<>();
        Boolean expected = foodEaten.isEmpty() == true;

        //When
        Boolean actual = chicken.fertilized();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldEgg() {
        //Given
        Chicken chicken = new Chicken();

        //When
        Egg expected = new Egg();
        Egg actual = chicken.yieldEgg();

        //Then
        Assert.assertNotNull(actual);
    }

    @Test
    public void eatEdible() {
        //Given
        Chicken chicken = new Chicken();
        StringBeans expected = new StringBeans();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);


        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Chicken chicken = new Chicken();
        Tomatoes expected = new Tomatoes();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);

        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Chicken chicken = new Chicken();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);

        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Chicken chicken = new Chicken();
        Cucumbers expected = new Cucumbers();
        List<Edible> foodEaten = chicken.foodEaten;
        foodEaten.add(expected);


        //When
        chicken.eatEdible(expected);

        //Then
        Assert.assertTrue(chicken.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        StringBeans expected = new StringBeans();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        Tomatoes expected = new Tomatoes();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        Cucumbers expected = new Cucumbers();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Chicken chicken = new Chicken();
        List<Edible> foodEaten = chicken.foodEaten;
        EarOfCorn expected = new EarOfCorn();
        foodEaten.add(expected);

        //When

        //Then
        Assert.assertTrue(chicken.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Chicken chicken = new Chicken();
        String expected = "Cluck! Cluck! Cluck-a-luck!";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasEdible() {
        //Given
        Chicken chicken = new Chicken();
        Boolean expected = chicken.fertilized() == true;

        //When
        Boolean actual = chicken.hasEdible();

        //Then
        Assert.assertEquals(expected, actual);
    }
}