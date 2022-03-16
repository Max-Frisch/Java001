package com.company.exercism.exercise1;

public class Main {

    public static void main(String[] args) {

        Lasagna lasagna = new Lasagna();

        System.out.println("The total cooking time for the Lasagna is " + lasagna.expectedMinutesInOven() + "minutes.");
        System.out.println("The remaining cooking time is " + lasagna.remainingMinutesInOven(30) + " minutes.");
        int layers = 2;
        System.out.println("the preparation time for " + layers + " layers is " + lasagna.preparationTimeInMinutes(layers) + " minutes.");
        System.out.println("You are currently working " + lasagna.totalTimeInMinutes(3,20) + " minutes on the dish.");

    }
}
