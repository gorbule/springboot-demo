package com.luv2code.springdemo;

public class MyApp {

    public static void main(String[] args) {

        //create the object
//        Coach theCoach = new BaseballCoach();
//        Coach theCoach = new TrackCoach();
        Coach theCoach = new FitnessCoach();


        //use the objects
//        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
