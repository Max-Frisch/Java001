package com.company.exercism.exercise1;

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int minutes = 40;
        return minutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {

        return expectedMinutesInOven() - minutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int timePerLayer = 2;
        return timePerLayer * layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesAlreadyCooking) {
        return preparationTimeInMinutes(layers) + minutesAlreadyCooking;
    }

}
