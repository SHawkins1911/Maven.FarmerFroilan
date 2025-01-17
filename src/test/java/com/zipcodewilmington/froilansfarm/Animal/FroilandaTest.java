package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FroilandaTest {

    @Test
    public void eatEdible() {
        //Given
        Froilanda froilanda = new Froilanda();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible2() {
        //Given
        Froilanda froilanda = new Froilanda();
        Cucumber expected = new Cucumber();
        List<Edible> foodEaten = froilanda.getFoodEaten();



        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible3() {
        //Given
        Froilanda froilanda = new Froilanda();
        Tomato expected = new Tomato();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void eatEdible4() {
        //Given
        Froilanda froilanda = new Froilanda();

        StringBean expected = new StringBean();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible((Edible) expected);

        //Then
        Assert.assertTrue(froilanda.foodEaten.contains(expected));
    }

    @Test
    public void getFoodEaten() {
        //Given
        Froilanda froilanda = new Froilanda();
        EarOfCorn expected = new EarOfCorn();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten2() {
        //Given
        Froilanda froilanda = new Froilanda();
        StringBean expected = new StringBean();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten3() {
        //Given
        Froilanda froilanda = new Froilanda();
        Tomato expected = new Tomato();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void getFoodEaten4() {
        //Given
        Froilanda froilanda = new Froilanda();
        Cucumber expected = new Cucumber();
        List<Edible> foodEaten = froilanda.getFoodEaten();


        //When
        froilanda.eatEdible(expected);

        //Then
        Assert.assertTrue(froilanda.getFoodEaten().contains(expected));
    }

    @Test
    public void makeNoise() {
        //Given
        Froilanda froilanda = new Froilanda();
        String expected = "Welcome to Froilan's farm. I'm Froilanda; the rootinest, tootinest pilot down in these parts!";

        //When
        String actual = froilanda.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}