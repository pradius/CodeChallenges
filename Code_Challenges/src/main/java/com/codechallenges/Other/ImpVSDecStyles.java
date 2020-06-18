package com.codechallenges.Other;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Imperative VS Declarative programming Styles
public class ImpVSDecStyles {
    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList(
                "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );

/*
        //Imperative -----------------------------------
        boolean hasEggs = false;
        for(String ingredient : ingredients){
            if (ingredient.equals("eggs")){
                hasEggs =  true;
                break;
            }
        }
        System.out.println("Has Eggs? " + hasEggs);

        //Declarative--------------------------------
        if (ingredients.contains("eggs")) System.out.println("Has Eggs? " + hasEggs);
*/

/*        //Imperative -----------------------------------
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }

        //Declarative--------------------------

        *//*ingredients.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*//*

        // Declarative ---- Lambda --------------
        ingredients.forEach(ingredient -> System.out.println(ingredient));
        //---------------------------------------
        ingredients.forEach(System.out::println);*/
    }
}
