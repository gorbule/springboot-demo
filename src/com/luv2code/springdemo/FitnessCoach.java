package com.luv2code.springdemo;

public class FitnessCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Take 30 push ups every morning";
    }

    @Override
    public String getDailyFortune() {
        return "Lucky Day For YOU :)";
    }
}
