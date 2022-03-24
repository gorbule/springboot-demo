package com.luv2code.springdemo;

public class MyApp {

    public static void main(String[] args) {

        //create the object
//        Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();


        //use the objects
//        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyWorkout());
    }
}
